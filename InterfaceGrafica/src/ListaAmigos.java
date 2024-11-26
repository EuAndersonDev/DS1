import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class ListaAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAmigos frame = new ListaAmigos();
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
	public ListaAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main voltarMain = new Main();
				voltarMain.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoltar.setBounds(10, 11, 56, 50);
		contentPane.add(btnVoltar);
		
		JLabel tituloAmigos = new JLabel("Lista de amigos\r\n");
		tituloAmigos.setFont(new Font("Tahoma", Font.BOLD, 30));
		tituloAmigos.setForeground(Color.WHITE);
		tituloAmigos.setBounds(283, 25, 248, 64);
		contentPane.add(tituloAmigos);
		
		JButton btnPesquisar = new JButton("Pesquisar\r\n");
		btnPesquisar.setForeground(Color.BLACK);
		btnPesquisar.setBackground(Color.WHITE);
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPesquisar.setBounds(162, 394, 135, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnDeletar = new JButton("Deletar\r\n");
		btnDeletar.setForeground(Color.BLACK);
		btnDeletar.setBackground(Color.WHITE);
		btnDeletar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeletar.setBounds(552, 394, 113, 23);
		contentPane.add(btnDeletar);
	}
}
