package distanceBetweenToPointsOnMap;

import distanceBetweenToPointsOnMap.apachePOI.WritingExcel;

import java.io.IOException;
import java.util.ArrayList;

public class MainEntryPoint {
    public static void main(String[] args) {
        ArrayList<OfficeAddress> actual = DataParser.parseData(TestData.ActualOfficesRawData);
        ArrayList<OfficeAddress> potential = DataParser.parseData(TestData.PotentialOfficesRawData);

        ArrayList<DistanceData> calculatedData = new ArrayList<>();
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < potential.size(); j++) {
                calculatedData.add(new DistanceData(actual.get(i), potential.get(j)));
            }
        }

        ArrayList<DistanceData> finalData = new ArrayList<>();

        for (int i = 0; i < potential.size(); i++) {
            double min = Integer.MAX_VALUE;
            int minElementIndex = -1;
            String potentialOfficesAddress = potential.get(i).Address;

            for (int j = 0; j < calculatedData.size(); j++) {
                if (!calculatedData.get(j).Potential.Address.equals(potentialOfficesAddress))
                    continue;

                if (calculatedData.get(j).Distance < min) {
                    min = calculatedData.get(j).Distance;
                    minElementIndex = j;
                }
            }

            finalData.add(calculatedData.get(minElementIndex));


//        for (int i = 0; i < actual.size(); i++) {
//            String potentialOfficesAddress = actual.get(i).Address;
//            System.out.println(calculatedData.stream().filter(a -> a.Actual.Address.equals(potentialOfficesAddress)).sorted().toArray()[0]);
//        }
        }

        Object[][] dataForWrite = convertTo2DArray(finalData);

        try {
            WritingExcel.excelWriter(dataForWrite, "C:/Users/А/Desktop/ExcelForPOI/Results.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object[][] convertTo2DArray(ArrayList<DistanceData> list) {
        Object[][] obj = new Object[list.size() + 1][4];
        obj[0][0] = "Адрес предлагаемого объекта";
        obj[0][1] = "Расстояние до ближайшего ОПС, в метрах";
        obj[0][2] = "Адрес ближайшего ОПС";
        obj[0][3] = "Подходит?";

        for (int i = 0; i < list.size(); i++) {
            obj[i + 1][0] = list.get(i).Potential.Address;
            obj[i + 1][1] = list.get(i).Distance;
            obj[i + 1][2] = list.get(i).Actual.Address;
            obj[i + 1][3] = list.get(i).Solution;
        }

        return obj;
    }

}

