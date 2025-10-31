package semana10;

import javax.swing.*;
import java.awt.*;

public class MeuFrame extends JFrame implements Botao, Caixa {

        public MeuFrame() {
            setTitle("Usando interfaces");
            setBounds(200,200,500,200);
            tf.setText("Ola");
            bt.setText("Clique");
            setLayout(new FlowLayout());
            add(tf);
            add(bt);
        }

    public static void main(String[] args) {
        MeuFrame f = new MeuFrame();
        f.setVisible(true);
    }
}
