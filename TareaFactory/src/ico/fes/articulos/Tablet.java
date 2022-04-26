/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.articulos;

import ico.fes.factory.Articulo;

/**
 *
 * @author ricky
 */
public class Tablet implements Articulo{

    private int ram;
    private int almacenamiento;
    private String marca;
    private float tamañoPantalla;

    public Tablet() {
    }

    public Tablet(int ram, int almacenamiento, String marca, float tamañoPantalla) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.marca = marca;
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(float tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return "Computadora { ram: " + this.ram + " almacenamiento: "
                + this.almacenamiento + " Marca: " + this.marca
                + " TamañoPantalla: " + this.tamañoPantalla + " }";
    }

}
