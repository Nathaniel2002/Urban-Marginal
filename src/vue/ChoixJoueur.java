package vue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

/**
 * Frame du choix du joueur
 */
public class ChoixJoueur extends JFrame {

	/**
	 * Panel général
	 */
	private JPanel contentPane;
	/**
	 * Zone de saisie du pseudo
	 */
	private JTextField txtPseudo;

	/**
	 * Clic sur la flèche "précédent" pour afficher le personnage précédent
	 */
	private void lblPrecedent_clic() {
		System.out.println("Clic sur precedent");
	}
	
	/**
	 * Clic sur la flèche "suivant" pour afficher le personnage suivant
	 */
	private void lblSuivant_clic() {
		System.out.println("Clic sur suivant");
	}
	
	/**
	 * Clic sur GO pour envoyer les informations
	 */
	private void lblGo_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}


	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		// Dimension de la frame en fonction de son contenu
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
	    this.pack();
	    // interdiction de changer la taille
		this.setResizable(false);
		 
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblPrecedent_clic();
			}
		});
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSuivant_clic();
			}
		});
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblGo_clic();
			}
		});
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(142, 245, 120, 20);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		lblGo.setBounds(311, 202, 65, 61);
		contentPane.add(lblGo);
		lblSuivant.setBounds(301, 145, 25, 46);
		contentPane.add(lblSuivant);
		lblPrecedent.setBounds(65, 146, 31, 45);
		contentPane.add(lblPrecedent);
		
		JLabel lblFond = new JLabel("");
		lblFond.setIcon(new ImageIcon("C:\\Users\\nathr\\OneDrive\\Documents\\Cours\\Bloc 2\\Comp\u00E9tence 1\\S\u00E9quence 2\\S\u00E9ance 3\\Urban_Marginal_SQ2_S3_correction\\Urban_Marginal\\media\\fonds\\fondchoix.jpg"));
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		
		txtPseudo.requestFocus();

	}

}
