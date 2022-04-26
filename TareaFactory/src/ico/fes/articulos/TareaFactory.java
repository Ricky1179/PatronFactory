/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.articulos;

import ico.fes.factory.Articulo;
import ico.fes.factory.ArticuloFactory;
import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class TareaFactory {

    public static void main(String[] args) {
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que deseas comprar?:");
        System.out.println(Computadora.COMPUTADORA_Huawei + ") Computadora Huawei");
        System.out.println(Computadora.COMPUTADORA_Alienwere + ") Computadora Alienware");
        System.out.println(Computadora.COMPUTADORA_Xiaomi + ") Computadora Xiaomi");
        System.out.println(Smartphone.SMARTPHONE_Huawei + ") Celular Huawei");
        System.out.println(Smartphone.SMARTPHONE_Samsung + ") Celular Samsung");
        System.out.println(Smartphone.SMARTPHONE_Iphone + ") Celular Iphone");
        System.out.println(Tablet.TABLET_Huawei + ") Tablet Lenovo");
        System.out.println(Tablet.TABLET_Polaroid + ") Tablet Polaroid");
        System.out.println(Tablet.TABLET_lenovo + ") Tablet Lenovo");

        try {
            System.out.print("Elige un numero: ");
            seleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No tecleaste ningun numero");
        }

        Articulo producto = ArticuloFactory.creaArticulo(seleccion);
        System.out.println(producto.toString());
    }

}
