public abstract class AFuelCar extends ACar {



    private int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors,int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }


    public String getFuelType(){

        return "Diesel";
    }



    public int getKmPrLitre(){

        return kmPrLitre;

    }


    @Override
    public String toString(){

        return super.toString() + ", Fuel Type: " +getFuelType() + ", Km per liter: " + getKmPrLitre();

    }

}
