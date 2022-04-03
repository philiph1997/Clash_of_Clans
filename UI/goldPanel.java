package UI;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class goldPanel extends JPanel{
    //private Goldmine mine;

    public goldPanel(){
        this.setLayout(new BorderLayout());
        JButton gold_Button = new JButton("Goldmine");
        this.add(gold_Button, BorderLayout.CENTER);
        gold_Button.setIcon(new StretchIcon("./Goldmine1.jpg", true));
    }
}
