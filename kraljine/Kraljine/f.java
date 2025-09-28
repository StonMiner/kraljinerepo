import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsDevice;

public class f extends JFrame implements ActionListener {

    int w = 800;
    int h = 500;
    String t = "Kraljine";

    JButton events;
    JButton vesti;
    JLabel info;
    JLabel Kraljine;
    JPanel kp;

    int sh;
    int sw;
    f(){
        Kraljine = new JLabel();
        Kraljine.setBounds(0,0,800,50);
        Kraljine.setText("Kraljine v0.0");
        Kraljine.setFont(new Font("Arial",Font.PLAIN,20));
        Kraljine.setVerticalAlignment(JLabel.CENTER);
        Kraljine.setHorizontalAlignment(JLabel.CENTER);

        kp = new JPanel();
        kp.setSize(800,30);
        kp.setBackground(Color.lightGray);
        kp.add(Kraljine);

        info = new JLabel();
        info.setBounds(220,50,1920,1080);
        info.setText("<html>Novi zimski event na 1.Decembru.<br><html>");
        info.setHorizontalTextPosition(JLabel.LEFT);
        info.setVerticalTextPosition(JLabel.TOP);
        info.setVerticalAlignment(JLabel.TOP);
        info.setHorizontalAlignment(JLabel.LEFT);
        info.setFont(new Font("Arial",Font.PLAIN,18));

        vesti = new JButton();
        vesti.setBounds(0,100,200,50);
        vesti.setText("Vesti");
        vesti.setFocusable(false);
        vesti.addActionListener(this);

        events = new JButton();
        events.setBounds(0,50,200,50);
        events.setText("Events");
        events.addActionListener(this);
        events.setFocusable(false);

        this.setSize(w,h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle(t);
        this.add(events);
        this.add(vesti);
        this.add(info);
        this.add(kp);
    }
    public void setFullscreen(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        gd.setFullScreenWindow(this);

        sw = this.getHeight();
        sh = this.getWidth();
        setFullscreen();
    }
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==events){
        info.setText("<html>Novi zimski event na 1.Decembru.<br><html>");
       }
       if(e.getSource()==vesti){
        info.setText("<html>Novi zimski event sa jelkom u sredini spawna i sneg svuda.<br>Vasilije2013 je napravio taj event za zabavu!<html>");
       }
    }
}