/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoantiblockchain;

/**
 *
 * @author Horacio
 */
public class Movimientos {
    private Fecha metadato=new Fecha(1,1,1);
    private double  valorCantidad;
    private int numeroMovimiento=0;
    Transacciones transaccion=new Transacciones();
    Movimientos[] movimientosRealizados=new Movimientos [40] ; 
   
    public Movimientos() {
        for (int i = 0; i < 40; i++) {
         movimientosRealizados[i]=null;}
    }

    public Movimientos[] getMovimientosRealizados() {
        return movimientosRealizados;
    }

    public void setMovimientosRealizados(Movimientos[] movimientosRealizados) {
        this.movimientosRealizados = movimientosRealizados;
    }

   public Fecha getMetadato() {
        return metadato;
    }

    public void setMetadato(Fecha metadato) {
        this.metadato = metadato;
    }

    public double getValorCantidad() {
        return valorCantidad;
    }

    public void setValorCantidad(double valorCantidad) {
        this.valorCantidad = valorCantidad;
    }
    
    public void consignarCuenta(double saldoCuenta,double valorcatidad){
        transaccion.Consignar(saldoCuenta, valorcatidad);
        movimientosRealizados[numeroMovimiento].metadato=this.metadato;
        movimientosRealizados[numeroMovimiento].valorCantidad=valorcatidad;
        int a=this.metadato.getDia();
        this.metadato.setDia(a++);
        if (this.metadato.getDia()>30){ a=this.metadato.getMes();
            this.metadato.setMes(a++);this.metadato.setDia(0);
        }else{
            if(this.metadato.getMes()>12){
                 a=this.metadato.getAno();
            this.metadato.setAno(a++);this.metadato.setMes(0);
            }numeroMovimiento++;
        }}
    
    public void RetirarCuenta(double saldocuenta,double valorCantidad){
        transaccion.Retirar(saldocuenta, valorCantidad);
         movimientosRealizados[numeroMovimiento].metadato=this.metadato;
        movimientosRealizados[numeroMovimiento].valorCantidad=valorCantidad;
        int a=this.metadato.getDia();
        this.metadato.setDia(a++);
        if (this.metadato.getDia()>30){ a=this.metadato.getMes();
            this.metadato.setMes(a++);this.metadato.setDia(0);
        }else{
            if(this.metadato.getMes()>12){
                 a=this.metadato.getAno();
            this.metadato.setAno(a++);this.metadato.setMes(0);
            }numeroMovimiento++;
        }
    }
    
 


}
