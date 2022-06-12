import org.checkerframework.checker.units.qual.C;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Window extends JPanel implements ActionListener {


    static final int SCREEN_WIDTH = 350;//גודל הפאנל (וגודל החלון יחושב אוטומטית ע"י פונקציית pack )
    static final int SCREEN_HEIGHT = 750;

    //בוליאני להפעלת מסך הפתיחה
    boolean welcome = false;
    // בוליאני לריצת המשחק
    static boolean running = false;


    Window() {
         JPanel jPanel= new JPanel();
         this.add(jPanel);
        jPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        jPanel.setBackground(new Color(245,245,220));
        JButton connect= new JButton("conect");
        jPanel.add(connect);
        connect.setBounds(jPanel.getX()/2,jPanel.getHeight()/2,150,100);
        connect.setVisible(true);
        this.setFocusable(true);


        connect.addActionListener((event) -> {
            try {
                Main.openBrowser();
            }catch (Exception e){

            }




        });


    }
    public boolean returnTrue(){
        return true;
    }
    public void mainWindow(Graphics g){

        repaint();
    }

    //אתחול המשתנים בתחילת המשחק ובמקרה של פסילה
    public void ResetGame() {


        repaint();


    }
    // מסך פתיחה

    public void Welcome(Graphics g) {
        g.setColor(Color.blue);
        JLabel hiMessage = new JLabel("hi");
        this.add(hiMessage);
        repaint();


    }
    // פונקציות הציור למסך

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        JLabel jLabel= new JLabel("JGTYDER");
       this.add(jLabel);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {

            repaint();

        }
    }
}









