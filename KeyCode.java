import java.awt.event.KeyEvent;


public class KeyCode {                                                                           
    public static void main(String[] a) {
        for(int i = 0; i < 100000; ++i) {
            String text = java.awt.event.KeyEvent.getKeyText(i);     
            if(!text.contains("Unknown keyCode: ")) {                                         
                System.out.println("" + i + " -- " + text);                                   
            }                                                                                 
        }                                                                                     
                                                                                              
    }                                                                                         
}