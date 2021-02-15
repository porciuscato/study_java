import java.awt.Desktop;
import java.net.URI;
import java.io.File;

public class DesktopClass {
    public static void main(String[] args) throws Exception {
        // Desktop.getDesktop().browse(new URI("https://www.naver.com"));
        File file = new File("../download.png");
        System.out.println(file.getAbsolutePath());
        Desktop desktop = Desktop.getDesktop();
        desktop.edit(file);
    }
}
