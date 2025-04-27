
package Decorador;

import Clases.ServicioAdicional;
import Clases.ServicioLimpieza;

public class AdicionalAromatizante extends ServicioAdicional{
    public AdicionalAromatizante(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + " con Aromatizante";
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 5;
    }
}
