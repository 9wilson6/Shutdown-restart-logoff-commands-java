
package shutpcdown;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Shutpcdown extends JFrame{
private JPanel mypanel;
private JButton shutdown, restart, logoff, cancel;


    public Shutpcdown(){
    
    
    
    shutdown = new JButton("shutdown");
    shutdown.setIcon(new ImageIcon(getClass().getResource("/shutpcdown/images/icons8_Shutdown_96px.png")));
    
   
    
    mypanel= new JPanel();
    mypanel.add(shutdown);
   
    
    this.add(mypanel);
    
    }
//    public static void main(String []args){
//   
//    JFrame frame = new JFrame();
//    frame.setTitle("basic commands");
//    frame.setVisible(true);
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setResizable(false);
//    frame.setLocationRelativeTo(null);
//    frame.setSize(600,200);
//    }
    
    
}
