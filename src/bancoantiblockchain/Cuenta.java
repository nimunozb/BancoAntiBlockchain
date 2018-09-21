/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoantiblockchain;

/**
 *
 * @author Nicolas Muñoz Batista
 */
public class Cuenta {
private Fecha creacion=new Fecha();
private int numeroCuenta;
private double saldo;
private String Cliente;
 private Movimientos movimiento;
    public Cuenta() {
       movimiento=new Movimientos();
    }

    public Cuenta(int diam,int mes,int ano, int numeroCuenta, double saldo, String Cliente) {
       movimiento=new Movimientos();
       this.creacion.setDia(diam);
        this.creacion.setMes(mes);
         this.creacion.setAno(ano);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.Cliente = Cliente;
    }

    public Movimientos getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimientos movimiento) {
        this.movimiento = movimiento;
    }

    
    public Fecha getCreacion() {
        return creacion;
    }
   public void setCreacion(Fecha creacion) {
        this.creacion = creacion;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

 public void RetirarCuenta(double valorCantidad){
     double a= movimiento.RetirarCuenta(this.saldo, valorCantidad);
     this.saldo=a;
    }
public void CogsignarCuenta(double valorCantidad){
   double a=movimiento.consignarCuenta(this.saldo, valorCantidad);
     this.saldo=a;
            }

}
