import java.awt.*;
import javax.swing.*;

class HelloSwing extends JFrame {
  private static final long serialVersionUID = 1L;
  private JLabel label;
  
  public HelloSwing(){
      this.setSize(new Dimension(500,350));
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      label = new JLabel("Hello_Swing");
      label.setFont(new Font("Serif",Font.PLAIN,28));
      this.add(label,BorderLayout.CENTER);
  }

  public static void main(String[] args) {
      new HelloSwing().setVisible(true);
  }
}
