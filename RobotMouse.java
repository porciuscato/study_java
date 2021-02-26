import java.awt.Robot;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RobotMouse extends Thread {
    static boolean repeat = true;
    public static void main(String[] args) throws Exception {
        RobotMouse mouse = new RobotMouse();
        JFrame frame = new JFrame("Mouse Auto Mover");
        JButton sbutton = new JButton("Start");
        JButton tbutton = new JButton("Stop");

        sbutton.setBounds(40, 30, 80, 30);
        tbutton.setBounds(120, 30, 80, 30);

        // start 버튼과 stop 버튼을 스레드로 만들고 싶다.
        // start 버튼은 무한 무프를 돌기 때문에 단일 프로세스로 작성하면 stop 버튼을 누를 수 없기 때문이다.

        sbutton.addActionListener(new ActionListener() {
            int mouseDelay = 5000;
            Robot robot = new Robot();
            public void actionPerformed(ActionEvent e) {
                while (repeat) {
                    robot.mouseMove(750, 420);
                    robot.delay(mouseDelay);
                    robot.mouseMove(770, 420);
                    robot.delay(mouseDelay);
                }
            }
        });
        tbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repeat = false;
            }
        });
        frame.add(sbutton);
        frame.add(tbutton);
        frame.setSize(240, 120);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }

    public void run() {

    }
}
