package mediator;

public class FromNaver extends Colleague{
    public FromNaver(String name){
        this.name = name;
        System.out.println(name + " Naver 계정 회원이 등록되었습니다.\n");
    }

    @Override
    public void send(String data){
        this.mediator.mediate(data, this.name);
    }

    @Override
    public void message(String data){
        System.out.println("Naver << " + data + "\n");
    }
}
