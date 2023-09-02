

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//manuser.model
public class manuser extends JPanel {

    static int ind = -1;
    ImageIcon backgroundImage = new ImageIcon("listuser.png");
    public static DefaultListModel<Login> model1 = new DefaultListModel<>();

    public manuser() {

        JList<Login> list = new JList<>(model1);
        list.setCellRenderer(new twoColumnListCellRenderer(backgroundImage));
        list.setBackground(Color.black);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && list.getSelectedIndex() != -1) {
                    int selectedIndex = list.getSelectedIndex();
                    homepage.text1.setText(model1.get(selectedIndex).getUsername());
                    homepage.text2.setText(model1.get(selectedIndex).getPassword());
                    ind = selectedIndex;
                }
            }
        });

        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 13));
        this.add(new JScrollPane(list), BorderLayout.CENTER);
        this.setSize(640, 470);
        setBounds(640, 50, 640, 550);
    }
}
