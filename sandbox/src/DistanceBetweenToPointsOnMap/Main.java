package DistanceBetweenToPointsOnMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static DistanceBetweenToPointsOnMap.GPSHelper.GetDistanceBetweenArraysGPS;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> agentPointsLongMap1 = new HashMap<>();
        Map<String, Double> agentPointsLatMap1 = new HashMap<>();
        Map<String, Double> agentPointsLongMap2 = new HashMap<>();

//        agentPointsLongMap1.put("Москва, Харьковская улица, 2", 37.652966);
//        agentPointsLongMap1.put("Московская область, Ленинский район, посёлок Совхоз имени Ленина, 17к3", 37.729467);
//        agentPointsLongMap1.put("Московская область, Мытищи, улица Мира, 9", 37.733491);
//        agentPointsLongMap1.put("Москва, Митинская улица, 40к3", 37.361085);
//        agentPointsLongMap1.put("Москва, Минская, 20к1", 37.483490);
//
//        agentPointsLatMap1.put("Москва, Харьковская улица, 2", 55.587845);
//        agentPointsLatMap1.put("Московская область, Ленинский район, посёлок Совхоз имени Ленина, 17к3", 55.585825);
//        agentPointsLatMap1.put("Московская область, Мытищи, улица Мира, 9", 55.911123);
//        agentPointsLatMap1.put("Москва, Митинская улица, 40к3", 55.847700);
//        agentPointsLatMap1.put("Москва, Минская, 20к1", 55.742149);

        //



        double[] arrayLongitude1 = {37.652966, 37.729467, 37.733491, 37.645485 };
        double[] arrayLatitude1 = {55.587845, 55.585825, 55.911123, 55.583778};
        double arrayLongitude2 = 37.640291;
        double arrayLatitude2 = 55.586807;




        List dist = GetDistanceBetweenArraysGPS(arrayLongitude1, arrayLatitude1, arrayLongitude2, arrayLatitude2);

        for (int i = 0; i < dist.size(); i++) {
            if ((double) dist.get(i) >300) {
                double a = (double) dist.get(i);
                System.out.println(a);
            }
        }

    }
}
