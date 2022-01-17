public class MainClass {
    public static void main(String[] args) {
       ShoppingMall shoppingMall = new ShoppingMall();
       ShoppingMall_Subscriber subscriberA = new ShoppingMall_Subscriber(shoppingMall, "subscriberA");
       ShoppingMall_Subscriber subscriberB = new ShoppingMall_Subscriber(shoppingMall, "subscriberB");
       ShoppingMall_Subscriber subscriberC = new ShoppingMall_Subscriber(shoppingMall, "subscriberC");


       shoppingMall.setMerchandise("아이폰13프로", 1300000,
               "극적으로 향상된 강력한 카메라 시스템.\n5G.\n시네마틱 모드.\nSuper Retina XDR.\nA15 Bionic 칩.\n울트라 와이드 카메라.\n\n");

//       shoppingMall.setMerchandise("갤럭시Z플립3", 1000000,
//               "하드웨어 강화.\n생체인식 및 블록체인 키스토어 기능.\n슈퍼슬로우 모션 카메라.\n비스포크 에디션.\n\n");


    }
}
