public interface Mediator { // 관제탑 : 중재자로서 메세지 송수신 역할 담당.
    void sendtoAllMessage(String msg, Aircraft aircraft); // 이름 수정 - 리팩터링
    void addAircraft(Aircraft aircraft);
    void sendMessage(Aircraft from, String msg, Aircraft aircraft); // 추가
}
