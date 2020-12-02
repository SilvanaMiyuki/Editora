package Sistema;
import javax.swing.JOptionPane;
public class NomeClasse2
{        public int s;
	public NomeClasse2() // construtor que contém o nome da classe
	{} 
        public void Metodo2()
        {this.s = 123;}
        
public static void main (String [] args) 
{NomeClasse2 obj = new NomeClasse2();
obj.Metodo2();
JOptionPane.showMessageDialog(null, "Senha: "+obj.s); 
System.exit(0);
} 
}