
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame3 extends Frame implements ActionListener{
    Button b;
     
    public MyFrame3()
    {
        setBounds(300,350,500,500);
        b= new Button("Change Color");
        setVisible(true);
        FlowLayout f1= new FlowLayout();
        b.addActionListener(this);
        setLayout(f1);
        add(b);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == b){
               Random rand= new Random();
                int red= (int)Math.floor(Math.random() * 255);
                int green=(int)Math.floor(Math.random() * 255);
                int blue= (int)Math.floor(Math.random() * 255);
             setBackground(new Color(red,green,blue));
           }
    }
    
}

public class EventHandlingDemo2 {
    public static void main(String[] args) {
            MyFrame3 m3= new MyFrame3();
    }
    
}
