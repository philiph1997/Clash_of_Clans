package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UI.StretchIcon;
import logic.goldmine;

public class goldPanel extends JPanel{
        private goldmine mine;

    public goldPanel(){
        this.setLayout(new BorderLayout());
        JButton gold_Button = new JButton("Goldmine");
        this.add(gold_Button, BorderLayout.CENTER);
        gold_Button.setIcon(new StretchIcon("./Goldmine1.jpg", true));
    }
}
