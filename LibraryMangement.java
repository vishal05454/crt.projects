package librarymangement;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
public class LibraryMangement {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JLabel b=new JLabel("Library Mangment System");
		b.setBounds(200,0,150,100);
		f.add(b);
		JButton adminlogin=new JButton("Admin Login");
		adminlogin.setBounds(200,120,150,50);
		f.add(adminlogin);
		JButton a=new JButton("Liberian Login");
		a.setBounds(200,250,150,50);
		f.add(a);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
	}
	
	
	

}
