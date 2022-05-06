public class Vehicle {
    //attributes
    String make=new String();
    String model=new String();
    int year;
    int weight;
    boolean needsMaintenance;
    int tripsSinceMaintenance;


    //constructors
    public Vehicle(){
        make=" ";
        model=" ";
        year=0;
        weight=0;
        needsMaintenance=false;
        tripsSinceMaintenance=0;
    }

    public Vehicle(String mk, String mdl, int yr, int w8){
        make=mk;
        model=mdl;
        year=yr;
        weight=w8;
        needsMaintenance=false;
        tripsSinceMaintenance=0;
    }

    //setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNeedsMaintenance(boolean needsMaintenance) {
        this.needsMaintenance = needsMaintenance;
    }

    public void setTripsSinceMaintenance(int tripsSinceMaintenance) {
        this.tripsSinceMaintenance = tripsSinceMaintenance;
    }

    public void repair(){
        tripsSinceMaintenance=0;
        needsMaintenance=false;
    }

    public boolean isNeedsMaintenance() {
        return needsMaintenance;
    }

    public int getTripsSinceMaintenance() {
        return tripsSinceMaintenance;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}


