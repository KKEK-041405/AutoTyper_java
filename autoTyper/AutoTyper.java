package autoTyper;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class AutoTyper extends Robot {

    public AutoTyper() throws AWTException {
        super();
    }
    
    public void type(String txt){
        if (txt == null) txt ="";
        for (int i = 0; i < txt.length(); i++) {
            try {  
                String letter =  String.valueOf(txt.charAt(i));
                String[] keycodes= KeyCodes.myMap.get(letter).split(",");
                for (String keycode : keycodes) {
                    // System.out.println(keycode);
                    keyPress(Integer.parseInt(keycode));
                }
                for (String keycode : keycodes) {
                    // System.out.println(keycode);
                    keyRelease(Integer.parseInt(keycode));
                }
            }
            catch(NullPointerException e) {
                System.out.print(txt.charAt(i));
            }
             catch (Exception e) {
                System.out.println(e+"sfjdsl");
                
            }
        }
        keyPress(KeyEvent.VK_ENTER);
        keyRelease(KeyEvent.VK_ENTER);
        
    }

    
}
