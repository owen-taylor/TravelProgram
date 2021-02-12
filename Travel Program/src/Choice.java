import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
public class Choice implements ActionListener
{
    static JButton distanceChoice;
    static JButton informationChoice;
    
    MainMenu n = new MainMenu();
    public void displayChoice()
    {
	JFrame choiceFrame = new JFrame("Choose");
	JPanel choicePanel = new JPanel();
	choiceFrame.setSize(200, 100);
	choiceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	distanceChoice = new JButton(new ImageIcon("distance.jpg"));
	distanceChoice.setBounds(0, 125, 100,100);
	distanceChoice.addActionListener(this);
	informationChoice = new JButton(new ImageIcon("funFacts.jpg"));
	informationChoice.setBounds(5, 125, 100,100);
	informationChoice.addActionListener(this);
	choicePanel.add(distanceChoice);
	choicePanel.add(informationChoice);
	choiceFrame.add(choicePanel);
	choiceFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource() == distanceChoice)
	{
	    n.mainMenu();
	}
	else
	{
	    
	}
    }
}
