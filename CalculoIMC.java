package cursojava.executavel;

import javax.swing.JOptionPane;

public class CalculoIMC {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Digite seu PESO: ");
		String altura = JOptionPane.showInputDialog("Digite sua ALTURA: ");
		
		
		double nPeso = Double.parseDouble (peso);
		double nAltura = Double.parseDouble (altura);
		
		double imc = nPeso / (nAltura * nAltura);
		
		
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Voc� esta com IMC " + imc + " ABAIXO DO PESO");
		}else if (imc >= 18.6 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� esta SAUD�VEL com IMC: " + imc);
			}else if (imc >= 25 && imc <= 29.9) {
				JOptionPane.showMessageDialog(null, "Voc� EXCEDEU o peso seu IMC �: " + imc);
				}else if (imc >=30 && imc <= 34.9) {
					JOptionPane.showMessageDialog(null, "Cuidado, OBESIDADE Grau I, seu IMC �: " + imc);
					}else if (imc >= 35 && imc <= 39.9) {
						JOptionPane.showInternalMessageDialog(null, "Vamos se cuidar voc� esta com OBESIDADE Grau II, seu IMC �: " + imc);
						}else if (imc >= 40) {
							JOptionPane.showInternalMessageDialog(null, "ALERTA, voc� esta com OBESIDADE Grau III, seu IMC �: " + imc);
						} 
		
				
	}
}
