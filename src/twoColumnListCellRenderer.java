

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class twoColumnListCellRenderer extends JPanel implements ListCellRenderer<Object> {

    private JLabel nameLabel = new JLabel();
    private JLabel passLabel = new JLabel();
    private ImageIcon background;

    public twoColumnListCellRenderer(ImageIcon background) {
        this.background = background;
        setLayout(new GridLayout(1, 2, -10, 15));
        add(nameLabel);
        add(passLabel);
        setOpaque(false);

    }

    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Login) {
            Login data = (Login) value;
            nameLabel.setForeground(Color.white);
            passLabel.setForeground(Color.white);
            nameLabel.setText("  " + data.getUsername());
            passLabel.setText(data.getPassword());
            nameLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
            passLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
        }

        return this;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null) {
            g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }

}
