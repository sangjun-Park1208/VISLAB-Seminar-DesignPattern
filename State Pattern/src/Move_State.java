public class Move_State implements State{
    int x, y;

    public Move_State(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("현재 상태 : 이동 중");
    }

    @Override
    public void attack_btn_clicked(Game game) {
        System.out.println(">> 이동 중 공격하기");
        game.setState(new Stop_State());
        game.setState(new Attack_State());
    }

    @Override
    public void move_btn_clicked(Game game, int x, int y) {
        System.out.println(">> 새로운 지점으로 이동");
        game.setState(new Move_State(x, y));
    }

    @Override
    public void stop_btn_clicked(Game game) {
        System.out.println(">> 이동 정지");
        game.setState(new Stop_State());
    }

    @Override
    public void drink_btn_clicked(Game game) {
        System.out.println(">> 이동 정지 후 포션 복용");
        game.setState(new Stop_State());
        game.setState(new Drink_State());
    }
}
