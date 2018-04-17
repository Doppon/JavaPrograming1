import java.swing.*;
import java.awt.BorderLayout;

import javax.swing.JFrame;

class HellowWorld {
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
    JFrame label1 = new JFrame("Hello World!");
    add(label1);
  }
}
