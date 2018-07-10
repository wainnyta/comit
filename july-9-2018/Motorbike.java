public class Motorbike {
    // attributes: speed, color, maximum speed
    private int speed;
    private String color;
    private int maximumSpeed;

    public Motorbike(){
        this.speed = 0;
        this.color = "White";
        this.maximumSpeed = 25;
    }

    public Motorbike(int speed, String color, int maximumSpeed){
        this.color = color;
        this.maximumSpeed = maximumSpeed;
        setSpeed(speed);
    }

    // GETTERS AND SETTERS
    public void setMaximumSpeed(int maximumSpeed){
        this.maximumSpeed = maximumSpeed;
    }

    public int getMaximumSpeed(){
        return maximumSpeed;
    }

    public void setSpeed(int speed){
        if(speed <= maximumSpeed){
            this.speed = speed;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void accelerate(int amount){
        speed += amount;
        if(speed > maximumSpeed){
            speed = maximumSpeed;
        }
    }

    public void brake(int amount) {
        speed -= amount;
        if(speed < 0){
            speed = 0;
        }
    }

    public String toString(){
        return "Color: " + color + "\nSpeed: " + speed + "\nMax Speed: " + maximumSpeed;
    }


    // 2 constructors:
    // 1. empty constructor that will initialize
    // speed = 0; maximum speed = 25, color = "White"
    // 2. Constructor that takes in speed, color,
    // max Speed and set attribute values = parameter values

    // Methods: write getters and setters
    // Method: accelerate(amount) : increase speed by amount
    // upto Maximum Speed
    // Method: brake(amount): decrease speed by amount
    // down to 0
    // Method: toString(): print current attributes' states

    // Write a MotorbikeProgram.java, create one bike and try
    // all the above methods
}
