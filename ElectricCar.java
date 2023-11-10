public class ElectricCar extends ACar {


    private int maxRange;
    private int batteryCapacity;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,int maxRange,int batteryCapacity) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }


    public int getBatteryCapacityKWh(){

        return batteryCapacity;

    }

    public int getMaxRangeKm(){

        return maxRange;

    }

    public int getWhPrKm(){

        int WhPerKm;

        WhPerKm = batteryCapacity*1000/maxRange;

        return WhPerKm;
    }

    public int getRegistrationFee(){

        double ElFee = 100 /(getWhPrKm()/91.25);


        if (ElFee <= 50 && ElFee >= 20) {
            return 330;
        } else if (ElFee <= 20 && ElFee >= 15) {
            return 1050;
        } else if (ElFee<=15 && ElFee>=10) {
            return 2340;
        }else if(ElFee<=10 && ElFee>=5){
            return 5500;
        } else {
            return 10470;
        }
    }
    @Override
    public String toString(){

        return super.toString() + ", Maximum range: "+getMaxRangeKm() + "km, Battery Capacity: "+getBatteryCapacityKWh() + " kWh";






    }

}
