import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
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
        textfield.setFont(new Font("Golos Text",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        button_panel.setLayout(new GridLayout(3,3) );


        tittle_panel.setLayout(new BorderLayout());
        tittle_panel.setBounds(0,0,800,100);

        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }

        tittle_panel.add(textfield);
        frame.add(tittle_panel,BorderLayout.NORTH);
        frame.add(button_panel);
        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(players_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        players_turn=false;
                        textfield.setText("O Turn");
                    }
                }else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        players_turn=true;
                        textfield.setText("X Turn");
                    }
                }
            }
        }
    }
    public void firstTurn() {
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if(random.nextInt(2)==0){
            players_turn=true;
            textfield.setText("X Turn");
        }else{
            players_turn=false;
            textfield.setText("O Turn");
        }
    }
    public void check(){

    }
    public void xWins(int a,int b,int c){

    }
    public void oWins(int a,int b,int c){

    }
}
