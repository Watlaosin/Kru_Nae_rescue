public class Main {
    public static void main(String[] args){

        //Input
        Robot Monkol = new Robot("Monkol");
        Monkol.moveFoward(4);
        Monkol.rotate(90);
        Monkol.moveFoward(4);


        Wheeledrobot Somsri = new Wheeledrobot("Somsri",2,0.1);
        Somsri.rotate(90);
        Somsri.moveFoward(6);
        Somsri.rotate(-90);
        Somsri.moveFoward(2);


        Wheeledrobot Somsak = new Wheeledrobot("Somsak",2,0.2);
        Somsak.rotate(90);
        Somsak.moveFoward(3);
        Somsak.rotate(-90);
        Somsak.moveFoward(1);


        //Output
        System.out.println(Somsak.getLocation());
        System.out.printf("Wear level: %.2f\n\n", Somsak.getWearLevel());
        System.out.println(Somsri.getLocation());
        System.out.printf("Wear level: %.2f\n\n", Somsri.getWearLevel());
        System.out.println(Monkol.getLocation());
    }
}
