import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;

public class Main extends JFrame {

    Main() {
        // הגדרת חלון בסיסית
        this.add(new Window());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //פונקצייה מובנית הבונה את גודל החלון בהתאם לגודל הפנלים
        this.pack();
        //נראות ומיקום החלון
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
     public static void main(String[] args) {
      new Main();

    }
    public static void openBrowser() throws InterruptedException {
        boolean isConnected= false;
        System.setProperty("webdriver.chrome.driver","C:\\files2\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=C:\\Users\\tzirkus\\AppData\\Local\\Google\\Chrome\\User Data");
        ChromeDriver driver = new ChromeDriver(options);
        options.addArguments("--start-maximized");
        driver.get("https://web.whatsapp.com/");
        Thread.sleep(3000);
        isConnected=true;
        if(isConnected){

        }

    }
}
