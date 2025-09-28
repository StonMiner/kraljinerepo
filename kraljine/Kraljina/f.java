import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

//Oct 2024 Kraljine Original code
public class f extends JFrame implements ActionListener {
    int $w = 800;
    int $h = 500;
    String t = "a";
    
    JPanel rd;
    JLabel dl;
    JButton mpb;
    JButton pwb;
    JButton kcb;
    JButton kpb;
    JButton kdb;
    JButton kab;
    JButton kmb;
    JButton tosb;
    JButton acb;
    JPanel $p;
    JLabel pl;
    ImageIcon icon = new ImageIcon("C:\\Users\\Vasilije\\Desktop\\folderi\\!java\\java\\JavaProjects\\Kraljina\\res\\Crown.png");
    f(){   
        acb = new JButton();
        acb.setLocation(100,100);
        acb.setText("Prihvati");
        acb.setVisible(false);
        acb.addActionListener(this);
        acb.setFocusable(false);
        acb.setBackground(Color.lightGray);

        pl = new JLabel("<html>dobro dosli na glavnu stranicu Kraljina. Ovde mozete videti sta mi<br>nudimo, i mozes kupiti sta hoces sa par diamanta.Mi smo napravili <br>Pißwasser,Kraljina Dostava,Kraljina Posta,Kraljina Cloud,Kraljina <br>Properties i Kraljina Ad. Levo mozete proverite nase stvari i cene!<br>Kraljina je kompanija koja jenapravljena 18.maja 2024 u proslom<br> serveru(Vasakraljina) ali jestigla 14.septembra 2024 u kraljine<br> server.<html>",JLabel.LEFT);
        pl.setForeground(Color.black);
        pl.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,20));

        //iiiju al je ovo sranje kod
        
        $p = new JPanel();
        $p.setBackground(new Color(255,255,255));
        $p.setBounds(175,50,610,415);
        $p.add(pl);
        $p.add(acb);
        
        dl = new JLabel("Kraljina v0.2");
        dl.setForeground(Color.black);
        dl.setFont(new Font("Arial",Font.PLAIN,20));

        rd = new JPanel();
        rd.setBackground(Color.white);
        rd.setBounds(0,0,785,30);
        rd.add(dl);

        mpb = new JButton();
        mpb.setBounds(0,50,175,50);
        mpb.setText("Main Page");
        mpb.addActionListener(this);
        mpb.setBorder(BorderFactory.createEtchedBorder());
        mpb.setFocusable(false);
        mpb.setBackground(Color.lightGray);

        pwb = new JButton();
        pwb.setBounds(0,100,175,50);
        pwb.setText("Pißwasser");
        pwb.addActionListener(this);
        pwb.setBorder(BorderFactory.createEtchedBorder());
        pwb.setFocusable(false);
        pwb.setBackground(Color.LIGHT_GRAY);

        kcb = new JButton();
        kcb.setBounds(0,150,175,50);
        kcb.setText("Kraljina Cloud");
        kcb.addActionListener(this);
        kcb.setBorder(BorderFactory.createEtchedBorder());
        kcb.setFocusable(false);
        kcb.setBackground(Color.lightGray);

        kpb = new JButton();
        kpb.setBounds(0,200,175,50);
        kpb.setText("Kraljina Properties");
        kpb.addActionListener(this);
        kpb.setBorder(BorderFactory.createEtchedBorder());
        kpb.setFocusable(false);
        kpb.setBackground(Color.lightGray);

        kdb = new JButton();
        kdb.setBounds(0,250,175,50);
        kdb.setText("Kraljina Dostava");
        kdb.addActionListener(this);
        kdb.setBorder(BorderFactory.createEtchedBorder());
        kdb.setFocusable(false);
        kdb.setBackground(Color.lightGray);

        kab = new JButton();
        kab.setBounds(0,300,175,50);
        kab.setText("Kraljina Ads");
        kab.addActionListener(this);
        kab.setBorder(BorderFactory.createEtchedBorder());
        kab.setFocusable(false);
        kab.setBackground(Color.lightGray);

        kmb = new JButton();
        kmb.setBounds(0,350,175,50);
        kmb.setText("Kraljina Mail");
        kmb.addActionListener(this);
        kmb.setBorder(BorderFactory.createEtchedBorder());
        kmb.setFocusable(false);
        kmb.setBackground(Color.LIGHT_GRAY);

        tosb = new JButton();
        tosb.setBounds(0,400,175,50);
        tosb.setText("Kraljina TOS");
        tosb.addActionListener(this);
        tosb.setBorder(BorderFactory.createEtchedBorder());
        tosb.setFocusable(false);
        tosb.setBackground(Color.lightGray);

        this.setSize($w,$h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(100,100,100));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Kraljina");
        this.setIconImage(icon.getImage());
        this.add(rd);
        this.add($p);
        this.add(mpb);
        this.add(pwb);
        this.add(kcb);
        this.add(kpb);
        this.add(kdb);
        this.add(kab);
        this.add(kmb);
        this.add(tosb);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mpb){
            pl.setText("<html>dobro dosli na glavnu stranicu Kraljina. Ovde mozete videti sta mi<br>nudimo, i mozes kupiti sta hoces sa par diamanta.Mi smo napravili <br>Pißwasser,Kraljina Dostava,Kraljina Posta,Kraljina Cloud i Kraljina Ad<br>Levo mozete proverite nase stvari i cene!Kraljina je kompanija koja je<br>napravljena 18.maja 2024 u proslom serveru (Vasakraljina) ali je<br>stigla 14.septembra 2024 u kraljine server.<html>");
            acb.setVisible(false);
        }
        if(e.getSource()==pwb){
            pl.setText("<html>Pißwasser je najpopularniji u ovoj kompaniji.Prodato je trenutno 100<br>Flasa od 14.Oktobra.Kraljina kompanija nece dodavati nikoga da radi<br> za Pißwasser odluceno od VasaKraljina na 1.Okt. 2024.Ima 2 grupe<br>Pißwasser:Pißwasser i Pißwasser EMERGENCY.U Pißwasser<br> EMEGENCY su:Pißwasser Run,Pißwasser Muscle i Pißwasser<br> Shield. U Pißwasser ima:Pißwasser(Classic/Original), i Pißwasser<br> Lake(nije trademarkovano) i Pisswasser turtle.<br>Pißwasser shopovi izgledaju specialno.Kockasto je, ali na levoj strani<br>je diagonalno.Ovaj Design je trademarkovan i nemoze se kopirati.Ako<br>kopiras onda trebas platiti 3D pa onda 5D i onda 10D.Imaju<br>drugaciji materijali za drugacije efekte.Za sad ima samo Cobblestone<br>i Smooth Stone Block.Smooth Stone block potion je Pißwasser<br>RUNAWAY i Cobblestone potion je Pißwasser<br><br>Pißwasser EMERGENCY cena:1D Pißwasser cena:0,5D<html>");
            acb.setVisible(false);
        }
        if(e.getSource()==kcb){
            pl.setText("<html>Kraljina Cloud je Cloud za chestove.Ako ti neko krade konstantno<br>tvoje stvari onda mozes uzati Kraljina Cloud.Za samo 0,5D po 10<br>Dana.To ti sakriva chestove u random lokaciju.<html>");
            acb.setVisible(false);
        }
        if(e.getSource()==kpb){
            pl.setText("<html>Kraljina Properties je zemljiste za kupovinu.Glavno oko spawna gde<br>su fencevi, to se prodaje od Kraljina Properties.Ima Kraljina<br>Properties kuca, i tu se kupuju zemljista za diamante(4-15DMD).<br>Najposecenija mesta su skuplja, dok manje posecenija mesta su<br>jeftinija.<html>");
            acb.setVisible(false);
        }
        if(e.getSource()==kdb){
            pl.setText("<html>Kraljina Dostava je dostava koja kosta malo!Tvoja cena je izabrana<br>duzine putovanja.100Block=0,25DMD. Probaj sad za brze dostave!!!<br><html>");
            acb.setVisible(false);
        }
        if(e.getSource()==kab){
            pl.setText("<html>Kraljina Ads je reklamiranje ako ti kompanija se raspada.Mozes kupiti<br>reklamiranje kod spawna za samo 1DMD po 10D.Kraljina ADS se<br> nalazi kod spawna i kod Industrijske zone.<br><html>");
            acb.setVisible(false);
        }
        if(e.getSource()==kmb){
            pl.setText("<html>Kraljina Mail(Kraljina Posta) je posta za druge ljude.Napravljen je 13<br>Oktobra 2024.Mozes da prevozis stvari brzo.Za sad je povezano do<br>Vasine baze,matejina baze i mikiblastove baze.Nalazi se Posta u<br>Industrijskoj zoni na ulazu.Mozes da posaljes svakome(u serveru)<br>Postu,takodje Kraljina Mail je Besplatno!Ne trebas uopste placati!<html>");
            acb.setVisible(false);
        }
        if(e.getSource()==tosb){
            pl.setText("<html>Kraljina TOS<br><br>(ako hoces da nastavis da koristis stvari od Kraljina moras prihvatiti<br>TOS)<br>Trademark: Kraljina ima trademark za:Kraljina ime,Pißwasser ime+<br>recepti,Kraljina Posta ime,Kraljina Properties ime,Kraljina Cloud ime,<br>Kraljina Ads ime,Kraljina Dostava ime.<br>Copyright:Svako ko uzme ime/recept koji je trademarkovan,moraces<br>platiti 5DMD<br><br>Prihvati ako hoces nastaviti koristiti Kraljina stvari,Odbijte ako necete<br>koristiti Kraljina stvari <html>");
            acb.setVisible(true);
        }
        if(e.getSource()==acb){
            acb.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Prihvatio si TOS","TOS",JOptionPane.INFORMATION_MESSAGE);
        }
    }
} 
