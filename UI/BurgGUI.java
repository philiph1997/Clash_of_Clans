package UI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BurgGUI extends JFrame implements ActionListener{
    Game game = new Game();
   
    BorderLayout alpha_Layout = new BorderLayout();
    
    //NORTH
    JPanel north_Panel = new JPanel();
    GridLayout north_Layout = new GridLayout(1,2);
    
    JLabel titel_Label = new JLabel("Clash of Clans");
    
    JPanel statistik_Panel = new JPanel();
    GridLayout statistik_Layout = new GridLayout(3,2);
    JLabel glueck_Label = new JLabel("Glück");
    JLabel reichtum_Label = new JLabel("Reichtum");
    JLabel verteidigung_Label = new JLabel("Verteidigung");
    JButton glueck_Button = new JButton("0");
    JButton reichtum_Button = new JButton("0");
    JButton verteidigung_Button = new JButton("0");


    //CENTER
    JPanel center_Panel = new JPanel();
    /*
    JPanel steingrube_Panel = new JPanel();
    JButton steingrube_Button = new JButton("Steingrube");
    JPanel goldmine_Panel = new JPanel();
    JButton goldmine_Button = new JButton("Goldmine");
    JPanel mauer_Panel = new JPanel();
    JButton mauer_Button = new JButton("Mauer");
    */

    //SOUTH
    JPanel south_Panel = new JPanel();
    GridLayout south_Layout = new GridLayout(1,3);
    JLabel benutzer_Label = new JLabel("Benutzername");
    JButton zurWeltkarte_Button = new JButton("Zur Weltkarte");
    JButton exit_Button= new JButton("Exit");
    

    

    public BurgGUI(){
        setSize(800,500);
		setLayout(alpha_Layout);
		setTitle("Clash_of_Clans");

        //NORTH 
        add(north_Panel, BorderLayout.NORTH);
        north_Panel.setLayout(north_Layout);
        north_Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        north_Panel.add(titel_Label);
        north_Panel.add(statistik_Panel);
        statistik_Panel.setLayout(statistik_Layout);
        //Vererbung??
        statistik_Panel.add(glueck_Label);
        statistik_Panel.add(glueck_Button);//getPunkte
        glueck_Button.setEnabled(false);
        statistik_Panel.add(reichtum_Label);
        statistik_Panel.add(reichtum_Button);//getPunkte
        reichtum_Button.setEnabled(false);
        statistik_Panel.add(verteidigung_Label);
        statistik_Panel.add(verteidigung_Button);//getPunkte
        verteidigung_Button.setEnabled(false);   

        //CENTER
        int x = game.getGebaeudeLength();
        GridLayout center_Layout = new GridLayout(1,x);
        add(center_Panel, BorderLayout.CENTER);
        center_Panel.setLayout(center_Layout);
        ArrayList gebaeudeList = game.getGebaeudeList();
        for (Object gebaeudeObject: gebaeudeList){
            if(gebaeudeObject == "Mauer"){
                center_Panel.add(new mauerPanel());        
            }
            else if (gebaeudeObject == "Steingrube"){
                center_Panel.add(new steingrubePanel());
            }
            else if (gebaeudeObject == "Goldmine"){
                center_Panel.add(new goldPanel());
            }
            else{
                JButton error_Button = new JButton("Error");
                error_Button.setEnabled(false);
                center_Panel.add(error_Button);
            }
        }
        /*center_Panel.add(new goldPanel());
        center_Panel.add(new steingrubePanel());
        center_Panel.add(new mauerPanel());
        center_Panel.add(new goldPanel());*/

        //SOUTH
        add(south_Panel, BorderLayout.SOUTH);
        south_Panel.setLayout(south_Layout);
        south_Panel.add(benutzer_Label);
        south_Panel.add(zurWeltkarte_Button);
        zurWeltkarte_Button.setEnabled(false);
        south_Panel.add(exit_Button);
        exit_Button.setEnabled(false);

        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        /*if (event.getSource()==goldmine_Button) {
            //reichtum_Label.setText();;
        }
        if (event.getSource()==steingrube_Button) {

        }
        if (event.getSource()==mauer_Button){

        }*/
    }
}