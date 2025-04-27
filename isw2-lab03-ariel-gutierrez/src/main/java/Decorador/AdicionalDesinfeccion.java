package Decorador;

import Clases.ServicioLimpieza;
import Clases.ServicioAdicional;

public class AdicionalDesinfeccion extends ServicioAdicional {

    public AdicionalDesinfeccion(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + " con Desinfeccion";
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 15;
    }
    
}
