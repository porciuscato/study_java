import java.awt.Robot;


public class RobotKeyboard {
    public static void main(String[] args) throws Exception {
        final int keyDelay = 20;
        final int enterDelay = 2000;
        Robot robot = new Robot();

        int[] keylist = new int[]{524, 71, 73, 84, 32, 66, 65, 83, 10, 67, 68, 32, 71, 73, 9, 83, 84, 85, 9, 83, 80, 82, 9, 10, 67, 79, 68, 69, 32, 46, 10};
        for(int key: keylist){
            robot.keyPress(key);
            robot.keyRelease(key);
            if(key == 524 || key == 10) {
                robot.delay(enterDelay);
            }
            else {
                robot.delay(keyDelay);
            }
        }
    }
}
