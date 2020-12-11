import javax.swing.*;
public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("My First Window App"); //creating instance of JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b=new JButton("button");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame
        f.setLocationRelativeTo(null);
        f.setSize(300,500);//400 width and 500 height
        f.setDefaultLookAndFeelDecorated(true);
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}