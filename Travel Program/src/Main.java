import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main
{

    public static void main(String[] args)
    {
	DestinationDataBase j = new DestinationDataBase();
	Choice c = new Choice();
	j.fillDestinationList();
	c.displayChoice();

    }
    
    

}
