import java.awt.AWTException;
import java.awt.Robot;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import Reader.FReader;
import autoTyper.AutoTyper;
import autoTyper.KeyCodes;



public class App {
    public static void main(String[] args) throws Exception {
        AutoTyper autoTyper = new AutoTyper();
        FReader fReader = new FReader("program.txt");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("Auto Typer Starts in "+(10-i));
        }
        for (int i = 0; i < 100; i++) {
            String line = fReader.read();
            
            if (line.equals( "//TerminateAutoTyper"))  break; 
            autoTyper.type(line.trim());
                
        }
    }
}
