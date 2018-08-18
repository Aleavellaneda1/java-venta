/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alejandro Avellaneda
 */
public class Venta {

   
    private Date fecha;
    private Date hora;
    private String numero_fact;
    private Float iva;
    private Float subtotal;
    private Float total;
    private Cliente unCliente;
    private ArrayList <LineaDeVenta>LineasDeVentas;

    public Venta(Date fecha, Date hora, String numero_fact, Float iva, Float subtotal, Float total) {
        this.fecha = fecha;
        this.hora = hora;
        this.numero_fact = numero_fact;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

     public void calcularLineasDeSubtotal(){
        
         for(LineaDeVenta ldv : LineasDeVentas){
             float calculo=0;
             calculo = ldv.getArticulo().getPrecio()*ldv.getCantidad();
             ldv.setSubtotal(calculo);
          
         }
        
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getNumero_fact() {
        return numero_fact;
    }

    public void setNumero_fact(String numero_fact) {
        this.numero_fact = numero_fact;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    
    
    
    
    
   
    
}
