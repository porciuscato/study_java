import java.awt.Desktop;
import java.awt.event.KeyEvent;

public class CurrentDesktop implements KeyListener {
    public static void main(String[] args) throws Exception {
        if (Desktop.isDesktopSupported()) {
            Desktop now = Desktop.getDesktop();
        }
        CurrentDesktop desktop = new CurrentDesktop();
        desktop.listen();
    }
    public void listen(){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){}
}
