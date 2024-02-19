
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyApp5 extends Frame implements ActionListener
{
    TextField t;
    Button b;
     int Count=0;
    public MyApp5()
    {
        setBounds(300, 400, 500, 500);
       setBackground(Color.PINK);
       setVisible(true);
       setLayout(null);
       b= new Button("click me");
        FlowLayout f1= new FlowLayout();
       setLayout(f1);
       t= new TextField();
      t.setBounds(50,100,100,30);
      b.addActionListener(this);
      
      add(t);
      add(b);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b)
        {
           t.setText(String.valueOf(Count++));
        }
        
        
       
    }

}
public class AWTApp4 {
    public static void main(String[] args) {
        MyApp5 a5= new MyApp5();
    }
    
}
