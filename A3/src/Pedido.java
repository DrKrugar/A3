import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A classe de pedido, a interface que irá aparecer ao usuário quando ele realizar o login no aplicativo.
 */
public class Pedido extends JFrame implements ActionListener {

    private JCheckBox TFP13;
    private JCheckBox TFP14;
    private JCheckBox TFLiquinho;
    private JTextField txtP13;
    private JTextField txtP14;
    private JTextField txtLiquinho;
    private JButton btnContinuar;
    private int ValorP13 = 130;
    private int ValorP14 = 460;
    private int ValorLiquinho = 60;

    /**
     * Tela de pedido do programa. Ao chamar este método, irá aparecer a janela de pedido para o usuário.
     */
    public Pedido() {
        super("Tela de pedido");

        // Criando os componentes da interface
        JLabel lblTanques = new JLabel("Tanques");
        JLabel lblEscolha = new JLabel("Selecione o tipo");
        JLabel lblQuantidade = new JLabel("Escolha a quantidade");
        JLabel lblP13 = new JLabel("Tanque P13 - R$130");
        TFP13 = new JCheckBox();
        txtP13 = new JTextField();
        JLabel lblP14 = new JLabel("Tanque P14 - R$460");
        TFP14 = new JCheckBox();
        txtP14 = new JTextField();
        JLabel lblLiquinho = new JLabel("Tanque Liquinho - R$60");
        TFLiquinho = new JCheckBox();
        txtLiquinho = new JTextField();
        btnContinuar = new JButton("Continuar");

        // Posicionando os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 3, 5, 5));
        painel.add(lblTanques);
        painel.add(lblEscolha);
        painel.add(lblQuantidade);
        painel.add(lblP13);
        painel.add(TFP13);
        painel.add(txtP13);
        painel.add(lblP14);
        painel.add(TFP14);
        painel.add(txtP14);
        painel.add(lblLiquinho);
        painel.add(TFLiquinho);
        painel.add(txtLiquinho);
        painel.add(btnContinuar);

        // Adicionando o painel à tela
        getContentPane().add(painel, BorderLayout.CENTER);

        // Definindo o tamanho da tela
        setSize(450, 250);

        // Mostrando a tela
        setVisible(true);

        // Adicionando listener ao botão
        btnContinuar.addActionListener(this);
    }

    /**
     * Este método irá realizar o calculo do preço total entre o valor dos tanques e a quantidade dos tanques.
     * @return irá retornar o valor total do pedido.
     */
    public int calculoPreco() {
        String SQtdP13 = txtP13.getText();
        String SQtdP14 = txtP14.getText();
        String SQtdLiquinho = txtLiquinho.getText();
        boolean CKP13 = TFP13.isSelected();
        boolean CKP14 = TFP14.isSelected();
        boolean CKPLiquinho = TFLiquinho.isSelected();
        int ValorTP13 = 0;
        int ValorTP14 = 0;
        int ValorTLiquinho = 0;

        // Irá testar cada CheckBox verificando se seu valor é true ou false e calcular o valor total de cada tanque
        if (CKP13) {
            int IQtdP13 = Integer.parseInt(SQtdP13);
            ValorTP13 = ValorP13 * IQtdP13;
        }
        if (CKP14) {
            int IQtdP14 = Integer.parseInt(SQtdP14);
            ValorTP14 = ValorP14 * IQtdP14;
        }
        if (CKPLiquinho) {
            int IQtdLiquinho = Integer.parseInt(SQtdLiquinho);
            ValorTLiquinho = ValorLiquinho * IQtdLiquinho;
        }

        // Irá retornar o valor total do pedido
        return ValorTLiquinho + ValorTP13 + ValorTP14;
    }

    /**
     * Este método é executado ao clique de um botão na interface gráfica.
     * @param e o evento que  será executado ao clique do botão.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnContinuar) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "O valor total é de: R$" + calculoPreco());
            FinalizaPedido finalizar = new FinalizaPedido();
            finalizar.setVisible(true);
        }
    }
}