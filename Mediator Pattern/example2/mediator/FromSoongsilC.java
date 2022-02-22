package mediator;

public class FromSoongsilC extends Colleague{
    public FromSoongsilC(String name){
        this.name = name;
        System.out.println("숭실 계정("+name+")이 준비되었습니다");
//add 숭실 계정이 준비되었습니다. 출력
    }
    @Override
    public void send(String data) {
        mediator.mediate(data, getName());
    }

    @Override
    public void message(String data) {
        System.out.println("숭실 계정("+this.name+")에서 메시지("+data+")를 받았습니다");
//add << soongsil + data 출력
    }
}
