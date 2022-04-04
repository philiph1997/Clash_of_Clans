package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UI.StretchIcon;
import UI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goldPanel extends JPanel implements ActionListener{
    private BurgGUI burgGUI;
    private JButton gold_Button;

    public goldPanel(BurgGUI burgGUI){
        this.burgGUI = burgGUI;

        this.setLayout(new BorderLayout());
        this.gold_Button = new JButton("Goldmine");
        this.add(gold_Button, BorderLayout.CENTER);
        gold_Button.setIcon(new StretchIcon("./Pictures/Goldmine1.jpg", true));

        gold_Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gold_Button){
            burgGUI.setLabelText("Goldmine");
        };
    }
}
