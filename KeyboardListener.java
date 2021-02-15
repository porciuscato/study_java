import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.util.ArrayList;

public class KeyboardListener implements KeyListener {
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        list = new ArrayList<>();
        KeyboardListener sam = new KeyboardListener();
        sam.KeyListener();
    }
    
    public void KeyListener(){  
        JFrame frame = new JFrame("JFrame Example");  
        JTextArea area = new JTextArea();
        JButton button = new JButton("Print");
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        button.setBounds(100, 30, 20, 20);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                System.out.println(list);
              }
        });

        frame.add(area);
        frame.add(button);
        
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }

    public void keyReleased(KeyEvent e){
        list.add(e.getKeyCode());
    }

    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){}
}
