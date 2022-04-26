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
public class Smartphone implements Articulo{

    private int ram;
    private int almacenamiento;
    private String marca;
    private int camaraPrincipal;
    private int bateria;

    public Smartphone() {
    }

    public Smartphone(int ram, int almacenamiento, String marca, int camaraPrincipal, int bateria) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.marca = marca;
        this.camaraPrincipal = camaraPrincipal;
        this.bateria = bateria;
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

    public int getCamaraPrincipal() {
        return camaraPrincipal;
    }

    public void setCamaraPrincipal(int camaraPrincipal) {
        this.camaraPrincipal = camaraPrincipal;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Computadora { ram: " + this.ram + " almacenamiento: "
                + this.almacenamiento + " Marca: " + this.marca + 
                " CamaraPrincipal: " + this.camaraPrincipal + " Bateria:" + this.bateria + " }";
    }

}
