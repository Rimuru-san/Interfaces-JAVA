package cadastro;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LAB202-06
 */
public class Cadastro  extends JFrame{
JLabel rotulo1 ,rotulo2 ,rotulo3 ,rotulo4 ,rotulo5 ,rotulo6;
JTextField texto1;
JFormattedTextField texto2 ,texto3 ,texto4 ,texto5;
MaskFormatter mcpf ,mrg ,mcep;
JPasswordField caixa;
JButton botao; 
public Cadastro(){    
super("Tela de Cadastro");
    Container tela = getContentPane();
    setLayout(null);
    rotulo1 = new JLabel("Cadastro de cliente");
    rotulo2 = new JLabel("Nome");
    rotulo3 = new JLabel("CPF");
    rotulo4 = new JLabel("RG");
    rotulo5 = new JLabel("CEP");
    rotulo6 = new JLabel("Senha");
    
    try{
    mcpf = new MaskFormatter("###.###.###-##");
    mrg = new MaskFormatter("##.###.###-#");
    mcep = new MaskFormatter("#####-###");
    mcpf.setPlaceholderCharacter('_');
    mrg.setPlaceholderCharacter('_');
    mcep.setPlaceholderCharacter('_');
    } catch (ParseException ex) {
        Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    texto1 = new JTextField(200); 
    texto2 = new JFormattedTextField(mcpf);
    texto3 = new JFormattedTextField(mrg);
    texto4 = new JFormattedTextField(mcep);
    
    caixa = new JPasswordField(35);
    
    botao = new JButton("Cadastar-se");
    
    rotulo1.setBounds(150,20,150,20); 
    rotulo2.setBounds(50,60,80,20);
    rotulo3.setBounds(50,100,80,20);
    rotulo4.setBounds(50,140,80,20);
    rotulo5.setBounds(50,180,80,20);
    rotulo6.setBounds(50,220,80,20);
    
    texto1.setBounds(50,80,250,20); 
    texto2.setBounds(50,120,125,20);
    texto3.setBounds(50,160,120,20);
    texto4.setBounds(50,200,120,20);
    
    caixa.setBounds(50,240,150,20); 
    
    botao.setBounds(50,280,110,20);
    
    rotulo1.setForeground(Color.red);
    rotulo2.setForeground(Color.black); 
    rotulo3.setForeground(Color.black); 
    rotulo4.setForeground(Color.black);
    rotulo5.setForeground(Color.black);
    rotulo6.setForeground(Color.black);
    
    rotulo1.setFont(new Font("Arial",Font.BOLD,14)); 
    rotulo2.setFont(new Font("Arial",Font.BOLD,12));
    rotulo3.setFont(new Font("Arial",Font.BOLD,12));
    rotulo4.setFont(new Font("Arial",Font.BOLD,12));
    rotulo5.setFont(new Font("Arial",Font.BOLD,12)); 
    rotulo6.setFont(new Font("Arial",Font.BOLD,12));
    
    tela.add(rotulo1);
    
    tela.add(rotulo2);
    
    tela.add(rotulo3);
    
    tela.add(rotulo4);
    
    tela.add(rotulo5);
    
    tela.add(rotulo6);
    
    tela.add(texto1);
    
    tela.add(texto2);
    
    tela.add(texto3);
    
    tela.add(texto4);
    
    tela.add(caixa);
    
    tela.add(botao);
    
    tela.setBackground(new Color(192,192,192));
    
    setSize(450, 400);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String[] args) {
    Cadastro app = new Cadastro();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
