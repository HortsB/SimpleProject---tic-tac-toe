import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Tictactoe implements ActionListener{
    Random random=new Random();
    JFrame frame=new JFrame();
    JPanel tittle_panel=new JPanel();
    JPanel button_panel=new JPanel();
    JLabel textfield=new JLabel();
    JButton []buttons=new JButton[9];
    boolean players_turn;
    Tictactoe(){
        //Create the features of the panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        //More features
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        button_panel.setLayout(new GridLayout(3,3) );


        tittle_panel.setLayout(new BorderLayout());
        tittle_panel.setBounds(0,0,800,100);
        tittle_panel.add(textfield);
        frame.add(tittle_panel,BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void firstTurn(){

    }
    public void check(){

    }
    public void xWins(int a,int b,int c){

    }
    public void oWins(int a,int b,int c){

    }
}
