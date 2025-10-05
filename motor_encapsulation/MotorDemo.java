package motor_encapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        for (int i = 0; i < 25; i++) {
            motor.tambahKecepatan();
            motor.printStatus();
        }

        motor.matikanMesin();
        motor.printStatus();
    }
}
