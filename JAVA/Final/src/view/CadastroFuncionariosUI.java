package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class CadastroFuncionariosUI extends JInternalFrame {
	private JTextField txtNomeFuncionario;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionariosUI frame = new CadastroFuncionariosUI();
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
	public CadastroFuncionariosUI() {
		setClosable(true);
		setTitle("Cadastro de Funcion\u00E1rios");
		setBounds(100, 100, 512, 228);
		
		JPanel jpCadastroColaborador = new JPanel();
		jpCadastroColaborador.setBorder(new TitledBorder(null, "Funcion\u00E1rio:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar");
		
		JButton btnCancelarCadastroFuncionario = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jpCadastroColaborador, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnCadastrarFuncionario, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCancelarCadastroFuncionario)
							.addGap(15))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroColaborador, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrarFuncionario)
						.addComponent(btnCancelarCadastroFuncionario))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		
		JLabel jlNomeFuncionario = new JLabel("Nome:");
		
		txtNomeFuncionario = new JTextField();
		txtNomeFuncionario.setColumns(10);
		
		JLabel jlCPFfuncionario = new JLabel("CPF:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel jlCNHfuncionario = new JLabel("CNH:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_jpCadastroColaborador = new GroupLayout(jpCadastroColaborador);
		gl_jpCadastroColaborador.setHorizontalGroup(
			gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlNomeFuncionario)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNomeFuncionario, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlCPFfuncionario)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlCNHfuncionario)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1)))
					.addContainerGap())
		);
		gl_jpCadastroColaborador.setVerticalGroup(
			gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNomeFuncionario)
						.addComponent(txtNomeFuncionario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCPFfuncionario)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCNHfuncionario)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		jpCadastroColaborador.setLayout(gl_jpCadastroColaborador);
		getContentPane().setLayout(groupLayout);

	}
}
