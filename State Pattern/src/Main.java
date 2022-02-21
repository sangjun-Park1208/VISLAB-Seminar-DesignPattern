import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("======= 게임을 시작합니다 =======");
        System.out.println("a: 공격\ns: 포션 복용\nd: 정지\nf: 이동(x, y)\nx: 게임 종료");
        Game game = new Game();
        while(true){
            char ch = sc.nextLine().charAt(0);
            switch (ch){
                case 'a':
                    game.attack_btn_clicked();
                    break;
                case 's':
                    game.drink_btn_clicked();
                    break;
                case 'd':
                    game.stop_btn_clicked();
                    break;
                case 'f':
                    System.out.println("이동할 좌표 입력(x, y)");
                    int tmpx = sc1.nextInt();
                    int tmpy = sc1.nextInt();
                    game.move_btn_clicked(tmpx, tmpy);
                    break;
                case 'x':
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("a, s, d, f 중에 입력하세요");
                    break;
            }
        }
    }
}