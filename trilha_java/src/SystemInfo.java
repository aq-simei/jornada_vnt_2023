import java.awt.*;
import java.util.Date;

public class SystemInfo {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double height = screenSize.getHeight();
        double width = screenSize.getWidth();

        String language = System.getProperty("user.language");
        String country = System.getProperty("user.country");


        Date time = new Date();
        System.out.println("País do sistema: " + country);
        System.out.println("Idioma do sistema: " + language);
        System.out.println("Hora do sistema: " + time.toString());
        System.out.printf("Resolução do sistema: %.2f x %.2f .", width, height);

    }
}