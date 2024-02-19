
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends Frame implements ActionListener 
{
  Button b,c ;
   public MyFrame1()
   {
        
       setBounds(300, 400, 500, 500);
       setBackground(Color.yellow);
       b= new Button("click To close Frame");
       c= new Button("click to change Color");
       FlowLayout f1= new FlowLayout();
       setLayout(f1);
       CloseFrame cf= new CloseFrame();
       b.addActionListener(cf);
       c.addActionListener(this);
       add(b);
       add(c);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.BLUE);
    }
            }
   
class CloseFrame implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
        }
    
}
public class EventHandlingDemo {
    public static void main(String[] args) {
         MyFrame1 f= new MyFrame1(); 
        
    }
    
}

