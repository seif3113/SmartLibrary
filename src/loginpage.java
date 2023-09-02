

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class loginpage extends JFrame implements ActionListener, MouseListener {

    static ArrayList<Login> users = new ArrayList();
    JButton buttonlogin;
    static JPanel panele;
    Border border = BorderFactory.createLineBorder(Color.darkGray, 1);
    public String name;
    public static JTextField text11;
    public static JPasswordField text22;

    public loginpage() {

        //images
        ImageIcon icon = new ImageIcon("icon.png");
        ImageIcon icon1 = new ImageIcon("lib.png");

        //left photo
        JLabel llib = new JLabel();
        llib.setIcon(icon1);
        llib.setSize(429, 600);
        llib.setBounds(0, 0, 429, 600);

        //logintext
        JLabel ltext = new JLabel();
        ltext.setText("Login");
        ltext.setForeground(Color.white);
        ltext.setFont(new Font("BOLD", Font.BOLD, 50));
        ltext.setSize(200, 200);
        ltext.setBounds(503, 0, 200, 200);

        //button buttonlogin
        buttonlogin = new JButton("LOGIN");
        buttonlogin.setBackground(Color.black);
        buttonlogin.setForeground(Color.white);
        buttonlogin.setFont(new Font("BOLD", Font.CENTER_BASELINE, 10));
        buttonlogin.setBounds(28, 150, 220, 25);
        buttonlogin.setFocusable(false);
        buttonlogin.setBorder(border);
        buttonlogin.addActionListener(this);
        buttonlogin.setContentAreaFilled(false);
        buttonlogin.addMouseListener(this);

        //labels enter
        JLabel label11 = new JLabel("Username");
        JLabel label22 = new JLabel("Password");
        label11.setForeground(Color.white);
        label22.setForeground(Color.white);
        label11.setBounds(28, 5, 150, 20);
        label22.setBounds(28, 65, 150, 20);

        //jtexts enter
        text11 = new JTextField();
        text22 = new JPasswordField();
        text11.setPreferredSize(new Dimension(220, 70));
        text22.setPreferredSize(new Dimension(220, 70));
        text11.setBounds(28, 30, 220, 20);
        text22.setBounds(28, 90, 220, 20);

        //panel enter
        panele = new JPanel();
        panele.setBackground(Color.black);
        panele.add(text11);
        panele.add(text22);
        panele.add(label11);
        panele.add(label22);
        panele.add(buttonlogin);
        panele.setLayout(null);
        panele.setBounds(475, 200, 275, 200);
        panele.setAutoscrolls(true);

        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Smart Library");
        this.setResizable(false);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);   // to statrt frame at center of screen
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        this.add(llib);
        this.add(ltext);
        this.add(panele);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = "admin";
        if (e.getSource() == buttonlogin) {
            boolean access = false;
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUsername().equals(text11.getText()) && users.get(i).getPassword().equals(text22.getText())) {
                    access = true;
                    s = users.get(i).getUsername();
                    break;
                }

            }
            if ((text11.getText().equals("admin") && text22.getText().equals("1234")) || access) {

                new homepage(s);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect UserName or Password", "Warnning", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        buttonlogin.setForeground(Color.darkGray);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        buttonlogin.setForeground(Color.white);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void removeUser(String name, String password, int i) {
        if (!(i == -1)) {
            loginpage.users.remove(i);
            manuser.model1.remove(i);
            homepage.text1.setText(null);
            homepage.text2.setText(null);
            manuser.ind = -1;
        } else {
            JOptionPane.showMessageDialog(null, "select user to remove", "Warnning", JOptionPane.ERROR_MESSAGE);
        }
        manuser.ind = -1;
    }

    public static void addUser(String name, String password) {
        if (manuser.ind == -1) {

            boolean f = true;

            for (int i = 0; i < loginpage.users.size(); i++) {
                if (homepage.text1.getText().equals(loginpage.users.get(i).getUsername())) {
                    f = false;
                    JOptionPane.showMessageDialog(null, "UserName Already Taken", "Warnning", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            if (f) {
                Login l = new Login(name, password);
                loginpage.users.add(l);
                int i = loginpage.users.indexOf(l);
                manuser.model1.addElement(loginpage.users.get(i));
                homepage.text1.setText(null);
                homepage.text2.setText(null);
                manuser.ind = -1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Edit ", "Warnning", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void editUser(String name, String pass, int i) {
        if (!(i == -1)) {
            boolean f = true;
            for (int j = 0; j < loginpage.users.size(); j++) {
                if (homepage.text1.getText().equals(loginpage.users.get(j).getUsername())) {
                    if (j==manuser.ind) continue;
                    f = false;
                    JOptionPane.showMessageDialog(null, "UserName Already Taken", "Warnning", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
            if (f) {
                Login l = new Login(name, pass);
                loginpage.users.add(l);
                int j = loginpage.users.indexOf(l);
                manuser.model1.addElement(loginpage.users.get(j));
                loginpage.users.remove(i);
                manuser.model1.remove(i);
                homepage.text1.setText(null);
                homepage.text2.setText(null);
                manuser.ind = -1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "select user to edit", "Warnning", JOptionPane.ERROR_MESSAGE);
        }
    }

}
