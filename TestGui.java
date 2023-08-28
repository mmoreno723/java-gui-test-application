import javax.swing.*;
// import java.awt.*;

public class TestGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JLabel label = new JLabel("Hello, Java GUI");
        frame.add(label);

        frame.setVisible(true);
    }
    
}

