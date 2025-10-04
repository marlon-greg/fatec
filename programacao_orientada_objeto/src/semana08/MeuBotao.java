import java.awt.Color;
import javax.swing.JButton;

/**
 * Exemplo de Herança para especializar um componente Swing.
 * MeuBotao É-UM JButton, mas com uma aparência customizada.
 */
public class MeuBotao extends JButton {

    /**
     * Construtor que cria o botão já com um estilo personalizado.
     * Ele chama métodos da superclasse (JButton) para configurar a aparência.
     * @param titulo O texto que será exibido no botão.
     */
    public MeuBotao(String titulo) {
        // super(titulo); // Uma chamada opcional ao construtor da superclasse

        // Métodos herdados de JButton e suas superclasses (JComponent, etc.)
        // que permitem a customização do componente.
        setBackground(Color.PINK);
        setForeground(Color.WHITE);
        setText(titulo);
    }

}
