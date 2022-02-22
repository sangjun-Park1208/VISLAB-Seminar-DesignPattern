package mediator;

public class FromSoongsilA extends Colleague{
    public FromSoongsilA(String name){
        this.name = name;
        System.out.println("숭실 계정이 준비되었습니다.");
//add 숭실 계정이 준비되었습니다. 출력
    }
    @Override
    public void send(String data) {
        mediator.mediate(data, getName());
    }

    @Override
    public void message(String data) {
        System.out.println(this.name+"으로부터 "+data);
//add << soongsil + data 출력
    }
}
