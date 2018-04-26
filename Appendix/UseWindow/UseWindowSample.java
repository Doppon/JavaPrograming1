import javax.swing.JFrame;
import java.awt.BorderLayout;

class HelloWorld {
  public static void main(String args[]) {
    JFrame frame = new HelloFrame();
    frame.setVisible(true);
  }
}

class HelloFrame extends JFrame {
  HelloFrame() {
    setTitle("Hello Frame");
    setSize(300, 200);
    setLocation(100, 50);
    JFrame label = new JFrame("Hello World!");
    add(label);
  }
}
