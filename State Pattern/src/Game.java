public class Game { // Context
    private State state;
    public Game() {
        state = new Stop_State(); // 기본 상태
    }

    public void setState(State state) {
        this.state = state;
    }

    public void attack_btn_clicked(){
        state.attack_btn_clicked(this);
    }
    public void move_btn_clicked(int x, int y) {
        state.move_btn_clicked(this, x, y);
    }
    public void stop_btn_clicked(){
        state.stop_btn_clicked(this);
    }
    public void drink_btn_clicked() {
        state.drink_btn_clicked(this);
    }

}
