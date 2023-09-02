


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

public class fiveColumnListCellRenderer extends JPanel implements ListCellRenderer<Object> {

    private JLabel bookname = new JLabel();
    private JLabel author = new JLabel();
    private JLabel publisher = new JLabel();
    private JLabel publishingyear = new JLabel();
    private JLabel isbn = new JLabel();
    private ImageIcon background;

    public fiveColumnListCellRenderer(ImageIcon background) {
        this.background = background;
        setLayout(new GridLayout(1, 5, 0, 15));
        add(bookname);
        add(author);
        add(publisher);
        add(publishingyear);
        add(isbn);
        setOpaque(false);

    }
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof Book) {
            Book data = (Book) value;

            bookname.setForeground(Color.white);
            author.setForeground(Color.white);
            publisher.setForeground(Color.white);
            publishingyear.setForeground(Color.white);
            isbn.setForeground(Color.white);
            bookname.setText(" " + data.getTitle());
            author.setText(data.getAuthor());
            publisher.setText(data.getPublisher());
            publishingyear.setText(data.getPublishing_year());
            isbn.setText( data.getISBN());
            bookname.setFont(new Font(bookname.getFont().getName(), Font.PLAIN, 20));
            publisher.setFont(new Font(bookname.getFont().getName(), Font.PLAIN, 20));
            author.setFont(new Font(bookname.getFont().getName(), Font.PLAIN, 20));
            publishingyear.setFont(new Font(bookname.getFont().getName(), Font.PLAIN, 20));
            isbn.setFont(new Font(bookname.getFont().getName(), Font.PLAIN, 20));

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
