
package Clases;

/**
 *
 * @author L34215
 */
public abstract class ServicioAdicional extends ServicioLimpieza{
    protected ServicioLimpieza servicio;

    public ServicioAdicional(ServicioLimpieza servicio){
        this.servicio = servicio;
    }
    

    public abstract String getDescripcion();
    @Override
    public abstract double calcularPrecioFinal();
    
    
}
