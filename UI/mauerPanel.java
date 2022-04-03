package UI;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class mauerPanel extends JPanel{
    //private Goldmine mine;

    public mauerPanel(){
        this.setLayout(new BorderLayout());
        JButton mauer_Button = new JButton("Mauer");
        this.add(mauer_Button, BorderLayout.CENTER);
        mauer_Button.setIcon(new StretchIcon("./MauerIcon1.jpg", true));
    }
}