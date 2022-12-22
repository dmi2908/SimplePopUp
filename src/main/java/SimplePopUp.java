import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimplePopUp extends JFrame {
    static int width = 250, height = 90;
    static String myName = "Дима";

    public SimplePopUp() {
        createGUI();
    }
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyText(e.getKeyCode()) == "Space") {
                    JOptionPane.showMessageDialog(getParent(),myName);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new SimplePopUp();
    }
}
