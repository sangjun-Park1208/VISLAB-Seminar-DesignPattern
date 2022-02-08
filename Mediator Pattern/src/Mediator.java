public interface Mediator { // 관제탑 : 중재자로서 메세지 송수신 역할 담당.
    void sendMessage(String msg, Aircraft aircraft);
    void addAircraft(Aircraft aircraft);
}
