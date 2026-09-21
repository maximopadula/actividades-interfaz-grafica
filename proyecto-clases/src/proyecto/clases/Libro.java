/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.clases;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private double precioBase;
    private int stock;
    
    public Libro(String titulo, String autor, double precioBase, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Getters (obtener valor) y setters (asignar valor)
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    } 
}
