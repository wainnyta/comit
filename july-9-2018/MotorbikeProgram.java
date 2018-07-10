public class MotorbikeProgram {
    public static void main(String[] args){
        Motorbike bike = new Motorbike(120, "Green", 150);
        bike.accelerate(40);
        bike.brake(200);
        System.out.println(bike);
    }
}
