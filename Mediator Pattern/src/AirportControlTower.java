import java.util.ArrayList;
import java.util.List;

public class AirportControlTower implements Mediator {
    private List<Aircraft> aircraftList;

    public AirportControlTower(){
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        this.aircraftList.add(aircraft);
        System.out.println("==== 항공기 리스트 ====");
        for(Aircraft a: this.aircraftList){
            System.out.println(a.name + "");
        }
        System.out.println("=====================\n리스트에 " + aircraft.name + "이 추가 되었습니다.\n\n");
    }
    @Override
    public void sendMessage(Aircraft from, String msg, Aircraft aircraft) { // 추가
        System.out.println("관제탑에서 전송 중 . . . \n");
        from.receive(msg, aircraft);
    }

    @Override
    public void sendtoAllMessage(String msg, Aircraft aircraft) {
        System.out.println("관제탑에서 전송 중 . . . \n");
        for(Aircraft a : this.aircraftList) {
            if(a != aircraft){
                a.receive(msg, aircraft);
            }
        }
    }
}
