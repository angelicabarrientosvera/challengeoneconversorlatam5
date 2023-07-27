package Negocio;

/**
 *
 * @author Angelica
 */
public class Principal {

    private Moneda monedas;
    private Temperatura temperaturas;

    public Principal() {
        this.monedas = new Moneda();
        this.temperaturas = new Temperatura();
    }

    public void ConvertirMonedas(String opcion, double valor) {
        switch (opcion) {
            case "De Pesos a Dolar":
                monedas.ConvertirPesosADolares(valor);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosAEuros(valor);
                break;
            case "De Pesos a Libras":
                monedas.ConvertirPesosALibras(valor);
                break;
            case "De Pesos a Yen":
                monedas.ConvertirPesosAYen(valor);
                break;
            case "De Pesos a Won Coreano":
                monedas.ConvertirPesosAWon(valor);
                break;
            case "De Dolar a Pesos":
                monedas.ConvertirDolaresAPesos(valor);
                break;
            case "De Euro a Pesos":
                monedas.ConvertirEurosAPesos(valor);
                break;
            case "De Libras a Pesos":
                monedas.ConvertirLibrasAPesos(valor);
                break;
            case "De Yen a Pesos":
                monedas.ConvertirYenAPesos(valor);
                break;
            case "De Won Coreano a Pesos":
                monedas.ConvertirWonAPesos(valor);
                break;
        }
    }

    public void ConvertirTemperatura(String opcion, double valor) {

        switch (opcion) {
            case "Grados Celcius a Grados Farenheit":
                temperaturas.ConvertirCelciusAFarenheit(valor);
                break;
            case "Grados Celcius a Kelvin":
                temperaturas.ConvertirCelciusAKelvin(valor);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperaturas.ConvertirFarenheitACelcius(valor);
                break;
            case "Kelvin a Grados Celcius":
                temperaturas.ConvertirKelvinACelcius(valor);
                break;
            case "Kelvin a Grados Farenheit":
                temperaturas.ConvertirKelvinAFarenheit(valor);
                break;
        }
    }

}
