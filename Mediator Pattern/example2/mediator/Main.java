package mediator;

public class Main {
    public static void main(String[] args) {
        SendMessage m1 = new SendMessage();
        // 아래에 새롭게 만든 중재자 객체 생성하기
        // 생성후 중재자에 들어갈 고객들은 중재자에 등록하고 해당 중재자에 요청보내려면 고객 내 중재자를 새 중재자로 등록할 것
        SendSecretSignalB sendSecretSignalB = new SendSecretSignalB("abc123");
        SendSecretSignalC sendSecretSignalC = new SendSecretSignalC("abc123");
        SendSecretSignalA sendSecretSignalA = new SendSecretSignalA("abc123");

        FromNaver c1 = new FromNaver("홍산");
        c1.setMediator(m1);
        m1.addColleague(c1);
        sendSecretSignalC.addColleague(c1);

        FromDaum c2 = new FromDaum("박상준");
        c2.setMediator(m1);
        m1.addColleague(c2);
        sendSecretSignalC.addColleague(c2);

        FromGoogle c3 = new FromGoogle("김찬일");
        c3.setMediator(m1);
        m1.addColleague(c3);
        sendSecretSignalC.addColleague(c3);

        FromGoogle c4 = new FromGoogle("곽규한");
        c4.setMediator(m1);
        m1.addColleague(c4);
        sendSecretSignalC.addColleague(c4);

        // 아래에 숭실 계정 사용자 객체 만들기 Ђ��C
//        FromSoongsilB s2 = new FromSoongsilB("kyu");
//        s2.setMediator(sendSecretSignalB);
//        sendSecretSignalB.addColleague(s2);
//        s2.send("sendsend");
//        s2.send("abc123");
//
//        FromSoongsilC s3 = new FromSoongsilC("abc123");
//        s3.setMediator(sendSecretSignalC);
//        s3.send("abc123");
//        s3.send("123123");

        FromSoongsilA s1= new FromSoongsilA("chan");
       s1.setMediator(sendSecretSignalA);
       sendSecretSignalA.addColleague(s1);
       sendSecretSignalA.addColleague(c1);
       sendSecretSignalA.addColleague(c2);
       sendSecretSignalA.addColleague(c3);
       s1.send("abc123");


//        c3.send("Hello everyone! my name is " + c3.getName());
//        c4.send("qlalfqjsgh");


    }
}
