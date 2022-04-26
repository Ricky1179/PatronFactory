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
public class Computadora implements Articulo{

    private int ram;
    private int almacenamiento;
    private String Procesador;
    private String marca;

    public Computadora() {
    }

    public Computadora(int ram, int almacenamiento, String Procesador, String marca) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.Procesador = Procesador;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    @Override
    public String toString() {
        return "Computadora { ram: " + this.ram + " almacenamiento: "
                + this.almacenamiento + " Procesador: " + this.Procesador
                + " Marca" + this.marca + " }";
    }

}
