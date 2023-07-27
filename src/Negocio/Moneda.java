/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Moneda {
    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = valor / 3739.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
    }

    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor / 4050.48;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
    }

    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor / 4890.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
    }

    public void ConvertirPesosAYen(double valor) {
        double monedaYen = valor / 29.68;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
    }

    public void ConvertirPesosAWon(double valor) {
        double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
    }

    public void ConvertirDolaresAPesos(double valor) {
        double monedaDolar = valor * 3739.00;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
    }

    public void ConvertirEurosAPesos(double valor) {
        double monedaEuro = valor * 4050.48;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
    }

    public void ConvertirLibrasAPesos(double valor) {
        double monedaLibra = valor * 4890.52;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
    }

    public void ConvertirYenAPesos(double valor) {
        double monedaYen = valor * 29.68;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
    }

    public void ConvertirWonAPesos(double valor) {
        double monedaWon = valor * 3.04;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
    }

}
