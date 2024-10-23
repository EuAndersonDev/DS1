import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroAmigos extends JFrame {

	private JPanel contentPane;
	private JTextField inputNome;
	private JLabel labelApelido;
	private JTextField inputApelido;
	private JLabel labelTelefone;
	private JTextField inputTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAmigos frame = new CadastroAmigos();
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
	public CadastroAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		labelNome.setBounds(58, 128, 85, 29);
		contentPane.add(labelNome);
		
		inputNome = new JTextField();
		inputNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputNome.setBounds(177, 129, 573, 30);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		labelApelido = new JLabel("Apelido:");
		labelApelido.setFont(new Font("Tahoma", Font.PLAIN, 26));
		labelApelido.setBounds(58, 184, 93, 29);
		contentPane.add(labelApelido);
		
		inputApelido = new JTextField();
		inputApelido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputApelido.setColumns(10);
		inputApelido.setBounds(177, 185, 573, 30);
		contentPane.add(inputApelido);
		
		labelTelefone = new JLabel("Telefone: ");
		labelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		labelTelefone.setBounds(58, 238, 117, 29);
		contentPane.add(labelTelefone);
		
		inputTelefone = new JTextField();
		inputTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputTelefone.setColumns(10);
		inputTelefone.setBounds(177, 239, 573, 30);
		contentPane.add(inputTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCadastrar.setBounds(58, 332, 234, 44);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnVoltar.setBounds(544, 332, 234, 44);
		contentPane.add(btnVoltar);
		
		JLabel titleCadastro = new JLabel("Cadastro de Amigos");
		titleCadastro.setFont(new Font("Tahoma", Font.BOLD, 30));
		titleCadastro.setBounds(260, 11, 318, 54);
		contentPane.add(titleCadastro);
	}
}
