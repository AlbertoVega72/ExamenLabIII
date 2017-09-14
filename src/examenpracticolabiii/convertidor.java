
package examenpracticolabiii;

/**
 *
 * @author Alberto
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class convertidor  extends JFrame implements ActionListener{

    JPanel todo;
    JTextField textView;
    JLabel titulo;
    JButton cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,punto,convertir,limpiar;    
    
    public convertidor(){
        this.setBounds(100, 100, 600, 600);
        this.setTitle("Examen Practico Lab III");
        
        todo = new JPanel();                
        todo.setLayout(null);
        add(todo);
        
        titulo = new JLabel("Convertidor");
        titulo.setBounds(20, 20, 150, 30);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 25));
        todo.add(titulo);
        
        textView = new JTextField();
        textView.setEditable(false);
        textView.setBounds(20, 100, 550, 35);
        textView.setFont(new Font("Times New Roman", Font.BOLD, 20));
        todo.add(textView);
        
        uno = new JButton("1");
        uno.setBounds(20, 150, 90, 90);
        todo.add(uno);
        uno.addActionListener(this);
        
        dos = new JButton("2");
        dos.setBounds(110, 150, 90, 90);
        todo.add(dos);
        dos.addActionListener(this);
        
        tres = new JButton("3");
        tres.setBounds(200, 150, 90, 90);
        todo.add(tres);
        tres.addActionListener(this);
        
        cuatro = new JButton("4");
        cuatro.setBounds(20, 240, 90, 90);
        todo.add(cuatro);
        cuatro.addActionListener(this);
        
        cinco = new JButton("5");
        cinco.setBounds(110, 240, 90, 90);
        todo.add(cinco);
        cinco.addActionListener(this);
        
        seis = new JButton("6");
        seis.setBounds(200, 240, 90, 90);
        todo.add(seis);
        seis.addActionListener(this);
        
        siete = new JButton("7");
        siete.setBounds(20, 330, 90, 90);
        todo.add(siete);
        siete.addActionListener(this);
        
        ocho = new JButton("8");
        ocho.setBounds(110, 330, 90, 90);
        todo.add(ocho);
        ocho.addActionListener(this);
        
        nueve = new JButton("9");
        nueve.setBounds(200, 330, 90, 90);
        todo.add(nueve);
        nueve.addActionListener(this);
        
        cero = new JButton("0");
        cero.setBounds(110, 420, 90, 90);
        todo.add(cero);
        cero.addActionListener(this);
        
        punto = new JButton(".");
        punto.setBounds(200, 420, 90, 90);
        todo.add(punto);
        punto.addActionListener(this);
        
        convertir = new JButton("Convertir");
        convertir.setBounds(320, 220, 250, 60);
        todo.add(convertir);
        convertir.addActionListener(this);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(320, 290, 250, 60);
        todo.add(limpiar);
        limpiar.addActionListener(this);
        
        
        todo.setVisible(true);
        this.setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(uno)) {
            textView.setText(textView.getText()+ "1");
        }else
        if (e.getSource().equals(dos)) {
            textView.setText(textView.getText()+ "2");        
        }else
        if (e.getSource().equals(tres)) {
            textView.setText(textView.getText()+ "3");
        }else
        if (e.getSource().equals(cuatro)) {
            textView.setText(textView.getText()+ "4");
        }else
        if (e.getSource().equals(cinco)) {
            textView.setText(textView.getText()+ "5");
        }else
        if (e.getSource().equals(seis)) {
            textView.setText(textView.getText()+ "6");
        }else
        if (e.getSource().equals(siete)) {
            textView.setText(textView.getText()+ "7");
        }else
        if (e.getSource().equals(ocho)) {
            textView.setText(textView.getText()+ "8");
        }else
        if (e.getSource().equals(nueve)) {
            textView.setText(textView.getText()+ "9");
        }else
        if (e.getSource().equals(cero)) {
            textView.setText(textView.getText()+ "0");
        }else
        if (e.getSource().equals(punto)) {
            int val = 0;
            for (int i = 0; i < textView.getText().length(); i++) {
                if(textView.getText().charAt(i) == '.'){
                    val = 1;
                    break;
                }
                
            }
            if(val == 1){
                JOptionPane.showMessageDialog(null, "numeros con un solo punto");                
            }else
                textView.setText(textView.getText()+ ".");
        }else
        if (e.getSource() == convertir) {
            convertir();
        }else
        if (e.getSource() == limpiar) {
            textView.setText("");
        }
    }

    private void convertir() {
        double val = Double.parseDouble(textView.getText());
        double result = (val/17);
        
        textView.setText(toString().valueOf(result));
    }
    
}
