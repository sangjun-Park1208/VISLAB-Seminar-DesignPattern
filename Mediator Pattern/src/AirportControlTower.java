import java.util.ArrayList;
import java.util.List;

public class AirportControlTower implements Mediator {
    private List<Aircraft> aircraftList; // 관제탑에서 관리할 비행기 목록.

    public AirportControlTower(){
        this.aircraftList = new ArrayList<>();
    }


    @Override
    public void addAircraft(Aircraft aircraft) { // 관제탑에서 관리하는 실제 항공기 목록에 추가.
        this.aircraftList.add(aircraft);
        System.out.println("==== 항공기 리스트 ====\n");
        for(Aircraft a: this.aircraftList){
            System.out.println(a.name + "\n");
        }
        System.out.println("=====================\n리스트에 " + aircraft.name + "이 추가 되었습니다.\n\n");

    }

    @Override
    public void sendMessage(String msg, Aircraft aircraft) { // 어떤 종류의 항공기에 어떤 메세지를 보낼 것인지.
        for(Aircraft a : this.aircraftList) {
            if(a != aircraft){ // 메세지를 보낸 자신을 제외한 다른 비행기들에게 전송. 필요에 맞게 커스텀
                a.receive(msg, aircraft);
            }
        }
    }

}
