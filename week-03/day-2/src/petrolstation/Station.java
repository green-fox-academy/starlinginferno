package petrolstation;

public class Station {

    int stationGas;

    public static void main(String[] args) {
        Car bmw = new Car();
        Station station = new Station();

        for (int i = 0; i < bmw.capacity; i++) {
            station.reFill(bmw);
        }
        System.out.println(bmw.gasAmount);
        System.out.println(station.stationGas);
    }

    public Station() {
        this.stationGas = 1000;
    }

    public void reFill(Car x) {
        x.reFill();
        stationGas--;
    }
}
