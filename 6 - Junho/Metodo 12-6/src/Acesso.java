
import javax.swing.JOptionPane;

public abstract class Acesso {
    
    private int x;
    
    public Acesso(){
        this.x = 4;
        JOptionPane.showMessageDialog(null,"O valor de x é: " + x);
    }
    
    public void Mostrar(){
        //variáveis fora desta classe funcionam
        this.x += 5;
        JOptionPane.showMessageDialog(null,"O valor de x é: " + x);
    }
    
    public static void Mostrar2(){
        //variáveis que estão fora dessa classe não vão funcionar
        int x = 6;
        JOptionPane.showMessageDialog(null,"O valor de x é: " + x);
    }
}
