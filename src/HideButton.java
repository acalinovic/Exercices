import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class HideButton extends JButton implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HideButton(){
		this.setText("HIDE");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.getParent().setVisible(false);
		this.getParent().setVisible(false);
	}

	
}