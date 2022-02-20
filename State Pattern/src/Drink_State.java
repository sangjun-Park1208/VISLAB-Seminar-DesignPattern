public class Drink_State implements State{
    public Drink_State() {
        System.out.println("현재 상태 : 포션 복용 중");
    }
    @Override
    public void attack_btn_clicked(Game game) {
        System.out.println(">> 포션 복용 정지 후 공격 시작");
        game.setState(new Stop_State());
        game.setState(new Attack_State());
    }

    @Override
    public void move_btn_clicked(Game game, int x, int y) {
        System.out.println(">> 포션 복용 정지 후 이동 시작");
        game.setState(new Stop_State());
        game.setState(new Move_State(x, y));
    }

    @Override
    public void stop_btn_clicked(Game game) {
        System.out.println(">> 포션 복용 정지");
        game.setState(new Stop_State());
    }

    @Override
    public void drink_btn_clicked(Game game) {
        System.out.println(">> 이미 포션을 복용 중임");
        game.setState(new Drink_State());
    }
}
