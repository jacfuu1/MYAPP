
import javax.swing.*;
public class ButtonExample01{
	public static void main (String args[]){
		JFrame jf =new JFrame("Button Example");
		JButton jb=new JButton("Clic Here");
		jb.setBounds(50,100,90,30);
		jf.add(jb);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);

	}

}