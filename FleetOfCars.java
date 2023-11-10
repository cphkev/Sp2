import java.util.ArrayList;
public class FleetOfCars {

    private ArrayList<Car>fleet = new ArrayList<>();





    public void addCar(Car car){

        fleet.add(car);

    }




    public int getTotalRegistrationFeeForFleet(){
        int totalFeeForFleet=0;

        for (Car cars:fleet) {

            totalFeeForFleet +=cars.getRegistrationFee();
        }
        return totalFeeForFleet;

    }

    @Override
    public String toString() {
        String fleetDetails = "";
        for (Car car : fleet) {
            fleetDetails = fleetDetails.concat(car.toString() + "\n");
        }
        return fleetDetails;
    }








}
