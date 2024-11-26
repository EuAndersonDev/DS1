import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AtualizarAmigos extends JFrame {

	private JPanel contentPane;
	private JTextField inputId;
	private JTextField inputNome;
	private JTextField textField;
	private JTextField inputTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarAmigos frame = new AtualizarAmigos();
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
	public AtualizarAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleAtualiza = new JLabel("Atualizar Amigos");
		titleAtualiza.setForeground(Color.WHITE);
		titleAtualiza.setFont(new Font("Tahoma", Font.BOLD, 30));
		titleAtualiza.setBounds(272, 11, 261, 54);
		contentPane.add(titleAtualiza);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblId.setBounds(46, 113, 33, 29);
		contentPane.add(lblId);
		
		inputId = new JTextField();
		inputId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputId.setColumns(10);
		inputId.setBounds(165, 114, 607, 30);
		contentPane.add(inputId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNome.setBounds(46, 169, 76, 29);
		contentPane.add(lblNome);
		
		inputNome = new JTextField();
		inputNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputNome.setColumns(10);
		inputNome.setBounds(165, 169, 607, 30);
		contentPane.add(inputNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.WHITE);
		lblApelido.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblApelido.setBounds(46, 228, 93, 29);
		contentPane.add(lblApelido);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(165, 228, 607, 30);
		contentPane.add(textField);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTelefone.setBounds(46, 281, 109, 29);
		contentPane.add(lblTelefone);
		
		inputTelefone = new JTextField();
		inputTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		inputTelefone.setColumns(10);
		inputTelefone.setBounds(165, 282, 607, 30);
		contentPane.add(inputTelefone);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(Color.WHITE);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAtualizar.setBounds(46, 354, 234, 44);
		contentPane.add(btnAtualizar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnVoltar.setBounds(532, 354, 234, 44);
		contentPane.add(btnVoltar);
	}

}
