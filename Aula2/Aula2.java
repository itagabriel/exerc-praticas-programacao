package class_1908;

import javax.swing.JOptionPane;

public class Aula2 {

	public static void main(String[] args) {
		float[] numero = new float[10];

		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog("Digite um número:");
			numero[i] = Float.parseFloat(input);
		}

		float maior = numero[0];
		float menor = numero[0];
		float soma = numero[0];

		for (int i = 1; i < numero.length; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
			}
			if (numero[i] < menor) {
				menor = numero[i];
			}
			soma = soma + numero[i];
		}
		
		float media = soma / numero.length;
		
		String resultado = "Menor: " + menor + "\nMaior: " + maior + "\nSoma: " + soma + "\nMedia: " + media;
		
		// MOSTRAR RESULTADO
		JOptionPane.showMessageDialog(null, resultado);

	}
}