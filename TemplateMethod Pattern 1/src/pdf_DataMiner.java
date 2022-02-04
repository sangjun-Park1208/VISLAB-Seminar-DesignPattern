public class pdf_DataMiner extends DataMiner{
    @Override
    String extractData(String file) throws InterruptedException {
        System.out.println(".pdf 확장자 파일에서 데이터 추출 중..\n");
        Thread.sleep(500);
        return file;
    }

    @Override
    String parseData(String rawData) throws InterruptedException {
        System.out.println(".pdf 파일을 parsing 하는 중..\n");
        Thread.sleep(500);
        return rawData;
    }
}
