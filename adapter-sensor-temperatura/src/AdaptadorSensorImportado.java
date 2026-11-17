public class AdaptadorSensorImportado implements SensorTemperatura {
    private SensorImportado sensor;

    public AdaptadorSensorImportado(SensorImportado sensor) {
    this.sensor = sensor;
    }
    public String getNombre() {
        return "Importado " + sensor.getModelo();
    }
    public double leerCelsius() {
        return (sensor.readFahrenheit() - 32) * 5 / 9;
    }
}
