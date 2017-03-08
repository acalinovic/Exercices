import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class ExitButton extends JButton implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExitButton(String title){
		this.setName(title);
		this.setText(title);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
System.exit(ABORT);		
	}

	
}