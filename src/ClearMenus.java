import java.util.Arrays;

public class ClearMenus {
    public static void main(String[] args) {
        System.out.println("This is a new menu");
        clearScreen();

    }

    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name");
            os = System.getProperty(Arrays.toString(os.getBytes())).toLowerCase();
            System.out.println(os);

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Handle any exceptions here
            e.printStackTrace();
        }
    }
}
