public class MainClass {
    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber annualSubscriber = new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.setNewsInfo("오늘의 날씨",
                "-3°C\n" + "강수확률: 1%\n" + "습도: 40%\n" + "풍속: 2m/s\n");

        newsMachine.setNewsInfo("2022 대선 지지율",
                " 윤석열 40.6%\n 이재명 36.7%\n 안철수 12.9%\n 심상정 2.0%\n");

        newsMachine.setNewsInfo("KOSPI",
                "2,888.60\n" +
                "−33.32 (1.14%)오늘\n");


        annualSubscriber.unSubscribe();
        newsMachine.setNewsInfo("오늘의 날씨",
                "-3°C\n" + "강수확률: 1%\n" + "습도: 40%\n" + "풍속: 2m/s\n");

        newsMachine.setNewsInfo("2022 대선 지지율",
                " 윤석열 40.6%\n 이재명 36.7%\n 안철수 12.9%\n 심상정 2.0%\n");

        newsMachine.setNewsInfo("KOSPI",
                "2,888.60\n" +
                        "−33.32 (1.14%)오늘");


        eventSubscriber.unSubscribe();
        newsMachine.setNewsInfo("오늘의 날씨",
                "-3°C\n" + "강수확률: 1%\n" + "습도: 40%\n" + "풍속: 2m/s\n");

        newsMachine.setNewsInfo("2022 대선 지지율",
                " 윤석열 40.6%\n 이재명 36.7%\n 안철수 12.9%\n 심상정 2.0%\n");

        newsMachine.setNewsInfo("KOSPI",
                "2,888.60\n" +
                        "−33.32 (1.14%)오늘");
    }
}
