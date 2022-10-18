package examples.exampleAlgorithms.ExampleAlgorithmsGreedy;

public class ExampleMinStationToRefuel {
    public static void main(String[] args) {
        int [] station = {0, 200, 375, 500, 750, 950};
        System.out.println(minStops(station, 400));
    }

    // return -1 if it's impossible to get from A to B
    public static int minStops(int [] station, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0;

        while ( currentStop < station.length -1) { //currentStop = 0
            int nextStop = currentStop; //

            while (nextStop < station.length -1 &&
                    station[nextStop + 1] - station[currentStop] <= capacity)
                nextStop++; // 4


            if (currentStop == nextStop)
                return -1;

            if (nextStop < station.length - 1)
                result++; //result = 1// result = 2;

            currentStop = nextStop; // currentStop = 1 , nextStop = 1; //currentStop = 2 , nextStop = 2;
        }

        return result;
    }
}
