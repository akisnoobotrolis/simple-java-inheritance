public class Main {
    public static void Main(String[] args){
        Car nissan= new Car("nissan","almera",2002,2000);
        Car renault=new Car("renault","clio", 2014,2000);
        Car fiat= new Car("fiat", "punto", 2009,1500);
        fiat.drive();
        for(int i=0;i<20; i++)
            nissan.drive();
        for (int i=0;i<=100;i++)
            fiat.drive();
        System.out.println("make: "+ nissan.make +"\n");
        System.out.println("model: "+nissan.model+"\n");
        System.out.println("year: "+nissan.year+"\n");
        System.out.println("weight: "+nissan.weight+"\n");
        System.out.println("is driving: "+nissan.isDriving+"\n");
        System.out.println("needs maintenance: "+nissan.needsMaintenance+"\n");
        System.out.println("horse power: "+nissan.make);

        Flying boeing=new Flying();
        Flying aero=new Flying();
        Flying sth=new Flying();

    }
}
