package mediator;

public class FromDaum extends Colleague{
    public FromDaum(String name){
        this.name = name;
        System.out.println(name + " Daum 계정 회원이 등록되었습니다.\n");
    }

    @Override
    public void send(String data) { mediator.mediate(data, this.getName()); }

    @Override
    public void message(String data){
        System.out.println("Daum << " + data + "\n");
    }
}
