import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class listagem {
    public listagem(ArrayList<geral> lista){
        JFrame janela = new JFrame("Janela");
        janela.setSize(480, 360);
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Listagem");
        JPanel painelLabel = new JPanel();
        painelLabel.add(label);
        painelPrincipal.add(painelLabel);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for(geral material : lista) {
            listModel.addElement(material.toString());
        }
        JList<String> jList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(jList);
        painelPrincipal.add(scrollPane);
        janela.getContentPane().add(painelPrincipal);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

