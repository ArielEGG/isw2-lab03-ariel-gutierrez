
package Descuentos;

public class DescuentoCampaña implements Descuento{
    private static final double PORCENTAJE_DESCUENTO1 = 0.30;
    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - PORCENTAJE_DESCUENTO1);
    }
}
