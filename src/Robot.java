public class Robot {

    private String name;
    private int x;
    private int y;
    private int orientation;

    Robot(String name){
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.orientation = 0;
    }

    void moveFoward(int units){
        if (orientation == 0){
            y += units;
        }
        else if (orientation == 90){
            x += units;
        }
        else if (orientation == 180){
            y -= units;
        }
        else if (orientation == 270){
            x -= units;
        }
    }

    void rotate(int degrees){
        orientation = (orientation += degrees)%360;
        if (orientation < 0){
            orientation += 360;
        }
    }

    String getLocation(){

        if (orientation == 0){
            return "Robot " + name + " at (" + x + "," + y + "), facing North";
        }
        else if(orientation == 90){
            return "Robot " + name + " at (" + x + "," + y + "), facing East";
        }
        else if(orientation == 180){
            return "Robot " + name + " at (" + x + "," + y + "), facing South";
        }
        else if(orientation == 270){
            return "Robot " + name + " at (" + x + "," + y + "), facing West";
        }
        else return "";

    }


}
