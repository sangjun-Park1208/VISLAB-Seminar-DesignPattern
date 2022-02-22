package mediator;

public class FromSoongsilB extends Colleague{
    public FromSoongsilB(String name){
        this.name = name;
        System.out.println(this.name + " 숭실 계정이 준비됐습니다.");
//add 숭실 계정이 준비되었습니다. 출력
    }
    @Override
    public void send(String data) {
        mediator.mediate(data, getName());
    }

    @Override
    public void message(String data) {
//add << soongsil + data 출력
        System.out.println("Soongsil << " + data + "\n");
    }
}
