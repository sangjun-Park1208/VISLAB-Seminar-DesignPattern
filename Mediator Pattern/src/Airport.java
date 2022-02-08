public class Airport {
    public static void main(String[] args) {
        Mediator mediator = new AirportControlTower();

        Aircraft boeing747_a = new Boeing747(mediator, "boeing747_a");
        Aircraft f22_b = new F22(mediator, "f22_b");
        Aircraft airbus320_c = new AirBus320(mediator, "airbus320_c");

        mediator.addAircraft(boeing747_a);
        mediator.addAircraft(f22_b);
        mediator.addAircraft(airbus320_c);

        boeing747_a.send("15:50분 부로 이륙 예정이다.\n");
        f22_b.send("17:00 기준 인천공항 상공이다.\n");
    }
}
