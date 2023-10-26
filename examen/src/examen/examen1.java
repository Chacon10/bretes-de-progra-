/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Laptop
 */
public class examen1 {
public String nomcliente;
    public int cedcliente;
    public int numfactura;
    public int montfactura;
    public int mesfactura;
    public int aniofactura;
    public int estadofactura;
    
     public examen1(String nomcliente, int cedcliente, int numfactura, int montfactura, int mesfactura) {
        this.nomcliente = nomcliente;
        this.cedcliente = cedcliente;
        this.numfactura = numfactura;
        this.montfactura = montfactura;
        this.mesfactura = mesfactura;
    }
public void nomcliente(){  
        System.out.println("nomcliente");
    }
    public void cedcliente(){
            System.out.println("cedcliente");
    }
    public void numfactura(){
            System.out.println("numfactura");    
    }
    public void monfactura(){
        System.out.println("monfactura");
    }
    public void mesfactura(){
        System.out.println("mesfactura");
    }
        
    public String getNomcliente() {
        return nomcliente;
    }

    public int getCedcliente() {
        return cedcliente;
    }

    public int getNumfactura() {
        return numfactura;
    }

    public int getMontfactura() {
        return montfactura;
    }

    public int getMesfactura() {
        return mesfactura;
    }

    public int getAniofactura() {
        return aniofactura;
    }

    public int getEstadofactura() {
        return estadofactura;
    }

    }
