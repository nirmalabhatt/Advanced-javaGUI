
package guipactice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

class MyFrame extends Frame
{
   Button b ,c,d,e;
   public MyFrame()
   {
       setBounds(300, 400, 500, 500);
       setBackground(Color.yellow);
       b= new Button("click me For the any Operation:");
       c= new Button("Update Your Frame ");
       d= new Button("Cancle The PRCESSS");
       e= new Button("Search Your Quries");
       
       FlowLayout f1= new FlowLayout();
      setLayout(f1);
      add(b);
      add(c);
      add(d);
      add(e);
     
      setVisible(true);
    }
   
}
public class App2 {
    public static void main(String[] args) {
      MyFrame f= new MyFrame();  
        
    }
    
}
