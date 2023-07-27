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
public class Temperatura {

    public double ConvertirCelciusAFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
        return farenheit;
    }

    public void ConvertirCelciusAKelvin(double valor) {
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
    }

    public void ConvertirFarenheitACelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
    }

    public double ConvertirKelvinACelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
    }

    public void ConvertirKelvinAFarenheit(double valor) {
        double kelvinFarenheit = ConvertirKelvinACelcius(valor);
        kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
        kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
    }

}
