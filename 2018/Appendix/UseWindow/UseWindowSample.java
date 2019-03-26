import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

class HelloWorld {
  public static void main(String args[]) {
    new HelloFrame().setVisible(true);
  }
}

class HelloFrame extends JFrame {
  HelloFrame() {
    setTitle("Hello Frame");
    setSize(300, 200);
    setLocation(100, 50);
    JLabel label = new JLabel("Hello World!");
    add(label);
  }
}
