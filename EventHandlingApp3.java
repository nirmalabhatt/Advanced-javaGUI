
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends Frame implements ActionListener 
{
  Button c,r,g,b;
   public MyFrame4()
   {
        
       setBounds(300, 400, 500, 500);
       setBackground(Color.yellow);
       c= new Button("close Frame");
       r= new Button(" Red");
       g= new Button("Gren");
       b= new Button("blue");
       FlowLayout f1= new FlowLayout();
       setLayout(f1);
       CloseFrame cf= new CloseFrame();
       c.addActionListener(this);
       r.addActionListener(this);
       g.addActionListener(this);
       b.addActionListener(this);
       add(c);
       add(r);
       add(g);
       add(b);
       
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==c)
        {
            System.exit(0);
        }
        else if(e.getSource()==r)
        {
            setBackground(Color.RED);
        }
        else if(e.getSource()==g){
            setBackground(Color.GREEN);
        }else
        {
            setBackground(Color.BLUE);
        }
        
    }
    
}
public class EventHandlingApp3 {
    public static void main(String[] args) {
      MyFrame4 f4= new MyFrame4();  
    }
}  

