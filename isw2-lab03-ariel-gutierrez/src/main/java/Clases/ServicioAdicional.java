//El Decorador abstracto se encuentra junto al ServicioLimpieza para acceder a los atributos protegidos para aplicarlos en el super()
package Clases;

public abstract class ServicioAdicional extends ServicioLimpieza{
    protected ServicioLimpieza servicio;

    public ServicioAdicional(ServicioLimpieza servicio){
        super(servicio.direccionCliente,servicio.duracionHoras,servicio.tarifaHora,servicio.incluyeMateriales,servicio.nombreCliente);
        this.servicio = servicio;
    }
    
    @Override
    public abstract String getDescripcion();
    @Override
    public abstract double calcularPrecioFinal();
    
    
}
