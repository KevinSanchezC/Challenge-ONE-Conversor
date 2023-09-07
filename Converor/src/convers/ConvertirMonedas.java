package convers;

import javax.swing.JOptionPane;

 public class ConvertirMonedas{
		
	public void ConvertirPesoADolares(double valor) {
		double monedaDolar = valor/17.58;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showInputDialog(null, "$ " + monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesoAEuros(double valor) {
		double monedaEuro = valor/18.81;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		JOptionPane.showInputDialog(null, "$ " + monedaEuro+ " Euros");
	}
	
	public void ConvertirPesoALibras(double valor) {
		double monedaLibra = valor/21.94;
		monedaLibra = (double) Math.round(monedaLibra*100d)/100;
		JOptionPane.showInputDialog(null, "$ " + monedaLibra+ " Libras");
	}
	
	public void ConvertirPesoAWones(double valor) {
		double monedaWon = valor/0.03;
		monedaWon = (double) Math.round(monedaWon*100d)/100;
		JOptionPane.showInputDialog(null, "$ " + monedaWon+ " Wones");
	}
	
	public void ConvertirPesoAYenes(double valor) {
		double monedaYen = valor/0.12;
		monedaYen = (double) Math.round(monedaYen*100d)/100;
		JOptionPane.showInputDialog(null, "$ " + monedaYen+ " Yenes");
	}
	
}
