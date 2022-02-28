package hms;
import javax.swing.*;

public class Login extends JFrame{

    Login(){
         setBounds(300,300,1366,565);
     //    setSize(400,400);
     //    setLocation(300,300);

     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hms/first.jpg"));
    JLabel l1 = new Jlabel(il);
     setBounds(0,0,1366,565);
     setLayout(null);
     setVisible(true);

    } 

    public static void main(String[] args){

        new Login();
    }
}