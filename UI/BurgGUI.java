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

import UI.Panels.*;

public class BurgGUI extends JFrame implements ActionListener{
    Game game = new Game();
   
    BorderLayout alpha_Layout = new BorderLayout();
    
    //NORTH
    JPanel north_Panel = new JPanel();
    GridLayout north_Layout = new GridLayout(1,2);
    
    JLabel titel_Label = new JLabel("Clash of Clans");
    
    JPanel statistik_Panel = new JPanel();
    GridLayout statistik_Layout = new GridLayout(4,2);

    JLabel stein_Label = new JLabel("Stein");
    JLabel reichtum_Label = new JLabel("Reichtum");
    JLabel verteidigung_Label = new JLabel("Verteidigung");
    JLabel total_Label = new JLabel("Total-Level");

    JButton stein_Button = new JButton("0");
    JButton reichtum_Button = new JButton("0");
    JButton verteidigung_Button = new JButton("0");
    JButton total_Button = new JButton("0");


    //CENTER
    JPanel center_Panel = new JPanel();

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
        statistik_Panel.add(stein_Label);
        statistik_Panel.add(stein_Button);
        stein_Button.setEnabled(false);
        stein_Button.setText(String.valueOf(game.getTotal_Steinmenge()));

        statistik_Panel.add(reichtum_Label);
        statistik_Panel.add(reichtum_Button);
        reichtum_Button.setEnabled(false);
        reichtum_Button.setText(String.valueOf(game.getTotal_Reichtum()));

        statistik_Panel.add(verteidigung_Label);
        statistik_Panel.add(verteidigung_Button);
        verteidigung_Button.setEnabled(false);
        verteidigung_Button.setText(String.valueOf(game.getTotal_Verteidigung())); 

        statistik_Panel.add(total_Label);
        statistik_Panel.add(total_Button);
        total_Button.setEnabled(false);
        total_Button.setText(String.valueOf(game.getTotal())); 

        //CENTER
        add(center_Panel, BorderLayout.CENTER);
        int x = game.getGebaeudeLength();
        GridLayout center_Layout = new GridLayout(1,x);
        center_Panel.setLayout(center_Layout);
        ArrayList<String> gebaeudeListStrings = game.getGebaeudeListStrings();
        
        for (String gebaeudeObject: gebaeudeListStrings){
            if(gebaeudeObject == "mauer"){
                center_Panel.add(new mauerPanel());        
            }
            else if (gebaeudeObject.equals("steingrube")){
                center_Panel.add(new steingrubePanel());
            }
            else if (gebaeudeObject == "goldmine"){
                center_Panel.add(new goldPanel());
            }
            else{
                JButton error_Button = new JButton("Error");
                error_Button.setEnabled(false);
                center_Panel.add(error_Button);
            }
        }

        //SOUTH
        add(south_Panel, BorderLayout.SOUTH);
        south_Panel.setLayout(south_Layout);
        //=================================================================================================
        //Benutzername einfügen (eventuell vom User)
        south_Panel.add(benutzer_Label);
        //=================================================================================================
        south_Panel.add(zurWeltkarte_Button);
        zurWeltkarte_Button.setEnabled(false);
        south_Panel.add(exit_Button);
        exit_Button.setEnabled(false);

        
        setVisible(true);
    }
    //=================================================================================================
    //CLick-Events noch ausführen lassen
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
    //=================================================================================================
    }
}