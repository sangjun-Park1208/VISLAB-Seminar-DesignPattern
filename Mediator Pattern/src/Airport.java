public class Airport {
    public static void main(String[] args) {
        Mediator mediator = new AirportControlTower();

        Aircraft boeing747_a = new Boeing747(mediator, "boeing747_a");
        Aircraft f22_b = new F22(mediator, "f22_b");
        Aircraft airbus320_c = new AirBus320(mediator, "airbus320_c");

        mediator.addAircraft(boeing747_a);
        mediator.addAircraft(f22_b);
        mediator.addAircraft(airbus320_c);

        boeing747_a.send(boeing747_a, "15:50분 부로 이륙 예정이다.\n", f22_b);
        airbus320_c.send(airbus320_c, "현재 몇 번 게이트 쪽에 있는지?\n", boeing747_a);
        f22_b.sendToAll("17:00 기준 인천공항 상공이다.\n");
    }
}
