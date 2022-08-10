package DistanceBetweenToPointsOnMap;

import java.util.ArrayList;

public class GPSHelper {
    // ��
    public static final double PI = 3.14159265358979324;
    // �������������� ������ (�)
    private static final  double EARTH_RADIUS = 6378137;


    /**
     * ������������� � ������� (���)
     * */
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
    /**
     * �� ������ ��������� � googleMap ��� ��������� ���������� ����� ����� ������� � ��������,
     * �������� ������� ���������� �������� ���������� � Google Maps, � �������� ������� ���������� ����� 0,2 �����.
     * @param lon1 ������� ������ �����
     * @param lat1 ������ ������ �����
     * @param lon2 ������� ������ �����
     * @param lat2 ������ ������ �����
     * @return ���������� ���������� � ��
     * */
   /* public static double GetDistance(double lon1,double lat1,double lon2, double lat2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lon1) - rad(lon2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        //s = Math.round(s * 10000) / 10000;
        return s;
    } */

    //������

    public static ArrayList<Double> GetDistanceBetweenArraysGPS (double[] lon1, double[]lat1, double lon2, double lat2) {
        ArrayList<Double> arrDistance = new ArrayList<>();
        for ( int i = 0; i < lon1.length; i++) {
            double radLat1 = rad(lat1[i]);
            double radLat2 = rad(lat2);
            double a = radLat1 - radLat2;
            double b = rad(lon1[i]) - rad(lon2);
            double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
            s = s * EARTH_RADIUS;
            //s = Math.round(s * 10000) / 10000;
            arrDistance.add(s);
        }
        return (arrDistance);
    }
}
