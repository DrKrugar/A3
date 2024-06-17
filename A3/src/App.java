import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A classe principal do aplicativo, onde irá aparecer a primeira tela de interface de login
 */
public class App extends JFrame implements ActionListener {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btncadastro;
    private JButton btnEntrar;

    /**
     * Tela de login do programa. Ao chamar este método, irá aparecer a janela de login para o usuário.
     */
    public App() {
        super("Tela de Login");

        // Criando os componentes da interface
        JLabel lblUsuario = new JLabel("Usuário:");
        txtUsuario = new JTextField();
        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();
        btncadastro = new JButton("Cadastrar");
        btnEntrar = new JButton("Entrar");


        // Posicionando os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 5, 5));
        painel.add(lblUsuario);
        painel.add(txtUsuario);
        painel.add(lblSenha);
        painel.add(txtSenha);
        painel.add(btnEntrar);
        painel.add(btncadastro);

        // Adicionando o painel à tela
        getContentPane().add(painel, BorderLayout.CENTER);

        // Definindo o tamanho da tela
        setSize(300, 150);

        // Mostrando a tela
        setVisible(true);

        // Adicionando listener ao botão
        btnEntrar.addActionListener(this);
        btncadastro.addActionListener(this);
    }

    /**
     * Este método é executado ao clique de um botão na interface gráfica.
     * @param e o evento que  será executado ao clique do botão.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificando se o usuário e senha estão corretos
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("1234") && (e.getSource() == btnEntrar)) {
            // Abrindo a próxima tela
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
            this.setVisible(false);
            Pedido pedido = new Pedido();
            pedido.setVisible(true);

            // Exemplo: abrir tela principal
        } else if (e.getSource() == btncadastro) {
            this.setVisible(false);
            Cadastro cadastro = new Cadastro();
            cadastro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}