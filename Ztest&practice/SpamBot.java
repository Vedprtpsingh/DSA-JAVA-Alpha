import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SpamBot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        String[] words = {"pagal", "pgl", "kamina", "mota"};
        Random random = new Random();
        Robot robot = new Robot();
        
        Thread.sleep(4000); // Wait 4 seconds before starting
        
        for (int i = 0; i < 500; i++) {
            String word = words[random.nextInt(words.length)];
            typeString(robot, word);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(100); // Adjust speed if necessary
        }
    }

    private static void typeString(Robot robot, String text) {
        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                continue;
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
    }
}

