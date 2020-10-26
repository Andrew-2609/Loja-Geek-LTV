package classesDaLoja;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) throws IOException {
		Loja loja = new Loja();
		try {
			int dinheiros = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Quanto dinheiro você pode gastar, em R$?", "Saldo", JOptionPane.QUESTION_MESSAGE));
			
			loja.setSaldo(dinheiros);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Era necessário responder a pergunta corretamente.", "Tente novamente!",
					JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		
	}
}
