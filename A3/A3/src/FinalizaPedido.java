import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A classe para finalizar o pedido, a interface irá aparecer ao usuário quando for decidido quais e quantos tanques o usuário desejar.
 */
public class FinalizaPedido extends JFrame implements ActionListener {

    private JCheckBox TFfisico;
    private JCheckBox TFpix;
    private JCheckBox TFcredito;
    private JCheckBox TFboleto;
    private JButton btnFinalizar;

    /**
     * Tela de forma de pagamento do programa. Ao chamar este método, irá aparecer a janela para o usuário escolher a forma de pagamento que deseja realizar.
     */
    public FinalizaPedido() {
        super("Forma de pagamento");

        // Criando os componentes da interface
        JLabel lblEscolha = new JLabel("Escolha a forma de pagamento:");
        JLabel lblBranco = new JLabel();
        JLabel lblFisico = new JLabel("Dinheiro físico");
        TFfisico = new JCheckBox();
        JLabel lblPix = new JLabel("Chave Pix");
        TFpix = new JCheckBox();
        JLabel lblCredito = new JLabel("Credito");
        TFcredito = new JCheckBox();
        JLabel lblBoleto = new JLabel("Boleto");
        TFboleto = new JCheckBox();
        btnFinalizar = new JButton("Finalizar pedido");

        // Posicionando os componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 2, 5, 5));
        painel.add(lblEscolha);
        painel.add(lblBranco);
        painel.add(lblFisico);
        painel.add(TFfisico);
        painel.add(lblPix);
        painel.add(TFpix);
        painel.add(lblCredito);
        painel.add(TFcredito);
        painel.add(lblBoleto);
        painel.add(TFboleto);
        painel.add(btnFinalizar);

        // Adicionando o painel à tela
        getContentPane().add(painel, BorderLayout.CENTER);

        // Definindo o tamanho da tela
        setSize(400, 250);

        // Mostrando a tela
        setVisible(true);

        // Adicionando listener ao botão
        btnFinalizar.addActionListener(this);
    }

    /**
     * Este método é executado ao clique de um botão na interface gráfica.
     * @param e o evento que  será executado ao clique do botão.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean CKFisico = TFfisico.isSelected();
        boolean CKPix = TFpix.isSelected();
        boolean CKCredito = TFcredito.isSelected();
        boolean CKBoleto = TFboleto.isSelected();

        if (e.getSource() == btnFinalizar && CKFisico) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "O pedido chegará em instantes.");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        } else if (e.getSource() == btnFinalizar && CKPix) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "A chave PIX é (31)98787-1221");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        } else if (e.getSource() == btnFinalizar && CKCredito) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma nova janela.
            this.setVisible(false);
            PagamentoParcela parcela = new PagamentoParcela();
            parcela.setVisible(true);
        } else if (e.getSource() == btnFinalizar && CKBoleto) {
            // Fazer a janela atual desaparecer, ao mesmo tempo que irá aparecer uma mensagem e uma nova janela.
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "O boleto será enviado por e-mail e whatsapp.");
            Pedido pedido = new Pedido();
            pedido.setVisible(true);
        }
    }
}