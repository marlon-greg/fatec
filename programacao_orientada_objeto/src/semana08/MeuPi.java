import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe que cria uma janela (JFrame) para demonstrar o uso de botões
 * padrão (JButton) e personalizados (MeuBotao).
 */
public class MeuPi extends JFrame {

    private JButton btOriginal;
    private MeuBotao btPersonalizado;

    /**
     * Construtor da janela.
     * Configura o tamanho, layout, cria e adiciona os botões à tela.
     * Também define as ações (eventos de clique) para cada botão.
     */
    public MeuPi() {
        // Configurações da janela (JFrame)
        setTitle("Demonstração de Botões");
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // Cria uma instância do botão padrão do Swing
        btOriginal = new JButton("Original");

        // Cria uma instância do nosso botão personalizado
        btPersonalizado = new MeuBotao("Personalizado");

        // Adiciona os botões à janela. O método add aceita qualquer Component,
        // o que é um exemplo de polimorfismo. Tanto JButton quanto MeuBotao são Componentes.
        add(btOriginal);
        add(btPersonalizado);

        // Adiciona um "ouvinte de ação" (ActionListener) para o botão personalizado.
        // A ação é definida usando uma expressão lambda.
        btPersonalizado.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(btPersonalizado, "Botão Personalizado Clicado!");
        });

        // Adiciona um "ouvinte de ação" para o botão original.
        btOriginal.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(btOriginal, "Botão Original Clicado!");
        });
    }

    /**
     * Método principal que cria e exibe a janela.
     */
    public static void main(String[] args) {
        MeuPi pi = new MeuPi();
        // Torna a janela visível para o usuário.
        pi.setVisible(true);
    }
}
