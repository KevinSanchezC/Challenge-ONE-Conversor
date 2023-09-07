package convers;

import javax.swing.JOptionPane;



public class ConvertidorMonedasAPesos {
			
		public void ConvertirDolaresAPeso(double valor) {
			double monedaDolar = valor*17.58;
			monedaDolar = (double) Math.round(monedaDolar*100d)/100;
			JOptionPane.showInputDialog(null, "$ " + monedaDolar+ " Pesos");
		}
		
		public void ConvertirEurosAPeso(double valor) {
			double monedaEuro = valor*18.81;
			monedaEuro = (double) Math.round(monedaEuro*100d)/100;
			JOptionPane.showInputDialog(null, "$ " + monedaEuro+ " Pesos");
		}
		
		public void ConvertirLibrasAPeso(double valor) {
			double monedaLibra = valor*21.94;
			monedaLibra = (double) Math.round(monedaLibra*100d)/100;
			JOptionPane.showInputDialog(null, "$ " + monedaLibra+ " Pesos");
		}
		
		public void ConvertirWonesAPeso(double valor) {
			double monedaWon = valor*0.03;
			monedaWon = (double) Math.round(monedaWon*100d)/100;
			JOptionPane.showInputDialog(null, "$ " + monedaWon+ " Pesos");
		}
		
		public void ConvertirYenesAPeso(double valor) {
			double monedaYen = valor*0.12;
			monedaYen = (double) Math.round(monedaYen*100d)/100;
			JOptionPane.showInputDialog(null, "$ " + monedaYen+ " Pesos");
		}
		
	
}
