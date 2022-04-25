package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Sistema de chamados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 454);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu jmCadastros = new JMenu("Cadastros");
		jbPrincipal.add(jmCadastros);
		
		JMenuItem jmiFuncionario = new JMenuItem("Funcion\u00E1rio");
		jmiFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFuncionariosUI cadFuncionario = new CadastroFuncionariosUI () ;
				cadFuncionario.setVisible(true);
				contentPane.add(cadFuncionario, 0);
				
			}
		});
		jmCadastros.add(jmiFuncionario);
		
		JMenuItem jmiVeiculos = new JMenuItem("Ve\u00EDculo");
		jmCadastros.add(jmiVeiculos);
		
		JMenuItem jmiChamado = new JMenuItem("Chamado");
		jmCadastros.add(jmiChamado);
		
		JMenu jmConsultas = new JMenu("Consultas");
		jbPrincipal.add(jmConsultas);
		
		JMenuItem jmiConsultaFuncionario = new JMenuItem("Funcion\u00E1rios");
		jmConsultas.add(jmiConsultaFuncionario);
		
		JMenuItem jmiConsultaVeiculo = new JMenuItem("Ve\u00EDculos");
		jmConsultas.add(jmiConsultaVeiculo);
		
		JMenuItem jmiConsultaChamado = new JMenuItem("Chamados");
		jmConsultas.add(jmiConsultaChamado);
		
		JMenu jmTeste = new JMenu("Teste");
		jbPrincipal.add(jmTeste);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 251, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
