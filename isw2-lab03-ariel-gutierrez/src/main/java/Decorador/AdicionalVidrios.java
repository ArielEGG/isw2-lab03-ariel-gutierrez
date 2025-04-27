
package Decorador;

import Clases.ServicioLimpieza;
import Clases.ServicioAdicional;

public class AdicionalVidrios extends ServicioAdicional{

    public AdicionalVidrios(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + " con Limpieza de Vidrios";
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 10;
    }

}
