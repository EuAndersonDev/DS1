import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBotao = new JButton("Cadastrar");
		btnBotao.setForeground(Color.RED);
		btnBotao.setBackground(Color.YELLOW);
		btnBotao.setBounds(35, 297, 167, 32);
		contentPane.add(btnBotao);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/eusabo2.jpg")));
		lblNewLabel.setBounds(235, 48, 147, 200);
		contentPane.add(lblNewLabel);
		
		JButton btnBotao_1 = new JButton("Cadastrar");
		btnBotao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotao_1.setForeground(Color.RED);
		btnBotao_1.setBackground(Color.YELLOW);
		btnBotao_1.setBounds(399, 297, 167, 32);
		contentPane.add(btnBotao_1);
	}
}
