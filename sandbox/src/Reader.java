import distanceBetweenToPointsOnMap.apachePOI.ReadingExcel;

import java.io.IOException;

public class Reader {
    public static void main(String[] args) {

        StringBuilder s;
        try {
            s = ReadingExcel.excelReaderActualOffices("C:/Users/À/Desktop/ExcelForPOI/ActualOfficesTest.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s);
    }
}
