public interface State {
    void attack_btn_clicked(Game game);
    void move_btn_clicked(Game game, int x, int y);
    void stop_btn_clicked(Game game);
    void drink_btn_clicked(Game game);
}
