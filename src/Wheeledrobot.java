public class Wheeledrobot extends  Robot{

    private int wheelCount;
    private double wearLevel;
    private double wearPerUnit;

    Wheeledrobot(String name, int wheelCount, double wearPerUnit){
        super(name);
        this.wheelCount = wheelCount;
        this.wearPerUnit = wearPerUnit;
        this.wearLevel = 0;
        }

    @Override
    void moveFoward(int units) {
        super.moveFoward(units);
        wearLevel += wearPerUnit*units;

        if (wearLevel > 0.8){
            System.out.println("Wheel wear capacity exceeded!!!!\n");
        }
    }

    double getWearLevel() {
        return wearLevel;
    }
}

