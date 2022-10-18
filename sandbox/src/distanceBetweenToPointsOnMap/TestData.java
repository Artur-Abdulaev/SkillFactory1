package distanceBetweenToPointsOnMap;

import java.io.IOException;

import static distanceBetweenToPointsOnMap.apachePOI.ReadingExcel.ExcelReader;

class TestData {

    static String actualOffice;
    static String potentialOffice;
    static {
        try {
            potentialOffice = ExcelReader("C:/Users/�/Desktop/ExcelForPOI/PotentialOffices.xlsx");
            actualOffice = ExcelReader("C:/Users/�/Desktop/ExcelForPOI/ActualOffices.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String ActualOfficesRawData = actualOffice;
    public static String PotentialOfficesRawData = potentialOffice;


}
