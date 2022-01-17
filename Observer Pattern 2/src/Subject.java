public interface Subject {
    void registerObserver(Observer observer); // 옵저버 등록
    void removeObserver(Observer observer); // 옵저버 삭제
    void notifyObserver(); // 옵저버에게 업데이트 알림
}
