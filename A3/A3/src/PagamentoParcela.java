import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A classe de pagamento da parcela, a interface que irá aparecer ao usuário caso escolha a opção de pagamento por cartão de crédito.
 */
public class PagamentoParcela extends JFrame implements ActionListener {
    private JCheckBox TF1x;
    private JCheckBox TF2x;
    private JCheckBox TF3x;
    private JTextField numCartao;
    private JTextField numCVC;
    private JTextField validade;
    private JTextField nome;
    private JButton btnParcelar;

    /**
     * O método de escolha das parcelas do programa. Ao chamar este método, irá ser aberto a janela para o usuário escolher em quantas vezes deseja dividir o pedido.
     */
    public PagamentoParcela(){
        super("Parcelas");

            // Criando os componentes da interface
            JLabel lbl1x = new JLabel("Dividir de 1x");
            TF1x = new JCheckBox();
            JLabel lbl2x = new JLabel("Dividir de 2x");
            TF2x = new JCheckBox();
            JLabel lbl3x = new JLabel("Dividir de 3x");
            TF3x = new JCheckBox();
            JLabel lblNumCartao = new JLabel("Número do cartão");
            numCartao = new JTextField();
            JLabel lblCVC = new JLabel("Código de segurança");
            numCVC = new JTextField();
            JLabel lblValidade = new JLabel("Validade");
            validade = new JTextField("mm/aa");
            JLabel lblNome = new JLabel("Nome no cartão");
            nome = new JTextField();
            btnParcelar = new JButton("Finalizar pedido");


            // Posicionando os componentes
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(8, 2, 2, 2));
            painel.add(lbl1x);
            painel.add(TF1x);
            painel.add(lbl2x);
            painel.add(TF2x);
            painel.add(lbl3x);
            painel.add(TF3x);
            painel.add(lblNumCartao);
            painel.add(numCartao);
            painel.add(lblCVC);
            painel.add(numCVC);
            painel.add(lblValidade);
            painel.add(validade);
            painel.add(lblNome);
            painel.add(nome);
            painel.add(btnParcelar);

            // Adicionando o painel à tela
            getContentPane().add(painel, BorderLayout.CENTER);

            // Definindo o tamanho da tela
            setSize(600, 250);

            // Mostrando a tela
            setVisible(true);

            // Adicionando listener ao botão
            btnParcelar.addActionListener(this);
    }

    /**
     * Este método é executado ao clique de um botão na interface gráfica.
     * @param e o evento que  será executado ao clique do botão.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean CK1x = TF1x.isSelected();
        boolean CK2x = TF2x.isSelected();
        boolean CK3x = TF3x.isSelected();

        if (e.getSource() == btnParcelar && CK1x) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        } else if (e.getSource() == btnParcelar && CK2x) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        } else if (e.getSource() == btnParcelar && CK3x) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        }
    }
}