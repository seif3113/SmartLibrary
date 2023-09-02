

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class booksearch extends JPanel {

    ImageIcon backgroundImage = new ImageIcon("booklist.png");
    public static DefaultListModel<Object> model = new DefaultListModel<>();

    public booksearch() {

        JList<Object> list = new JList<>(model);
        list.setCellRenderer(new fiveColumnListCellRenderersearch(backgroundImage));
        list.setBackground(Color.black);
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        this.add(new JScrollPane(list), BorderLayout.CENTER);
        this.setSize(1280, 470);
        this.setBounds(260, 91, 1280, 474);

    }

}
