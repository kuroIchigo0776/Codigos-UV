package com.gestorinventario;

public class GestorInventario {

    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock ;
    
    public String getnombreArticulo(){
        return nombreArticulo;
    } 
    
    public double getprecioUnitario(){
        return precioUnitario ;
    }
    
    public int getcantidadStock(){
        return cantidadStock ;
    }
    
    public void setnombreArticulo(String nombreArticulo){
        this.nombreArticulo = nombreArticulo ;
    } 
    
    public void setprecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario ;
    }
    
    public void setcantidadStock(int cantidadStock){
        this.cantidadStock = cantidadStock ;
    }

    private double calcularTotalConDescuento(double descuento) {
        double subtotal = this.cantidadStock * this.precioUnitario;
        return subtotal - (subtotal * (descuento / 100.0));
    }

    public void procesarActualizacion(String nombre, double precio, int cantidadNueva, double descuento) {
        this.nombreArticulo = nombre;
        this.precioUnitario = precio;
        this.cantidadStock = cantidadNueva;
        double totalFinal = calcularTotalConDescuento(descuento);
        imprimirReporte(totalFinal);
    }

    private void imprimirReporte(double totalFinal) {
        System.out.println("Articulo: " + this.nombreArticulo + " | Stock: " + this.cantidadStock);
        System.out.println("Total inventario valorizado: $" + totalFinal);
    }

    public static void main(String[] args) {
        GestorInventario item = new GestorInventario();
        item.procesarActualizacion("Laptop Pro", 12500.0, 8, 10.0);
    }
}
