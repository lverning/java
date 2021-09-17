package IO流;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @author： 吕二宁
 * @date： 2021-09-07 10:28
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            int i=0;
            while(i<1000000) {
                Robot robot = new Robot();
                robot.delay(10);
                robot.mousePress(InputEvent.BUTTON1_MASK);
                robot.delay(10);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                ++i;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
