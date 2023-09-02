
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class homepage extends JFrame implements ActionListener, MouseListener {

    int flag = 2;
    Border border = BorderFactory.createLineBorder(Color.decode("#1B1B1B"));
    Border borders = BorderFactory.createLineBorder(new Color(0, 0, 0, 0));
    static JLabel userp;
    public static JTextField text1;
    public static JTextField text2;
    //menu buttons
    JButton homeb;
    JButton dashb;
    JButton bookb;
    JButton sellbookb;
    JButton manbookb;
    JButton manuserb;
    JButton selledbookb;
    JButton customersb;
    JButton logoutb;
    //*
    //home
    JLabel home1;
    //*
    //dashboard
    JLabel dashboard1;
    JLayeredPane dashpp;
    JLabel userl;
    JLabel bookl;
    //*

    // book and search
    JPanel bookandsearchp;
    JLabel bookandsearchl;
    JLabel search;
    JButton searchb;
    JTextField searcht;
    //*

    //man books  
    JLayeredPane manbooks;
    JLabel manbk;
    JButton removeb;
    JButton addb;
    JTextField booknamet;
    JTextField authort;
    JTextField publisheryeart;
    JTextField isbnt;
    JTextField publishert;
    JComboBox<String> manbookc;
    //*
    //  sell book
    JLabel sellbook;
    JButton newb;
    JButton exsistb;
    JButton sell;
    JComboBox customers;
    JLayeredPane sellbooklp;
    JLabel newl;
    JLabel newlp;
    JComboBox books;
    JTextField namecustt;
    JTextField phonecustt;
    JTextField emailcustt;
    JLabel selll;
    JLabel custl;
    JRadioButton Male;
    JRadioButton Female;
    ButtonGroup groupmf;

    //*
    //man user
    JLayeredPane manusers;
    JPanel userdata;
    JLabel user1;
    JButton addub;
    JButton editub;
    JButton removeub;

    ///*
    //selled book
    JPanel selledbookp;
    JLabel selledbl;
    //*

    //customer 
    JPanel custp;
    JLabel custll;

    //*
    public homepage(String s) {
        // this.s =s;
        ImageIcon iconpp = new ImageIcon("icon.png");
        ImageIcon icon2 = new ImageIcon("menu.png");
        ImageIcon icon3 = new ImageIcon("user.png");
        ImageIcon icon0 = new ImageIcon("logout.png");
        ImageIcon icon00 = new ImageIcon("dislogout.png");
        ImageIcon icons = new ImageIcon("search.png");
        ImageIcon iconsellb = new ImageIcon("sellbook.png");
        ImageIcon newp = new ImageIcon("newi.png");
        ImageIcon man = new ImageIcon("manuser.png");
        ImageIcon manb = new ImageIcon("manbook.png");
        ImageIcon icon4 = new ImageIcon("dashboad.png");
        ImageIcon iconhh = new ImageIcon("home.png");

        //logout
        JLabel logout = new JLabel();
        logout.setIcon(icon0);
        logout.setSize(30, 30);
        logout.setBounds(30, 600, 30, 30);

        //dislogout
        JLabel dislogout = new JLabel();
        dislogout.setIcon(icon00);
        dislogout.setSize(20, 20);
        dislogout.setBounds(30, 726, 20, 20);

        //uprigth user photo
        userp = new JLabel();
        userp.setIcon(icon3);
        userp.setText(s);
        userp.setForeground(Color.white);
        userp.setFont(new Font("PLANE", Font.PLAIN, 18));
        userp.setVerticalTextPosition(JLabel.CENTER);
        userp.setHorizontalTextPosition(JLabel.RIGHT);
        userp.setIconTextGap(20);
        userp.setSize(200, 50);
        userp.setBounds(1300, 5, 200, 50);

        //menu photo*
        JLabel menul = new JLabel();
        menul.setIcon(icon2);
        menul.setSize(260, 820);
        menul.setBounds(0, 0, 260, 820);

        //menu bar buttons
        homeb = new JButton("Home");
        dashb = new JButton("Dashboard");
        bookb = new JButton("Books And Search");
        sellbookb = new JButton("Sell Book");
        manbookb = new JButton("Manage Books");
        manuserb = new JButton("Manage Users");
        selledbookb = new JButton("Selled Books");
        customersb = new JButton("Customers");
        logoutb = new JButton("Log Out");

        homeb.setBounds(60, 97, 185, 25);
        homeb.setForeground(Color.white);
        homeb.setBackground(Color.decode("#1B1B1B"));
        homeb.setBorder(border);
        homeb.setFont(new Font(homeb.getFont().getName(), Font.PLAIN, 20));
        homeb.setHorizontalAlignment(SwingConstants.LEFT);
        homeb.setFocusable(false);
        homeb.addActionListener(this);
        homeb.setContentAreaFilled(false);

        dashb.setBounds(60, 142, 185, 25);
        dashb.setForeground(Color.white);
        dashb.setBackground(Color.decode("#1B1B1B"));
        dashb.setBorder(border);
        dashb.setFont(new Font(dashb.getFont().getName(), Font.PLAIN, 20));
        dashb.setHorizontalAlignment(SwingConstants.LEFT);
        dashb.setFocusable(false);
        dashb.addActionListener(this);
        dashb.setContentAreaFilled(false);

        bookb.setBounds(60, 187, 185, 25);
        bookb.setForeground(Color.white);
        bookb.setBackground(Color.decode("#1B1B1B"));
        bookb.setBorder(border);
        bookb.setFont(new Font(bookb.getFont().getName(), Font.PLAIN, 20));
        bookb.setHorizontalAlignment(SwingConstants.LEFT);
        bookb.setFocusable(false);
        bookb.addActionListener(this);
        bookb.setContentAreaFilled(false);
        //bookb.addMouseListener(this);

        sellbookb.setBounds(60, 232, 185, 25);
        sellbookb.setForeground(Color.white);
        sellbookb.setBackground(Color.decode("#1B1B1B"));
        sellbookb.setBorder(border);
        sellbookb.setFont(new Font(sellbookb.getFont().getName(), Font.PLAIN, 20));
        sellbookb.setHorizontalAlignment(SwingConstants.LEFT);
        sellbookb.setFocusable(false);
        sellbookb.addActionListener(this);
        sellbookb.setContentAreaFilled(false);
        //sellbook.addMouseListener(this);

        manbookb.setBounds(60, 277, 185, 25);
        manbookb.setForeground(Color.white);
        manbookb.setBackground(Color.decode("#1B1B1B"));
        manbookb.setBorder(border);
        manbookb.setFont(new Font(manbookb.getFont().getName(), Font.PLAIN, 20));
        manbookb.setHorizontalAlignment(SwingConstants.LEFT);
        manbookb.setFocusable(false);
        manbookb.setContentAreaFilled(false);
        manbookb.addActionListener(this);

        manuserb.setBounds(60, 322, 185, 25);
        manuserb.setForeground(Color.white);
        manuserb.setBackground(Color.decode("#1B1B1B"));
        manuserb.setBorder(border);
        manuserb.setFont(new Font(manuserb.getFont().getName(), Font.PLAIN, 20));
        manuserb.setHorizontalAlignment(SwingConstants.LEFT);
        manuserb.setFocusable(false);
        manuserb.setContentAreaFilled(false);
        manuserb.addActionListener(this);
        // manuserb.addMouseListener(this);

        selledbookb.setBounds(60, 367, 185, 25);
        selledbookb.setForeground(Color.white);
        selledbookb.setBackground(Color.decode("#1B1B1B"));
        selledbookb.setBorder(border);
        selledbookb.setFont(new Font(selledbookb.getFont().getName(), Font.PLAIN, 20));
        selledbookb.setHorizontalAlignment(SwingConstants.LEFT);
        selledbookb.setFocusable(false);
        selledbookb.addActionListener(this);
        selledbookb.setContentAreaFilled(false);
        // selledbookb.addMouseListener(this);

        customersb.setBounds(60, 412, 185, 25);
        customersb.setForeground(Color.white);
        customersb.setBackground(Color.decode("#1B1B1B"));
        customersb.setBorder(border);
        customersb.setFont(new Font(customersb.getFont().getName(), Font.PLAIN, 20));
        customersb.setHorizontalAlignment(SwingConstants.LEFT);
        customersb.setFocusable(false);
        customersb.addActionListener(this);
        customersb.setContentAreaFilled(false);
        // customersb.addMouseListener(this);

        logoutb.setBounds(60, 602, 185, 25);
        logoutb.setForeground(Color.decode("#FE0000"));
        logoutb.setBackground(Color.decode("#1B1B1B"));
        logoutb.setBorder(border);
        logoutb.setFont(new Font(logoutb.getFont().getName(), Font.PLAIN, 20));
        logoutb.setHorizontalAlignment(SwingConstants.LEFT);
        logoutb.setFocusable(false);
        logoutb.addActionListener(this);
        logoutb.setContentAreaFilled(false);

        //menu layer pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(220, 1540));
        layeredPane.setBounds(0, 0, 260, 1540);
        layeredPane.add(menul, Integer.valueOf(0));
        layeredPane.add(homeb, Integer.valueOf(1));
        layeredPane.add(dashb, Integer.valueOf(1));
        layeredPane.add(bookb, Integer.valueOf(1));
        layeredPane.add(sellbookb, Integer.valueOf(1));
        layeredPane.add(manbookb, Integer.valueOf(1));
        layeredPane.add(manuserb, Integer.valueOf(1));
        layeredPane.add(selledbookb, Integer.valueOf(1));
        layeredPane.add(customersb, Integer.valueOf(1));
        layeredPane.add(logoutb, Integer.valueOf(1));
        layeredPane.add(dislogout, Integer.valueOf(1));
        layeredPane.add(logout, Integer.valueOf(1));

        //home 
        home1 = new JLabel();
        home1.setIcon(iconhh);

        home1.setSize(1280, 550);
        home1.setBounds(260, 62, 1280, 550);

        // dashboard from menu
        //labels numbers chanege
        dashboard1 = new JLabel();
        dashboard1.setPreferredSize(new Dimension(1280, 550));
        dashboard1.setIcon(icon4);
        dashboard1.setBounds(0, 0, 1280, 550);
        userl = new JLabel();
        bookl = new JLabel();
        selll = new JLabel();
        custl = new JLabel();

        userl.setText(String.valueOf(loginpage.users.size()));
        userl.setForeground(Color.decode("#012059"));
        userl.setBounds(130, 325, 100, 100);
        userl.setFont(new Font(userl.getFont().getName(), Font.PLAIN, 80));

        bookl.setText(String.valueOf(Book.booksarr.size()));
        bookl.setForeground(Color.decode("#104486"));
        bookl.setBounds(437, 325, 100, 100);
        bookl.setFont(new Font(bookl.getFont().getName(), Font.PLAIN, 80));

        selll.setText(String.valueOf(Customerdata.customersdata.size()));
        selll.setForeground(Color.decode("#3D4E71"));
        selll.setBounds(750, 325, 100, 100);
        selll.setFont(new Font(selll.getFont().getName(), Font.PLAIN, 80));

        custl.setText(String.valueOf(Book.selledBooks.size()));
        custl.setForeground(Color.decode("#999999"));
        custl.setBounds(1057, 325, 100, 100);
        custl.setFont(new Font(custl.getFont().getName(), Font.PLAIN, 80));

        //layered pane to add dashboard components
        dashpp = new JLayeredPane();
        dashpp.setPreferredSize(new Dimension(1280, 550));
        dashpp.setBounds(250, 62, 1280, 550);
        dashpp.add(dashboard1, Integer.valueOf(0));
        dashpp.add(userl, Integer.valueOf(1));
        dashpp.add(bookl, Integer.valueOf(1));
        dashpp.add(selll, Integer.valueOf(1));
        dashpp.add(custl, Integer.valueOf(1));

        //book and search 
        bookandsearchp = new booksearch();
        ImageIcon icon8 = new ImageIcon("selledbk.png");
        bookandsearchl = new JLabel();
        bookandsearchl.setIcon(icon8);
        bookandsearchl.setBounds(260, 61, 1280, 30);

        //text field search 
        searcht = new JTextField("enter the name of book ....");
        searcht.setPreferredSize(new Dimension(650, 22));
        searcht.setBounds(50, 7, 620, 22);
        searcht.setOpaque(false);
        searcht.setBorder(borders);
        searcht.setFont(new Font(searcht.getFont().getName(), Font.PLAIN, 13));
        searcht.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                searcht.setText("");
                searcht.removeKeyListener(this);
                searcht.setFont(new Font(searcht.getFont().getName(), Font.PLAIN, 15));
                searcht.setForeground(Color.white);

            }
        });

        //button search 
        searchb = new JButton("Search");
        searchb.setFont(new Font(searchb.getFont().getName(), Font.PLAIN, 26));
        searchb.setBounds(667, 5, 110, 25);
        searchb.setBackground(Color.decode("#1B1B1B"));
        searchb.setBorder(border);
        searchb.setFocusable(false);
        searchb.setForeground(Color.white);
        searchb.setContentAreaFilled(false);
        searchb.addMouseListener(this);
        searchb.addActionListener(this);

        //search icon
        search = new JLabel();
        search.setIcon(icons);
        search.add(searcht);
        search.add(searchb);
        search.setSize(800, 35);
        search.setBounds(260, 15, 800, 35);
        search.setLayout(null);

        books = new JComboBox();
        for (int i = 0; i < Book.bookname.size(); i++) {
            books.addItem(Book.bookname.get(i));
        }
        books.setBounds(120, 100, 400, 40);
        books.setOpaque(false);
        //books.setBackground(new Color(0, 0, 0, 0));
        books.setBorder(borders);
        books.setForeground(Color.white);
        books.setFocusable(false);
        books.setBackground(Color.decode("#010A1B"));
        books.setBorder(borders);
        books.setFont(new Font("Arial", Font.PLAIN, 21));

        // cutomer information 
        newb = new JButton("New") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 197, 39, 20, 20);

            }
        ;
        };
                
         exsistb = new JButton("Existing") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 197, 39, 20, 20);

            }
        ;
        };
        newb.setOpaque(false);
        newb.setBackground(new Color(0, 0, 0, 0));
        exsistb.setOpaque(false);
        exsistb.setBackground(new Color(0, 0, 0, 0));
        newb.setBounds(740, 100, 200, 40);
        exsistb.setBounds(1004, 100, 200, 40);
        newb.setBorder(borders);
        exsistb.setBorder(borders);
        newb.setFocusable(false);
        exsistb.setFocusable(false);
        newb.setForeground(Color.white);
        exsistb.setForeground(Color.white);
        newb.setFont(new Font(newb.getFont().getName(), Font.PLAIN, 25));
        exsistb.setFont(new Font(exsistb.getFont().getName(), Font.PLAIN, 25));
        newb.addActionListener(this);
        exsistb.addActionListener(this);
        newb.setContentAreaFilled(false);
        exsistb.setContentAreaFilled(false);
        newb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                newb.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                newb.setForeground(Color.white);
            }
        });
        exsistb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                exsistb.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                exsistb.setForeground(Color.white);
            }
        });

        //selsect new
        newl = new JLabel();
        newl.setSize(535, 295);
        namecustt = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 30, 20, 20);
            }
        };
        namecustt.setOpaque(false);
        namecustt.setBackground(new Color(0, 0, 0, 0));
        namecustt.setBorder(borders);
        namecustt.setBounds(200, 30, 250, 33);
        namecustt.setFont(new Font(namecustt.getFont().getName(), Font.PLAIN, 20));
        namecustt.setForeground(Color.white);
        newl.add(namecustt);

        phonecustt = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 30, 20, 20);
            }
        };
        phonecustt.setOpaque(false);
        phonecustt.setBackground(new Color(0, 0, 0, 0));
        phonecustt.setBorder(borders);
        phonecustt.setBounds(200, 74, 250, 33);
        phonecustt.setFont(new Font(phonecustt.getFont().getName(), Font.PLAIN, 20));
        phonecustt.setForeground(Color.white);
        newl.add(phonecustt);

        emailcustt = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 30, 20, 20);
            }
        };
        emailcustt.setOpaque(false);
        emailcustt.setBackground(new Color(0, 0, 0, 0));
        emailcustt.setBorder(borders);
        emailcustt.setBounds(200, 118, 250, 33);
        emailcustt.setFont(new Font(emailcustt.getFont().getName(), Font.PLAIN, 20));
        emailcustt.setForeground(Color.white);
        newl.add(emailcustt);

        Male = new JRadioButton("Male");
        Female = new JRadioButton("Female");
        Male.setBounds(200, 162, 100, 30);
        Female.setBounds(370, 162, 100, 30);
        Male.setFocusable(false);
        Female.setFocusable(false);
        Male.setContentAreaFilled(false);
        Female.setContentAreaFilled(false);
        Male.setForeground(Color.white);
        Female.setForeground(Color.white);
        Male.setFont(new Font(emailcustt.getFont().getName(), Font.PLAIN, 17));
        Female.setFont(new Font(emailcustt.getFont().getName(), Font.PLAIN, 17));

        groupmf = new ButtonGroup();
        groupmf.add(Male);
        groupmf.add(Female);

        newl.add(Male);
        newl.add(Female);

        newl.setBounds(699, 190, 535, 295);
        newl.setLayout(null);

        newlp = new JLabel();
        newlp.setIcon(newp);
        newlp.setBounds(722, 200, 181, 224);

        // select exsisting 
        customers = new JComboBox();
        for (int i = 0; i < Customerdata.customersdata.size(); i++) {
            customers.addItem(Customerdata.customersdata.get(i).getName());
        }
        customers.setBounds(780, 200, 400, 40);
        customers.setOpaque(false);
        customers.setBackground(new Color(0, 0, 0, 0));
        customers.setBorder(borders);
        customers.setBackground(Color.decode("#435475"));
        customers.setForeground(Color.white);
        customers.setFont(new Font("Arial", Font.PLAIN, 21));

        // button sell
        sell = new JButton("Sell") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 197, 39, 20, 20);
            }
        ;
        };
        sell.setOpaque(false);
        sell.setBackground(new Color(0, 0, 0, 0));
        sell.setBounds(220, 420, 200, 40);
        sell.setBorder(borders);
        sell.setFocusable(false);
        sell.setForeground(Color.white);
        sell.setFont(new Font(exsistb.getFont().getName(), Font.PLAIN, 25));
        sell.addActionListener(this);
        sell.setContentAreaFilled(false);
        sell.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                sell.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                sell.setForeground(Color.white);
            }
        });

        //sell book
        sellbook = new JLabel();
        sellbook.setIcon(iconsellb);
        sellbook.setBounds(0, 0, 1280, 503);
        sellbook.add(books);
        sellbook.add(newb);
        sellbook.add(exsistb);
        sellbook.add(customers);
        sellbook.add(sell);

        //sell book layered pane 
        sellbooklp = new JLayeredPane();
        sellbooklp.setPreferredSize(new Dimension(1280, 503));
        sellbooklp.setBounds(260, 60, 1280, 503);
        sellbooklp.add(sellbook, Integer.valueOf(0));
        sellbooklp.add(newl, Integer.valueOf(1));
        sellbooklp.add(newlp, Integer.valueOf(1));
        sellbooklp.setLayout(null);
        ////////////////////////////////////////////////////////////man book
        // mange books
        // buttons remove and add 
        removeb = new JButton("Remove") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 168, 29, 20, 20);

            }
        ;
        };
                
         addb = new JButton("Add") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 168, 29, 20, 20);

            }
        ;
        };
        removeb.setOpaque(false);
        removeb.setBackground(new Color(0, 0, 0, 0));
        addb.setOpaque(false);
        addb.setBackground(new Color(0, 0, 0, 0));
        removeb.setBounds(240, 3, 170, 30);
        addb.setBounds(875, 3, 170, 30);
        removeb.setBorder(borders);
        addb.setBorder(borders);
        removeb.setFocusable(false);
        addb.setFocusable(false);
        removeb.setForeground(Color.white);
        addb.setForeground(Color.white);
        removeb.setFont(new Font(newb.getFont().getName(), Font.PLAIN, 25));
        addb.setFont(new Font(exsistb.getFont().getName(), Font.PLAIN, 25));
        removeb.addActionListener(this);
        addb.addActionListener(this);
        addb.setContentAreaFilled(false);
        removeb.setContentAreaFilled(false);
        addb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                addb.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                addb.setForeground(Color.white);
            }
        });
        removeb.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                removeb.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                removeb.setForeground(Color.white);
            }
        });

        JLabel manbookb = new JLabel();
        manbookb.setLayout(null);
        manbookb.add(addb);
        manbookb.add(removeb);
        manbookb.setBounds(0, 450, 1280, 50);

        // text fields of manbook
        manbk = new JLabel();
        manbk.setSize(544, 257);

        booknamet = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 27, 20, 20);
            }
        };
        booknamet.setOpaque(false);
        booknamet.setBackground(new Color(0, 0, 0, 0));
        booknamet.setBorder(borders);
        booknamet.setBounds(60, 30, 250, 30);
        booknamet.setFont(new Font(booknamet.getFont().getName(), Font.PLAIN, 20));
        booknamet.setForeground(Color.white);
        manbk.add(booknamet);

        authort = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 27, 20, 20);
            }
        };
        authort.setOpaque(false);
        authort.setBackground(new Color(0, 0, 0, 0));
        authort.setBorder(borders);
        authort.setBounds(60, 90, 250, 30);
        authort.setFont(new Font(authort.getFont().getName(), Font.PLAIN, 20));
        authort.setForeground(Color.white);
        manbk.add(authort);
        publishert = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 27, 20, 20);
            }
        };
        publishert.setOpaque(false);
        publishert.setBackground(new Color(0, 0, 0, 0));
        publishert.setBorder(borders);
        publishert.setBounds(60, 150, 250, 30);
        publishert.setFont(new Font(publishert.getFont().getName(), Font.PLAIN, 20));
        publishert.setForeground(Color.white);
        manbk.add(publishert);
        publisheryeart = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 27, 20, 20);
            }
        };
        publisheryeart.setOpaque(false);
        publisheryeart.setBackground(new Color(0, 0, 0, 0));
        publisheryeart.setBorder(borders);
        publisheryeart.setBounds(60, 210, 250, 30);
        publisheryeart.setFont(new Font(publisheryeart.getFont().getName(), Font.PLAIN, 20));
        publisheryeart.setForeground(Color.white);
        manbk.add(publisheryeart);

        isbnt = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 27, 20, 20);
            }
        };
        isbnt.setOpaque(false);
        isbnt.setBackground(new Color(0, 0, 0, 0));
        isbnt.setBorder(borders);
        isbnt.setBounds(60, 270, 250, 30);
        isbnt.setFont(new Font(isbnt.getFont().getName(), Font.PLAIN, 20));
        isbnt.setForeground(Color.white);
        manbk.add(isbnt);

        manbk.setBounds(830, 120, 544, 500);
        manbk.setLayout(null);

        manbookc = new JComboBox();
        for (int i = 0; i < Book.bookname.size(); i++) {
            manbookc.addItem(Book.bookname.get(i));
        }
        manbookc.setBounds(122, 180, 400, 40);
        manbookc.setOpaque(false);
        manbookc.setBackground(new Color(0, 0, 0, 0));
        manbookc.setBorder(borders);
        manbookc.setBackground(Color.decode("#010A1B"));
        manbookc.setForeground(Color.white);
        manbookc.setFont(new Font("Arial", Font.PLAIN, 21));

        //label main photo manbooks
        //label man books
        JLabel manbl = new JLabel();
        manbl.setIcon(manb);
        manbl.setPreferredSize(new Dimension(1280, 550));
        manbl.setBounds(0, 0, 1280, 550);

        // jlayered pane mange books
        manbooks = new JLayeredPane();
        manbooks.setPreferredSize(new Dimension(1280, 550));
        manbooks.setBounds(260, 37, 1280, 542);
        manbooks.add(manbl, Integer.valueOf(0));
        manbooks.add(manbookc, Integer.valueOf(1));
        manbooks.add(manbk, Integer.valueOf(1));
        manbooks.add(manbookb, Integer.valueOf(1));
        //////////////////////////////////////////////////////////////////////man book
        // mange user 
        // buttons mange users
        addub = new JButton("Add") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 148, 39, 20, 20);

            }
        ;
        };
                
         editub = new JButton("Edit") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 148, 39, 20, 20);

            }
        ;
        };
         removeub = new JButton("Remove") {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 148, 39, 20, 20);

            }
        ;
        };
         addub.setContentAreaFilled(false);
        editub.setContentAreaFilled(false);
        removeub.setContentAreaFilled(false);
        addub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                addub.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                addub.setForeground(Color.white);
            }
        });
        editub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                editub.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                editub.setForeground(Color.white);
            }
        });
        removeub.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                removeub.setForeground(Color.decode("#1B1B1B"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                removeub.setForeground(Color.white);
            }
        });

        addub.setOpaque(false);
        addub.setBackground(new Color(0, 0, 0, 0));
        editub.setOpaque(false);
        editub.setBackground(new Color(0, 0, 0, 0));
        removeub.setBackground(new Color(0, 0, 0, 0));
        removeub.setBackground(new Color(0, 0, 0, 0));
        addub.setBounds(25, 10, 150, 40);
        editub.setBounds(218, 10, 150, 40);
        removeub.setBounds(411, 10, 150, 40);
        addub.setBorder(borders);
        editub.setBorder(borders);
        removeub.setBorder(borders);
        addub.setFocusable(false);
        editub.setFocusable(false);
        removeub.setFocusable(false);
        addub.setForeground(Color.white);
        editub.setForeground(Color.white);
        removeub.setForeground(Color.white);
        addub.setFont(new Font(newb.getFont().getName(), Font.PLAIN, 25));
        editub.setFont(new Font(exsistb.getFont().getName(), Font.PLAIN, 25));
        removeub.setFont(new Font(exsistb.getFont().getName(), Font.PLAIN, 25));
        addub.addActionListener(this);
        editub.addActionListener(this);
        removeub.addActionListener(this);

        JLabel usersb = new JLabel();
        usersb.setLayout(null);
        usersb.add(addub);
        usersb.add(editub);
        usersb.add(removeub);
        usersb.setBackground(new Color(0, 0, 0, 0));
        usersb.setOpaque(false);
        usersb.setBounds(30, 400, 640, 100);

        //text field user 
        user1 = new JLabel();
        user1.setSize(544, 257);

        text1 = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 26, 20, 20);
            }
        };
        text1.setOpaque(false);
        text1.setBackground(new Color(0, 0, 0, 0));
        text1.setBorder(borders);
        text1.setBounds(60, 30, 250, 29);
        text1.setFont(new Font(text1.getFont().getName(), Font.PLAIN, 20));
        text1.setForeground(Color.white);
        user1.add(text1);

        text2 = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.white);
                g.drawRoundRect(0, 0, 248, 26, 20, 20);
            }
        };
        text2.setOpaque(false);
        text2.setBackground(new Color(0, 0, 0, 0));
        text2.setBorder(borders);
        text2.setBounds(60, 96, 250, 29);
        text2.setFont(new Font(text2.getFont().getName(), Font.PLAIN, 20));
        text2.setForeground(Color.white);
        user1.add(text2);

        user1.setBounds(200, 155, 544, 257);
        user1.setLayout(null);

        //label man user
        JLabel manl = new JLabel();
        manl.setIcon(man);
        manl.setPreferredSize(new Dimension(1280, 550));
        manl.setBounds(0, 0, 1280, 550);

        // panel users dada
        userdata = new manuser();

        //man usesr 
        manusers = new JLayeredPane();
        manusers.setPreferredSize(new Dimension(1280, 550));
        manusers.setBounds(260, 60, 1280, 505);
        manusers.add(manl, Integer.valueOf(0));
        manusers.add(userdata, Integer.valueOf(1));
        manusers.add(user1, Integer.valueOf(1));
        manusers.add(usersb, Integer.valueOf(1));

        //selled book panel
        selledbookp = new selledbook();
        ImageIcon icon9 = new ImageIcon("selledbk.png");
        selledbl = new JLabel();
        selledbl.setIcon(icon9);
        selledbl.setBounds(260, 61, 1280, 30);

        //customer
        custp = new customer();
        icon4 = new ImageIcon("cust.png");
        custll = new JLabel();
        custll.setIcon(icon4);
        custll.setBounds(260, 61, 1280, 30);

        //frame 
        this.getContentPane().setBackground(Color.black);
        this.setSize(1540, 820);
        setLocationRelativeTo(null);
        // set location of frame at middle
        this.setTitle("Smart Library");
        this.setIconImage(iconpp.getImage());
        this.add(layeredPane);
        this.add(userp);
        this.add(home1);
        this.add(dashpp);
        this.add(custp);
        this.add(custll);
        this.add(selledbl);
        this.add(selledbookp);
        this.add(bookandsearchp);
        this.add(bookandsearchl);
        this.add(search);
        this.add(sellbooklp);
        this.add(manusers);
        this.add(manbooks);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);

        //visibility at first 
        home1.setVisible(true);
        dashpp.setVisible(false);
        custp.setVisible(false);
        custll.setVisible(false);
        selledbookp.setVisible(false);
        selledbl.setVisible(false);
        bookandsearchp.setVisible(false);
        bookandsearchl.setVisible(false);
        search.setVisible(false);
        sellbooklp.setVisible(false);
        customers.setVisible(false);
        newlp.setVisible(false);
        newl.setVisible(false);
        manusers.setVisible(false);
        manbooks.setVisible(false);
        homeb.setForeground(Color.black);

    }

    public void visible() {

        search.setVisible(false);
        sellbooklp.setVisible(false);
        newlp.setVisible(false);
        newl.setVisible(false);
        customers.setVisible(false);
        bookandsearchp.setVisible(false);
        bookandsearchl.setVisible(false);
        selledbookp.setVisible(false);
        selledbl.setVisible(false);
        custp.setVisible(false);
        custll.setVisible(false);
        dashpp.setVisible(false);
        home1.setVisible(false);
        manusers.setVisible(false);
        manbooks.setVisible(false);

        homeb.setForeground(Color.white);
        dashb.setForeground(Color.white);
        customersb.setForeground(Color.white);
        selledbookb.setForeground(Color.white);
        bookb.setForeground(Color.white);
        sellbookb.setForeground(Color.white);
        manbookb.setForeground(Color.white);
        manuserb.setForeground(Color.white);

        flag = 2;
        Book.Searchdefault();
        searcht.setText("enter the name of book ....");
        searcht.setFont(new Font(searcht.getFont().getName(), Font.PLAIN, 13));
        searcht.setForeground(Color.darkGray);
        searcht.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                searcht.setText("");
                searcht.removeKeyListener(this);
                searcht.setFont(new Font(searcht.getFont().getName(), Font.PLAIN, 15));
                searcht.setForeground(Color.white);

            }
        });
        namecustt.setText("");
        phonecustt.setText("");
        emailcustt.setText("");
        groupmf.clearSelection();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homeb) {
            this.visible();
            home1.setVisible(true);
            homeb.setForeground(Color.black);

        } else if (e.getSource() == dashb) {
            this.visible();
            dashpp.setVisible(true);
            dashb.setForeground(Color.black);

        } else if (e.getSource() == logoutb) {
            this.setVisible(false);
            new loginpage();

        } else if (e.getSource() == customersb) {
            this.visible();
            custp.setVisible(true);
            custll.setVisible(true);
            customersb.setForeground(Color.black);

        } else if (e.getSource() == selledbookb) {
            search.setVisible(false);
            sellbooklp.setVisible(false);
            this.visible();
            selledbookp.setVisible(true);
            selledbl.setVisible(true);
            selledbookb.setForeground(Color.black);

        } else if (e.getSource() == bookb) {
            sellbooklp.setVisible(false);
            this.visible();
            bookandsearchp.setVisible(true);
            bookandsearchl.setVisible(true);
            search.setVisible(true);
            bookb.setForeground(Color.black);

        } else if (e.getSource() == sellbookb) {
            this.visible();
            sellbooklp.setVisible(true);
            sellbookb.setForeground(Color.black);

        } else if (e.getSource() == manuserb) {
            this.visible();
            manuserb.setForeground(Color.black);
            manusers.setVisible(true);
//                 text1.setText("hello");
//                 text2.setText("hello");

        } else if (e.getSource() == manbookb) {
            this.visible();
            manbookb.setForeground(Color.black);
            manbooks.setVisible(true);

        } //////////////////////////////////////////////////// sell boook  buttons 
        else if (e.getSource() == exsistb) {
            newlp.setVisible(false);
            newl.setVisible(false);
            customers.setVisible(true);
            namecustt.setText("");
            phonecustt.setText("");
            emailcustt.setText("");
            groupmf.clearSelection();
            flag = 1;

        } else if (e.getSource() == newb) {

            customers.setVisible(false);
            newl.setVisible(true);
            newlp.setVisible(true);
            flag = 0;

        } else if (e.getSource() == sell) {

            int booksind = books.getSelectedIndex();

            if (booksind >= 0) {
                if (flag == 1) {   // flag 1 customer exsist
                    int custind = customers.getSelectedIndex();
                    if (custind >= 0) {
                        Book.sellbook(Book.booksarr.get(booksind), booksind);
                        books.removeItemAt(booksind);
                        manbookc.removeItemAt(booksind);
                        selll.setText(String.valueOf(Customerdata.customersdata.size()));
                        bookl.setText(String.valueOf(Book.booksarr.size()));
                        custl.setText(String.valueOf(Book.selledBooks.size()));
                        selledbook.model.addElement(Book.selledBooks.get(Book.selledBooks.size() - 1));

                    } else if (custind < 0) {
                        JOptionPane.showMessageDialog(null, "No cutomers in Library", "Warnning", JOptionPane.WARNING_MESSAGE);

                    }
                } else if (!(namecustt.getText().equals("") || phonecustt.getText().equals("") || emailcustt.getText().equals("")
                        || (namecustt.getText().charAt(0) == (' ') || !(Male.isSelected() || Female.isSelected())
                        || phonecustt.getText().charAt(0) == (' ') || emailcustt.getText().charAt(0) == (' '))) && flag == 0) { // flag 0 customer new 
                    boolean f = true;
                    for (int i = 0; i < Customerdata.customersdata.size(); i++) {
                        if (Customerdata.customersdata.get(i).getPhone_num().equals(phonecustt.getText())
                                || Customerdata.customersdata.get(i).getEmail().equals(emailcustt.getText())) {
                            f = false;
                            break;
                        }

                    }

                    if ((!phonecustt.getText().matches("\\d+")) || phonecustt.getText().length() != 11
                            || namecustt.getText().matches("\\d+") || !emailcustt.getText().contains("@")
                            || !emailcustt.getText().endsWith(".com") || phonecustt.getText().charAt(0) != '0'
                            || phonecustt.getText().charAt(1) != '1') {

                        f = false;

                    }

                    String gender;
                    if (Male.isSelected()) {
                        gender = "Male";
                    } else {
                        gender = "Female";
                    }
                    if (f) {
                        int booksindsell = books.getSelectedIndex();
                        Book.sellbook(Book.booksarr.get(booksindsell), booksindsell);
                        books.removeItemAt(booksindsell);
                        manbookc.removeItemAt(booksindsell);
                        Customerdata p = new Customerdata(namecustt.getText(), phonecustt.getText(), emailcustt.getText(), gender);
                        customers.addItem(p.getName());
                        selll.setText(String.valueOf(Customerdata.customersdata.size()));
                        bookl.setText(String.valueOf(Book.booksarr.size()));
                        custl.setText(String.valueOf(Book.selledBooks.size()));
                        customer.model.addElement(Customerdata.customersdata.get(Customerdata.customersdata.size() - 1));
                        selledbook.model.addElement(Book.selledBooks.get(Book.selledBooks.size() - 1));
                        namecustt.setText("");
                        phonecustt.setText("");
                        emailcustt.setText("");
                        groupmf.clearSelection();

                    } else {
                        JOptionPane.showMessageDialog(null, "Data Already exsist or not correct or name or emial not valid", "Warnning", JOptionPane.WARNING_MESSAGE);

                    }
                } else if (flag == 2) // flag not choose any thing 
                {
                    JOptionPane.showMessageDialog(null, "Choose new or Exsist Customer", "Warnning", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Data", "Warnning", JOptionPane.WARNING_MESSAGE);

                }
            } else if (booksind < 0) {
                JOptionPane.showMessageDialog(null, "No books in Library", "Warnning", JOptionPane.WARNING_MESSAGE);
            }

        } //////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////// mange user buttons
        else if (e.getSource() == addub) {

            if (!(text1.getText().equals("") || text2.getText().equals(""))) {

                if (text1.getText().charAt(0) == ' ' || text2.getText().charAt(0) == ' ') {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Warnning", JOptionPane.WARNING_MESSAGE);
                    manuser.ind = -1;
                } else {

                    loginpage.addUser(text1.getText(), text2.getText());
                    userl.setText(String.valueOf(loginpage.users.size()));

                }
            }
        } else if (e.getSource() == removeub) {

            if (!(text1.getText().equals("") || text2.getText().equals("")) && manuser.model1.size() > 0) {
                loginpage.removeUser(text1.getText(), text2.getText(), manuser.ind);
                userl.setText(String.valueOf(loginpage.users.size()));

            }
        } else if (e.getSource() == editub) {
            if (!(text1.getText().equals("") || text2.getText().equals(""))) {

                if (text1.getText().charAt(0) == ' ' || text2.getText().charAt(0) == ' ') {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Warnning", JOptionPane.WARNING_MESSAGE);
                    manuser.ind = -1;
                } else {
                    loginpage.editUser(text1.getText(), text2.getText(), manuser.ind);
                    userl.setText(String.valueOf(loginpage.users.size()));
                }

            }
        } ////////////////////////////////////////////////////////////////////////////////////
        ///////////////       add boook manger 
        else if (e.getSource() == addb) {
            boolean l = false;

            if ((!publisheryeart.getText().matches("\\d+")) || publisheryeart.getText().length() > 4
                    || (!isbnt.getText().matches("\\d+")) || isbnt.getText().length() != 13
                    || authort.getText().matches("\\d+")
                    || publishert.getText().matches("\\d+")) {

                l = true;

            }
            if (l == false) {
                String s = publisheryeart.getText();
                int x = Integer.parseInt(s);
                if (x > 2023 || x < 868) {
                    l = true;
                }

            }
            if (((booknamet.getText().equals("") || authort.getText().equals("") || publishert.getText().equals("")
                    || publisheryeart.getText().equals("") || isbnt.getText().equals("")) || (booknamet.getText().charAt(0) == (' ')
                    || authort.getText().charAt(0) == (' ') || publishert.getText().charAt(0) == (' ')
                    || publisheryeart.getText().charAt(0) == (' ') || isbnt.getText().charAt(0) == (' '))) || l) {
                JOptionPane.showMessageDialog(null, "Data is not correct , Make sure that ISBN = 13 numbers and Year and all other fields are valid", "Warnning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (Book.setISBN(isbnt.getText())) {
                    Book b = new Book(booknamet.getText(), authort.getText(), publishert.getText(), publisheryeart.getText(), isbnt.getText());

                    manbookc.addItem(b.getTitle());
                    books.addItem(b.getTitle());
                    bookl.setText(String.valueOf(Book.booksarr.size()));
                    booknamet.setText(null);
                    authort.setText(null);
                    publishert.setText(null);
                    publisheryeart.setText(null);
                    isbnt.setText(null);

                }
            }
        } else if (e.getSource() == removeb) {
            int selectedIndex = manbookc.getSelectedIndex();
            if (selectedIndex >= 0) {
                manbookc.removeItemAt(selectedIndex);
                books.removeItemAt(selectedIndex);
                Book.Remove(selectedIndex);
                bookl.setText(String.valueOf(Book.booksarr.size()));
            }

        } ////////////////////////////////////////////////////////////////////////////////
        /////////////////////////search button
        else if (e.getSource() == searchb) {
            if (searcht.getText().equals("")) {
                booksearch.model.clear();
                Book.Searchdefault();
            } else {
                booksearch.model.clear();
                Book.Search(searcht.getText());
            }
        }
        ///////////////////////////////////////////////////////////////////////////////
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        searchb.setForeground(Color.black);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        searchb.setForeground(Color.white);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
