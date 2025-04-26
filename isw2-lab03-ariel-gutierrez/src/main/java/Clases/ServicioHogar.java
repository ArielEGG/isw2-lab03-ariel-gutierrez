
package Clases;

/**
 *
 * @author L34215
 */
public class ServicioHogar extends ServicioLimpieza{
    private boolean esApartamento;
    public ServicioHogar(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, boolean esApartamento) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioB = calcularPrecioBase();
        if(esApartamento){
            return precioB * 0.9;
        }else{
            return precioB;
        }
    }

    
}
