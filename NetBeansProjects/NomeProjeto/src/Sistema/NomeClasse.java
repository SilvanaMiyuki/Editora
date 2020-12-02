package Sistema;
import javax.swing.JOptionPane;
public class NomeClasse
{	private String nome;
        private int s;
        public NomeClasse() // construtor que contém o nome da classe
	{} 
        public void Metodo1()
        {this.nome = "";}
        
public static void main (String [] args) 
{NomeClasse obj = new NomeClasse();
obj.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
JOptionPane.showMessageDialog(null, "Olá "+obj.nome);

NomeClasse2 obj2 = new NomeClasse2();
obj2.Metodo2();
obj2.s = 123;
JOptionPane.showMessageDialog(null, "Senha: "+obj2.s); 
System.exit(0);
} 
}