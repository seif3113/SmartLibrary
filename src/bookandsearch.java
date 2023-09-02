
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class bookandsearch extends JPanel {

    ImageIcon backgroundImage = new ImageIcon("booklist.png");

    public bookandsearch() {
        DefaultListModel<Object> model = new DefaultListModel<>();
        JList<Object> list = new JList<>(model);
        list.setCellRenderer(new fiveColumnListCellRenderer(backgroundImage));
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        this.add(new JScrollPane(list), BorderLayout.CENTER);
        this.setSize(1280, 470);
        this.setBounds(260, 91, 1280, 474);

    }

}
