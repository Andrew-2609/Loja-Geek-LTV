package classesDaLoja;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MeuJButton extends JButton {
	MeuJButton(String text) {
		this.setText(text);
		this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),
				BorderFactory.createEmptyBorder(8, 8, 8, 8)));
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setFont(new Font("century gothic", Font.BOLD, 14));
	}
}
