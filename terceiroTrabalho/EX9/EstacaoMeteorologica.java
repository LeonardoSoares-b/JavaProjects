package EX9;

public class EstacaoMeteorologica {
    public static void main(String[] args) {
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();

        AdaptadorFarenheitParaCelsius adapterObject = new AdaptadorFarenheitParaCelsius(medidorFarenheit);
        double temperaturaCelsiusObject = adapterObject.medirTemperatura();
        System.out.println("Temperatura em Celsius: " + temperaturaCelsiusObject);
    }
}
