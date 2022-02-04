public abstract class DataMiner {
     void mine(String dataPath) throws InterruptedException {
        String file = openFile(dataPath);
        String rawData = extractData(file);
        String data = parseData(rawData);
        String analysis = analysisData(data);
        sendReport(analysis);
        closeFile(file);
     }

     String openFile(String dataPath) throws InterruptedException {
         System.out.println("파일을 여는 중..\n");
         Thread.sleep(1000);
         return dataPath;
     }

     abstract String extractData(String file) throws InterruptedException;
     abstract String parseData(String rawData) throws InterruptedException;

     String analysisData(String data) throws InterruptedException {
         if(data != null){
             System.out.println("데이터를 분석하는 중..\n");
             Thread.sleep(1500);
             System.out.println("데이터 분석 완료 !\n");
             return data;
         }
         else{
             System.out.println("해당 데이터가 존재하지 않습니다. 프로그램을 종료합니다.");
             System.exit(-1);
             return null;
         }
     }

     void sendReport(String analysis) throws InterruptedException {
         System.out.println("분석된 파일을 전송합니다\n");
         Thread.sleep(500);
     }

     void closeFile(String file){
         System.out.println("파일을 종료합니다.\n===================\n");
     }

}
