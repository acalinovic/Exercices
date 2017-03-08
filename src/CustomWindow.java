import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomWindow extends JFrame implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomWindow(){
		addMouseListener(this);
		getContentPane().setLayout(new BorderLayout());
		JPanel p0 = new JPanel();
		p0.setBackground(Color.YELLOW);
		p0.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255,0,0));
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(0,255,0));
		ExitButton exitB = new ExitButton("Exit");
		HideButton hideB = new HideButton();
		getContentPane().add(p0);
		p0.add(p1);
		p1.add(p2);
		p1.add(exitB);
		p2.add(hideB);
	}

	

	@Override
	public void mouseClicked(MouseEvent e) {
System.out.println("Cliked on: "+e.getX()+","+e.getY());		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed on : "+e.getX()+","+e.getY());		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released on: "+e.getX()+","+e.getY());		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered @: "+e.getX()+","+e.getY());		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited @: "+e.getX()+","+e.getY());		
		
	}
	
}