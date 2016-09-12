import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/08.
 */
public class CheckBoxTest {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new CheckBoxFrame();
            frame.setTitle("CheckBoxTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
