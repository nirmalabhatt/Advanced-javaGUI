
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends Frame implements ActionListener 
{
  Button i;
  int count=0;
   public MyFrame6()
   {
       
       setBounds(300, 400, 500, 500);
       setBackground(Color.yellow);
       i= new Button("click");
       FlowLayout f1= new FlowLayout();
       setLayout(f1);
      
      
       i.addActionListener(this);
       add(i);
       
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==i)
                {
           
            setTitle(String.valueOf(count++));
        }
        
    }
    
}
public class App5 
{
    public static void main(String[] args) {
        MyFrame6 m6= new MyFrame6();
    }
    
}
