public class Stop_State implements State{
    public Stop_State() {
        System.out.println("현재 상태 : 정지 상태");
    }
    @Override
    public void attack_btn_clicked(Game game) {
        System.out.println(">> 공격 시작");
        game.setState(new Attack_State());
    }

    @Override
    public void move_btn_clicked(Game game, int x, int y) {
        System.out.println(">> 이동 시작");
        game.setState(new Move_State(x, y));

    }

    @Override
    public void stop_btn_clicked(Game game) {
        System.out.println(">> 계속해서 정지 상태");
        game.setState(new Stop_State());

    }

    @Override
    public void drink_btn_clicked(Game game) {
        System.out.println(">> 포션 복용 시작");
        game.setState(new Drink_State());

    }
}
