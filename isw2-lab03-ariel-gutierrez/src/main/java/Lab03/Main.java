
package Lab03;

import Clases.*;
import Decorador.*;
import Descuentos.*;
import Factory.ServicioFactory;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Resultados Ejercicio 1:");
        ServicioLimpieza sH1 = new ServicioHogar("Calle 8",2,20.5,false,"Ariel",false);
        ServicioLimpieza sO1 = new ServicioOficina(8,"Avenida Frutales",4,17,false,"Kevin"); 
        ServicioLimpieza sI1 = new ServicioIndustrial(5,"Pasaje Los Cisnes",5,30,true,"Ernesto");
        
        double precioFinalHogar = sH1.calcularPrecioFinal();
        double precioFinalOficina = sO1.calcularPrecioFinal();
        double precioFinalIndustrial = sI1.calcularPrecioFinal();
        
        System.out.println("Precio final del Servicio de Hogar: " + precioFinalHogar);
        System.out.println("Precio final del Servicio de Oficina: " + precioFinalOficina);
        System.out.println("Precio final del Servicio Industrial: " + precioFinalIndustrial);
        //Ejercicio 2
        System.out.println("Resultados Ejercicio 2:");
        DescuentoClienteFrecuente dF = new DescuentoClienteFrecuente();
        DescuentoCampaña dC = new DescuentoCampaña();
        
        double descuentoIndustrialCampaña = dC.aplicarDescuento(precioFinalIndustrial);
        double descuentoOficinaFrecuente = dF.aplicarDescuento(precioFinalOficina);
        
        System.out.println("Precio final descontado del Servicio de Oficina por cliente frecuente: " + descuentoOficinaFrecuente);
        System.out.println("Precio final descontado del Servicio Industrial por campaña: " + descuentoIndustrialCampaña);
        //Ejercicio 3
        System.out.println("Resultados del Ejercicio 3:");
        sH1 = new AdicionalAromatizante(sH1);
        sH1 = new AdicionalDesinfeccion(sH1);
        sH1 = new AdicionalVidrios(sH1);
        
        System.out.println(sH1.getDescripcion());
        System.out.println("Precio final del servicio Hogar: " + sH1.calcularPrecioFinal());
        //Ejercicio 4
        System.out.println("Resultados del Ejercicio 4:");
        ServicioFactory FabricaS = new ServicioFactory();
        ServicioLimpieza sH2 = FabricaS.crearServicio("hogar","Calle 10",3,15,true,"Luisa","true");
        ServicioLimpieza sO2 = FabricaS.crearServicio("oficina","Edificio A",5,30,false,"Valeria","4");
        ServicioLimpieza sI2 = FabricaS.crearServicio("industrial","Pasaje Celestial",5,20,true,"Marisabel","2");
        
        System.out.println(sH2.getDescripcion() + " con precio final de: " + sH2.calcularPrecioFinal());
        System.out.println(sO2.getDescripcion() + " con precio final de: " + sO2.calcularPrecioFinal());
        System.out.println(sI2.getDescripcion() + " con precio final de: " + sI2.calcularPrecioFinal());
    }
}
