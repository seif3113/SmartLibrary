
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

 public class fourColumnListCellRenderer extends JPanel implements ListCellRenderer<Object> {
   
    private JLabel nameLabel = new JLabel();
    private JLabel phoneLabel = new JLabel();
    private JLabel genderLabel = new JLabel();
    private JLabel eamilLabel = new JLabel();
    private ImageIcon background;

    public fourColumnListCellRenderer(ImageIcon background) {
        this.background = background;
       setLayout(new GridLayout(1, 4, 10, 10));  
       
        add(nameLabel);
        add(phoneLabel);
        add(eamilLabel);
        add(genderLabel);
        setOpaque(false);
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Customerdata) {
            Customerdata data = (Customerdata) value;
            nameLabel.setForeground(Color.white);
            phoneLabel.setForeground(Color.white);
            eamilLabel.setForeground(Color.white);
             genderLabel.setForeground(Color.white);
            nameLabel.setText("  "+data.getName());
            phoneLabel.setText(data.getPhone_num());
            eamilLabel.setText( data.getEmail());
             genderLabel.setText(data.getGender());

            nameLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
            genderLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
            phoneLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
            eamilLabel.setFont(new Font(nameLabel.getFont().getName(), Font.PLAIN, 20));
        }

        return this;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background != null) {
            g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }

}