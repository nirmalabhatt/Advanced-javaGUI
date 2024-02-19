package guipactice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class DisplayReverse {
     public static void main(String[] args) {
       ReverseString rs= new ReverseString(); 
    }   
}
class ReverseString extends JFrame implements ActionListener {
    private JTextField text,reverse; 
    private JButton reverseBtn;
    private JPanel panel;
    public ReverseString(){ 
       setBounds(300, 400, 500, 500);
       panel= new JPanel();
       add(panel);
       text= new JTextField(" Your String");
       reverse= new JTextField();
       reverseBtn= new JButton("ReverseString");
       panel.add(text);
       panel.add(reverse);
       panel.add(reverseBtn);
       setVisible(true);
       reverseBtn.addActionListener(this);  
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==reverseBtn){
         String S1= text.getText();
            System.out.println(S1);
        String rs= new StringBuffer(S1).reverse().toString();
        reverse.setText(rs);
            System.out.println(rs);
        } 
}   }
