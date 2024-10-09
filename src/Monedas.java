public class Monedas {
    private double cantidad;
    private double resultado;
    private String monedaOrigen;
    private String monedaDestino;

    public Monedas(double cantidad, String monedaOrigen, String monedaDestino) {
        this.cantidad = cantidad;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public double getCantidad() {
        return cantidad;
    }
    public double getResultado() {
        return resultado;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void convertir(Conversor conversor) {
        this.resultado = this.cantidad * conversor.conversion_rate();
    }

    public void mostrarResultado() {
        System.out.printf("El valor %.2f[%s] es igual a %.2f[%s]%n", this.cantidad, this.monedaOrigen, this.resultado, this.monedaDestino);
    }



    @Override
    public String toString() {
        return "(cantidad=" + String.format("%.2f", cantidad) +
                ", monedaOrigen='" + monedaOrigen  +
                ", monedaDestino='" + monedaDestino  +
                ", resultado=" + String.format("%.2f", resultado) + ')';
    }
}
