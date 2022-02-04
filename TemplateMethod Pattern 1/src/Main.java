public class Main {

    public static void main(String[] args) throws InterruptedException {
        DataMiner docx_dataMiner = new docx_DataMiner();
        DataMiner pdf_dataMiner = new pdf_DataMiner();
        DataMiner csv_dataMiner = new csv_DataMiner();

        docx_dataMiner.mine("//:C/Desktop/myfile/docxFile");
        pdf_dataMiner.mine("//:C/Desktop/myfile/pdfFile");
        csv_dataMiner.mine("//:C/Desktop/myfile/csvFile");

//        docx_dataMiner.mine(null);
    }
}
