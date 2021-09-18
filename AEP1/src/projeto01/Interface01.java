package projeto01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;

public class Interface01 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface01 frame = new Interface01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Herbicidas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Herbicida glifosato = new Herbicida("Glifosato", "Amplo espectro", false, null, null);
				
				JOptionPane.showMessageDialog(btnNewButton, "Nome: " + glifosato.getNome() + "\nGrupo: " + glifosato.getGrupoPertencente()
				+ "\nÉ seletivo: " + glifosato.getéSeletivo() + "\nImagem: " + glifosato.getImagem(), "HERBICIDAS", JOptionPane.NO_OPTION);
			}
		});
		btnNewButton.setBounds(156, 200, 133, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Plantas Daninhas");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ErvaDaninha buva = new ErvaDaninha ("Buva", "Conyza", "Eudicotiledônea", null, null);
				
				JOptionPane.showMessageDialog(btnNewButton_1, "Nome: " + buva.getNomeUsual() + "\nNome cientifico: " + buva.getNomeCientifico()
				+ "\nBreve descrição: " + buva.getBreveDescrição() + "\nImagem: " + "buva.jpg", "PLANTAS DANINHAS", JOptionPane.NO_OPTION);
			}
		});
		btnNewButton_1.setBounds(156, 156, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Upload");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnNewButton, "Foto enviada!\nO sitema está analisando a imagem...", "IDENTIFICAÇÃO DE ERVA DANIHNA", JOptionPane.NO_OPTION);
			}
		});
		btnNewButton_2.setBounds(156, 64, 133, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Envio de foto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(145, 11, 147, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblCatlogos = new JLabel("Cat\u00E1logos");
		lblCatlogos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatlogos.setForeground(new Color(0, 0, 0));
		lblCatlogos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCatlogos.setBounds(145, 98, 147, 47);
		contentPane.add(lblCatlogos);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(183, 219, -71, -50);
		contentPane.add(desktopPane);
	}
}
