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
public class Transacciones {
    private String Codigo;
    private  int numeroTransaccion=0;
    public Transacciones() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public double Consignar(double saldoCuenta, double valor){
        if (valor>0){
            System.out.println("Va a consignar un monto de "+valor);
            saldoCuenta+=valor;
            this.Codigo="BancoCogsignacion";
            this.Codigo+=numeroTransaccion;
            this.numeroTransaccion++;
            System.out.println("Su nuevo saldo es "+saldoCuenta);
            return saldoCuenta;
        }System.out.println("no se pudo realizar la consignacion");
        return saldoCuenta;
    }
    public double Retirar(double saldoCuenta, double valor){
        if(saldoCuenta-valor>=0){
            System.out.println("Va a retirar un monto de "+valor);    
            double a=saldoCuenta-valor;
            System.out.println("Su nuevo saldo es "+a);
            this.Codigo="BancoRetiro";
            this.Codigo+=numeroTransaccion;
            this.numeroTransaccion++;
            
            return a;
        }System.out.println("no se pudo realizar el retiro");
        return saldoCuenta;
    }
    
}
