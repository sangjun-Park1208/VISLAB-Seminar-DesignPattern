package mediator;

public class FromGoogle extends Colleague{
    public FromGoogle(String name){
        this.name = name;
        System.out.println(name + " Google 계정 회원이 등록되었습니다.\n");
    }

    @Override
    public void send(String data) {
        mediator.mediate(data, this.getName());
    }

    @Override
    public void message(String data){
        System.out.println("Google << " + data + "\n");
    }
}
