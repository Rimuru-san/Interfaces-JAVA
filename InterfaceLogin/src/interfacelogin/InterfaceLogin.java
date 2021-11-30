/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelogin;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import javax.swing.border.LineBorder;

public class InterfaceLogin extends JFrame{
JLabel rotulo1 ,rotulo2 ,rotulo3;
JTextField texto1;
private static JTextArea texto2;
private static JScrollPane sp;
JButton botao1, botao2;
JPasswordField caixa;
public InterfaceLogin(){
super("Exemplo prático - Interface Login");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("Nome");
    rotulo2 = new JLabel("Senha");
    rotulo3 = new JLabel("Comentário");
    
    texto1 = new JTextField(200); 
    
    sp = new JScrollPane();
    sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
    texto2 = new JTextArea(20, 20);
    
    texto2.setBorder(new LineBorder(Color.BLACK));
        
    sp.getViewport().setBackground(Color.WHITE);
    sp.getViewport().add(texto2);
    add(sp);
    
    caixa = new JPasswordField(20);
    
    botao1 = new JButton("Cadastre-se");
    botao2 = new JButton("Login"); 
    
    
    rotulo1.setBounds(50,20,80,20);
    rotulo2.setBounds(50,60,80,20);
    rotulo3.setBounds(50,100,80,20);
    
    texto1.setBounds(50,40,250,20); 
    texto2.setBounds(50,120,250,160);
    
    caixa.setBounds(50,80,250,20);
    
    botao1.setBounds(50,280,110,20); 
    botao2.setBounds(220,280,80,20);
    
    
    botao1.setForeground(Color.black);
    botao2.setForeground(Color.black); 
    
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    
    tela.add(texto1);
    tela.add(texto2);

    tela.add(caixa);
    
    tela.add(botao1);
    tela.add(botao2);
    
    tela.setBackground(new Color(192,192,192));
    setSize(400, 400);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String[] args) {
    InterfaceLogin app = new InterfaceLogin();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
