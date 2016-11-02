package Default;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main() {

        setSize(240,320);
        setVisible(true);

        JButton B1 = new JButton("B1");
        JButton B2 = new JButton("B2");
        JButton B3 = new JButton("B3");
        JButton B4 = new JButton("B4");
        JButton B5 = new JButton("B5");
        JButton B6 = new JButton("B6");
        JButton B7 = new JButton("B7");
        JButton B8 = new JButton("B8");
        JButton B9 = new JButton("B9");

        B1.setBounds(0, 0, 50, 50);
        B2.setBounds(80, 0, 50, 50);
        B3.setBounds(160, 0, 50, 50);
        B4.setBounds(0,80,50,50);
        B5.setBounds(80, 80, 50, 50);
        B6.setBounds(160, 80, 50, 50);
        B7.setBounds(0, 160, 50, 50);
        B8.setBounds(80, 160, 50, 50);
        B9.setBounds(160, 160, 50, 50);


        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);

        final Game juego1 = new Game();
        juego1.Initialize();

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                boolean jugador1Win = false;
                juego1.Play(0, 0, juego1.jugador1);
                jugador1Win = juego1.Check(juego1.jugador1, 0, 0);
                if (jugador1Win==true) {
                    juego1.jugador1.setWin(juego1.jugador1.getWin()+1);
                    System.out.println("You have win");
                }
            }
        });

        B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                boolean jugador1Win = false;
                juego1.Play(0, 1, juego1.jugador1);
                jugador1Win = juego1.Check(juego1.jugador1, 0, 1);
                if (jugador1Win==true) {
                    juego1.jugador1.setWin(juego1.jugador1.getWin()+1);
                    System.out.println("You have win");
                }
            }
        });


        B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                boolean jugador1Win = false;
                juego1.Play(0, 2, juego1.jugador1);
                jugador1Win = juego1.Check(juego1.jugador1, 0, 2);
                if (jugador1Win==true) {
                    juego1.jugador1.setWin(juego1.jugador1.getWin()+1);
                    System.out.println("You have win");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}