package distanceBetweenToPointsOnMap;

import java.util.ArrayList;

class DataParser {
    public static ArrayList<OfficeAddress> parseData(String data) {
        ArrayList<OfficeAddress> result = new ArrayList<>();
        for (String s : data.split("\n")) {
            String[] officeSplitedData = s.split("\t");
            result.add(new OfficeAddress(
                    officeSplitedData[0],
                    Double.parseDouble(officeSplitedData[1]),
                    Double.parseDouble(officeSplitedData[2])));
        }
        return result;
    }
}