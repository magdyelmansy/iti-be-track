
interface Machine {
    String start();
}




 class Appliance implements Machine{
    String name;
    Appliance(String name) {
        this.name = name;
    }
    public String start(){
        return "";
    };
}




class Fan extends Appliance {
    Fan(String name) {
        super(name);
    }

    @Override
   public String start() {
        return "Fan is running";
    }
}



class WashingMachine extends Appliance {
    WashingMachine(String name) {
        super(name);
    }
    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}


public class Exercise8 {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");

        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}