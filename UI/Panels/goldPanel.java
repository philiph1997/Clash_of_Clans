package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UI.StretchIcon;
import logic.goldmine;
import UI.*;

public class goldPanel extends JPanel{
    private goldmine mine = null;

    public goldPanel(){
        this.setLayout(new BorderLayout());
        JButton gold_Button = new JButton("Goldmine");
        this.add(gold_Button, BorderLayout.CENTER);
        gold_Button.setIcon(new StretchIcon("./Pictures/Goldmine1.jpg", true));
    }
}
