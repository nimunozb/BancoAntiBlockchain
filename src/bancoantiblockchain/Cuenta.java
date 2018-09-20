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
private Fecha creacion;
private int numeroCuenta;
private double saldo;
private String Cliente;

    public Cuenta() {
         Movimientos movimiento=new Movimientos();
    }

    public Cuenta(Fecha creacion, int numeroCuenta, double saldo, String Cliente) {
       Movimientos movimiento=new Movimientos();
       this.creacion = creacion;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.Cliente = Cliente;
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




}
