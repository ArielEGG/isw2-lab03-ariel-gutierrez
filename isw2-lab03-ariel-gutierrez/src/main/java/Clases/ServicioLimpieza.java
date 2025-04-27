
package Clases;

public abstract class ServicioLimpieza {
    protected String direccionCliente;
    protected double duracionHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;

    public ServicioLimpieza(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }
    
    public abstract String getDescripcion();
    
    public double calcularPrecioBase() {
        return duracionHoras * tarifaHora;
    }
    
    public abstract double calcularPrecioFinal();
}
