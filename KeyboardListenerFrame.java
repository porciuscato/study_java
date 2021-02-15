import java.awt.*;  
import java.awt.event.*;
import java.util.ArrayList;

public class KeyboardListenerFrame extends Frame implements KeyListener {
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        KeyboardListenerFrame sam = new KeyboardListenerFrame();
        list = new ArrayList<>();
        sam.KeyListenerExample();
    }
    
    public void KeyListenerExample(){  
        Label l;  
        TextArea area;
        l = new Label();  
        l.setBounds(20,50,100,20);  
        area = new TextArea();  
        area.setBounds(20, 80, 300, 300);  
        area.addKeyListener(this);
        add(l);
        add(area);  
        setSize(400,400);  
        setLayout(null);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e){
        list.add(e.getKeyCode());
        System.out.println(e.getKeyCode());
    }

    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){}
}
