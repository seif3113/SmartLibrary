
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class customer extends JPanel {

    public static DefaultListModel<Object> model = new DefaultListModel<>();
    ImageIcon backgroundImage = new ImageIcon("listback.png");

    public customer() {

        JList<Object> list = new JList<>(model);
        list.setBackground(Color.black);
        list.setCellRenderer(new fourColumnListCellRenderer(backgroundImage));
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        this.add(new JScrollPane(list), BorderLayout.CENTER);
        this.setSize(1280, 470);
        this.setBounds(260, 91, 1280, 474);

    }

}
