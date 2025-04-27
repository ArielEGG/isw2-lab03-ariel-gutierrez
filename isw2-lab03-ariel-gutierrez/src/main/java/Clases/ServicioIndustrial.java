
package Clases;

/**
 *
 * @author L34215
 */
public class ServicioIndustrial extends ServicioLimpieza {
    private double multiplicadorRiesgo;

    public ServicioIndustrial(double multiplicadorRiesgo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }
    @Override
    public String getDescripcion(){
        return "Servicio de Limpieza Insdustrial";
    }
    @Override
    public double calcularPrecioFinal() {
        if(!incluyeMateriales){
            throw new IllegalArgumentException("Los servicios industriales deben incluir materiales");
        }
        return (tarifaHora * multiplicadorRiesgo) * duracionHoras;
    } 
}
