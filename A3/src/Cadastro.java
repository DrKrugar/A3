import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A classe de cadastro, onde irá aparecer a interface de cadastro para o usuário.
 */
public class Cadastro extends JFrame implements ActionListener {

    private JTextField txtUsuario;
    private JTextField txtemail;
    private JTextField txtbairro;
    private JTextField txtendereco;
    private JTextField txttelefone;
    private JPasswordField txtSenha;
    private JButton btnCadastrar;

    /**
     * Tela de cadastro do programa. Ao chamar este método, irá aparecer a janela de cadastro para o usuário.
     */
    public Cadastro() {
        super("Tela de Cadastro");

        // Criando os componentes da interface
        JLabel lblUsuario = new JLabel("nome:");
        txtUsuario = new JTextField();
        JLabel lblemail = new JLabel("email:");
        txtemail = new JTextField();
        JLabel lblbairro = new JLabel("bairro:");
        txtbairro = new JTextField();
        JLabel lblendereco = new JLabel("endereço:");
        txtendereco = new JTextField();
        JLabel lbltelefone = new JLabel("endereço:");
        txttelefone = new JTextField();
        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();
        btnCadastrar = new JButton("Cadastrar");

        // Posicionando os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(7, 2, 3, 3));
        painel.add(lblUsuario);
        painel.add(txtUsuario);
        painel.add(lblemail);
        painel.add(txtemail);
        painel.add(lblbairro);
        painel.add(txtbairro);
        painel.add(lblendereco);
        painel.add(txtendereco);
        painel.add(lbltelefone);
        painel.add(txttelefone);
        painel.add(lblSenha);
        painel.add(txtSenha);
        painel.add(btnCadastrar);

        // Adicionando o painel à tela
        getContentPane().add(painel, BorderLayout.CENTER);

        // Definindo o tamanho da tela
        setSize(300, 250);

        // Adicionando listener ao botão
        btnCadastrar.addActionListener(this);
    }

    /**
     * Este método é executado ao clique de um botão na interface gráfica.
     *
     * @param e o evento que  será executado ao clique do botão.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificando se o botão precionado foi o botão de cadastrar.
        if (e.getSource() == btnCadastrar) {
            // Abrindo a próxima tela
            JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso!");
            this.setVisible(false);
            App App = new App();
            App.setVisible(true);

        }
    }
}