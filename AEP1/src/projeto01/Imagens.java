package projeto01;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Imagens extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon imagem = new ImageIcon(getClass().getResource("buva.jpg"));
	JLabel label = new JLabel(imagem);
	
	
	public Imagens() {
		
		add(label);
		setSize(1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
	}
	
}
