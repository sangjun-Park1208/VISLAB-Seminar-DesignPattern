public class Attack_State implements State{
    public Attack_State() {
        System.out.println("현재 상태 : 공격 중");
    }

    @Override
    public void attack_btn_clicked(Game game) {
        System.out.println(">> 한 번 더 공격");
        game.setState(new Attack_State());
    }

    @Override
    public void move_btn_clicked(Game game, int x, int y) {
        System.out.println(">> 공격 중에 움직이기");
        game.setState(new Stop_State());
        game.setState(new Move_State(x, y));
    }

    @Override
    public void stop_btn_clicked(Game game) {
        System.out.println(">> 공격 중지");
        game.setState(new Stop_State());
    }

    @Override
    public void drink_btn_clicked(Game game) {
        System.out.println(">> 공격 중엔 포션을 복용 할 수 없음");
        game.setState(new Attack_State());
    }
}
