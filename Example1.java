
package guipactice;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Example1 
{
    public static void main(String[] args) {
      Myexample1 ex1= new Myexample1();  
    }
    
}
class Myexample1 extends JFrame implements ActionListener
{
    private JPanel panel;
    private JComboBox jBox;
    JButton b1;
    JButton b2;
    String[]arr= null;
    private JLabel lbl1;
     public Myexample1()
    {

       setBounds(300,350,500,500);
       setTitle("Swing Practice Application"); 
       panel = new JPanel();
       b1= new JButton("Add Iteams");
       panel.add(b1);
       b2= new JButton("Delete Iteams");
       panel.add(b2);
       lbl1= new JLabel("hello");
       panel.add(lbl1);
       GroupLayout glut= new GroupLayout(lbl1); 
       lbl1.setLayout(glut);
       add(panel);
       jBox= new JComboBox(); 
       panel.add(jBox);
       b1.addActionListener(this);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
        arr= new String []{"Apple","Orange","mango"} ;
          for(String s:arr)
          {
              jBox.addItem(s);
          }
        }
        else if( ae.getSource()==b2)
                {
                   
                    
                }
    }
}
