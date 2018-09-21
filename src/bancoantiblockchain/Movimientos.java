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
    Fecha metadato=new Fecha(22,2018,9);
    double  valorCantidad;
    private int numeroMovimiento=0;
    Transacciones transaccion=new Transacciones();
    private Movimientos[] movimientosRealizados=new Movimientos [40] ; 
   
    public Movimientos() {
      
    }

    public Movimientos[] getMovimientosRealizados() {
        return movimientosRealizados;
    }

    public void setMovimientosRealizados(int a,Movimientos movimiento) {
        this.movimientosRealizados[a] = movimiento;
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
    
    public double consignarCuenta(double saldoCuenta,double valorcatidad){
       saldoCuenta=transaccion.Consignar(saldoCuenta, valorcatidad);
        Movimientos movimientos=new Movimientos();
        movimientos.metadato.setDia(this.metadato.getDia());
        movimientos.metadato.setMes(this.metadato.getMes());
         movimientos.metadato.setAno(this.metadato.getAno());
        movimientos.valorCantidad=valorcatidad;
         movimientos.transaccion.setCodigo(transaccion.getCodigo()); 
        setMovimientosRealizados(numeroMovimiento,movimientos);
        int a=this.metadato.getDia();
        this.metadato.setDia(a++);
        if (this.metadato.getDia()>30){ a=this.metadato.getMes();
            this.metadato.setMes(a++);this.metadato.setDia(1);
        }else{
            if(this.metadato.getMes()>12){
                 a=this.metadato.getAno();
            this.metadato.setAno(a++);this.metadato.setMes(1);
            }numeroMovimiento++;
        }return saldoCuenta;
    }
    
    public double RetirarCuenta(double saldocuenta,double valorCantidad){
       saldocuenta=transaccion.Retirar(saldocuenta, valorCantidad);
       Movimientos movimientos=new Movimientos();
       movimientos.metadato.setDia(this.metadato.getDia());
        movimientos.metadato.setMes(this.metadato.getMes());
         movimientos.metadato.setAno(this.metadato.getAno());
       movimientos.valorCantidad=valorCantidad;
       movimientos.transaccion.setCodigo(transaccion.getCodigo()); 
       setMovimientosRealizados(numeroMovimiento,movimientos);
       int a=this.metadato.getDia();
       this.metadato.setDia(a++);
       if (this.metadato.getDia()>30){ a=this.metadato.getMes();
            this.metadato.setMes(a++);this.metadato.setDia(0);
        }else{
            if(this.metadato.getMes()>13){
                 a=this.metadato.getAno();
            this.metadato.setAno(a++);this.metadato.setMes(0);
            }numeroMovimiento++;
        }
    return saldocuenta;
    }
    
 


}
