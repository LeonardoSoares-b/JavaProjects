package EX9;

public class AdaptadorFarenheitParaCelsius implements MedidorCelsiusIF {
    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsius(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
        double temperaturaCelsius = (temperaturaFarenheit - 32) / 1.8;
        return temperaturaCelsius;
    }
}
