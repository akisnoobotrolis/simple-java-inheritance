public class Car  extends Vehicle{
    // attributes

    boolean isDriving;
    int horsepower;

    //constructor
    public Car(String mk, String mdl, int yr, int w8, int hp){
        make=mk;
        model=mdl;
        year=yr;
        weight=w8;
        needsMaintenance=false;
        tripsSinceMaintenance=0;
        horsepower=hp;
    }

    //setters
    public void drive(){
        isDriving=true;
        tripsSinceMaintenance++;
        if (tripsSinceMaintenance==100){
            needsMaintenance=true;
        }
    }
    public void stop(){
        isDriving=false;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
