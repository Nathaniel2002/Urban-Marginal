package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreeJeu frame = new EntreeJeu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Clic sur le bouton Start
	 */
	private void btnStart_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	
	/**
	 * Clic sur le bouton Exit
	 */
	
	private void btnExit_clic() {
		System.exit(0);
	}
	
	/**
	 * Clic sur le bouton Connect
	 */
	private void btnConnect_clic() {
		(new ChoixJoueur()).setVisible(true);
		this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnStartAServer = new JTextPane();
		txtpnStartAServer.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnStartAServer.setText("Start a server :");
		txtpnStartAServer.setBackground(UIManager.getColor("menu"));
		txtpnStartAServer.setBounds(10, 10, 135, 19);
		contentPane.add(txtpnStartAServer);
		
		JTextPane txtpnStartAServer_1 = new JTextPane();
		txtpnStartAServer_1.setText("Connect an existing server :");
		txtpnStartAServer_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnStartAServer_1.setBackground(SystemColor.menu);
		txtpnStartAServer_1.setBounds(10, 39, 221, 19);
		contentPane.add(txtpnStartAServer_1);
		
		JTextPane txtpnIpServer = new JTextPane();
		txtpnIpServer.setText("IP Server :");
		txtpnIpServer.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnIpServer.setBackground(SystemColor.menu);
		txtpnIpServer.setBounds(10, 68, 97, 19);
		contentPane.add(txtpnIpServer);
		
		txtIp = new JTextField();
		txtIp.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtIp.setText("127.0.0.1");
		txtIp.setBounds(105, 68, 104, 25);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
		
		JButton btnStart = new JButton("Start !");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStart.setBounds(303, 10, 123, 21);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConnect.setBounds(303, 68, 123, 21);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(303, 99, 123, 21);
		contentPane.add(btnExit);
	}
}
