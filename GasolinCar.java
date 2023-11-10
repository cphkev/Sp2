public class GasolinCar extends AFuelCar {


    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }




    public String getFuelType(){

        return "Gasoline";
    }

    public int getRegistrationFee() {

        if (getKmPrLitre() <= 50 && getKmPrLitre() >= 20) {
            return 330;
        } else if (getKmPrLitre() <= 20 && getKmPrLitre() >= 15) {
            return 1050;
        } else if (getKmPrLitre()<=15 && getKmPrLitre()>=10) {
            return 2340;
        }else if(getKmPrLitre()<=10 && getKmPrLitre()>=5){
            return 5500;
        } else {
            return 10470;
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
