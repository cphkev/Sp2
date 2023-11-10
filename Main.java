public class Main {

    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        DieselCar dieselCar = new DieselCar("KEV551","VOLVO","SUPER SUPER FAST",2,32,true);
        ElectricCar electricCar = new ElectricCar("LOL818","BUGATTI","VEYRON",2,200,30);
        GasolinCar gasolinCar = new GasolinCar("HAD312","CHEVROLET","CORVETTE",2,29);

        fleet.addCar(dieselCar);
        fleet.addCar(electricCar);
        fleet.addCar(gasolinCar);

        System.out.println("Details of the fleet:\n" + fleet);
        System.out.println("Total price of fleet:\n" +fleet.getTotalRegistrationFeeForFleet());
    }
}