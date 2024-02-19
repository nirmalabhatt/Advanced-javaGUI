
package guipactice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class swingPractic {
  
    public static void main(String[] args) 
    {
      Myapp my = new Myapp(); 
       
    }
}
 class Myapp extends JFrame implements ActionListener
 {
     private JPanel panel;
    public Myapp()
    {
        setBounds(300,350,500,500);
        setTitle("Random Color Button");
        panel = new JPanel();
        JButton button = new JButton("Change Color");
        button.addActionListener(this);
        panel.add(button);
        add(panel);
        setVisible(true);
    }
    private Color getRandomColor() {
        Random random = new Random();
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        return new Color(r, g, b);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
         panel.setBackground(getRandomColor());
    }
 }
           
     
 
