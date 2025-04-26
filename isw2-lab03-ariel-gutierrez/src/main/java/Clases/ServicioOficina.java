
package Clases;

/**
 *
 * @author L34215
 */
public class ServicioOficina extends ServicioLimpieza{
    private int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }
    @Override
    public double calcularPrecioFinal() {
        double HoraT = duracionHoras + (0.1 * cantidadEmpleados);
        double precioT = HoraT * tarifaHora;
        return precioT * 1.18;
        
    }
    
    
}
