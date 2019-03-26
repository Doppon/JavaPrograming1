import java.awt.*;
import javax.swing.*;

class BoxLayoutSample extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public BoxLayoutSample(){
        this.setSize(new Dimension(300,200));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout boxlayout = new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS);
        this.setLayout(boxlayout);
        for(int i = 0;i < 5;i++){
            JButton btn = new JButton("button" + i);
            btn.setFont(new Font("Serif",Font.PLAIN,18));
            this.add(btn);
        }
    }

    public static void main(String[] args) {
        new BoxLayoutSample().setVisible(true);
    }
}
