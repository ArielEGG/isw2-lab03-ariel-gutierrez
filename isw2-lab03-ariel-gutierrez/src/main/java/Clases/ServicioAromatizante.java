
package Clases;

/**
 *
 * @author L34215
 */
public class ServicioAromatizante extends ServicioAdicional{
    public ServicioAromatizante(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public String getDescripcion() {
        return "A";
    }

    @Override
    public double calcularPrecioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
