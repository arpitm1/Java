import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class program1 extends JFrame implements ActionListener{  
    JTextField tf; JLabel l,l1; JButton b;  
    program1(){  
    	l1=new JLabel("Enter Temperature");
    	add(l1); 
        tf=new JTextField("",20);  
        add(tf);
        l=new JLabel();   
        b=new JButton("Calculate"); 
        add(b); 
        add(l); 
        b.addActionListener(this);    
        add(b);   
        setSize(400,400);  
        setLayout(new FlowLayout());  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e) {  
    	String s;
    	s=tf.getText();
    	int n=0;
    	float f,c;
    	n=Integer.parseInt(s);
    	if(n>100)
    	{
    		c=(float)((n-32)*5)/9;
    		l.setText(""+c);
    	}
    	else
    	{
    		f=(float)((n*9)/5)+32;
    		l.setText(""+f);
    	}
    }  
    public static void main(String[] args) {  
        new program1();  
    } }
