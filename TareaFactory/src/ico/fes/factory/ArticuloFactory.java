/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import ico.fes.articulos.Computadora;
import ico.fes.articulos.Smartphone;
import ico.fes.articulos.Tablet;

/**
 *
 * @author ricky
 */
public class ArticuloFactory {
    public static Articulo creaArticulo(int tipo){
        switch(tipo)
        {
            case Articulo.COMPUTADORA_Huawei:
                return new Computadora(8, 512, "AMD Ryzen 3500U", "Huawei");
            case Articulo.COMPUTADORA_Alienwere:
                return new Computadora(16, 1024, "Intel 11900", "Alienware");
            case Articulo.COMPUTADORA_Xiaomi:
                return new Computadora(8, 256, "AMD Ryzen 5500U", "Xiaomi");
            case Articulo.SMARTPHONE_Huawei:
                return new Smartphone(6, 128, "p30", 48, 4000);
            case Articulo.SMARTPHONE_Samsung:
                return new Smartphone(6, 256, "Galaxy", 32, 3500);
            case Articulo.SMARTPHONE_Iphone:
                return new Smartphone(4, 128, "Iphone 10", 32, 3000);
            case Articulo.TABLET_Huawei:
                return new Tablet(8, 256, "matePad", 9.5f);
            case Articulo.TABLET_Polaroid:
                return new Tablet(6, 64, "Pomd", 7.5f);
            case Articulo.TABLET_lenovo:
                return new Tablet(12, 256, "Tablet", 8.5f);
            default:
                throw new AssertionError();
        }
    }
}
