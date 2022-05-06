public class Flying extends Vehicle{
    boolean isFlying;
    float wingspan;

    //constructor
    public Flying(){
        make=" ";
        model=" ";
        year=0;
        weight=0;
        needsMaintenance=false;
        tripsSinceMaintenance=0;
    }

    //setters
    public void isFlying(){
        if(!needsMaintenance)
            isFlying=true;
        else
            System.out.println("CANT FLY \n");
    }

    public void land(){
        isFlying=false;
        tripsSinceMaintenance++;
        if(tripsSinceMaintenance>80){
            needsMaintenance=true;

        }
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }
}
