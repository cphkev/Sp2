public class DieselCar extends AFuelCar {

    private boolean particleFilter;
    int ParticleFee = 1000;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter=particleFilter;
    }


    @Override
    public String getFuelType() {

        return "Disel";

    }

    public boolean hasParticleFilter() {

        return particleFilter;
    }

    public int getRegistrationFee() {

        if (getKmPrLitre() <= 50 && getKmPrLitre() >= 20) {
            return 330+130+ParticleFee;
        } else if (getKmPrLitre() <= 20 && getKmPrLitre() >= 15) {
            return 1050+1390+ParticleFee;
        } else if (getKmPrLitre() <= 15 && getKmPrLitre() >= 10) {
            return 2340+1850+ParticleFee;
        } else if (getKmPrLitre() <= 10 && getKmPrLitre() >= 5) {
            return 5500+2770+ParticleFee;
        } else {
            return 10470+15260+ParticleFee;
        }
    }


    @Override
    public String toString() {

        return super.toString() + ", Has Particle Filter: "+(hasParticleFilter() ? "Yes" : "No");
    }





}