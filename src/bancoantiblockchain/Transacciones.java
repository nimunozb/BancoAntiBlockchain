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
    
    public boolean Consignar(double saldoCuenta, double valor){
        if (valor>0){
            saldoCuenta+=valor;
            this.Codigo="BancoCogsignacion";
            this.Codigo+=numeroTransaccion;
            this.numeroTransaccion++;
            return true;
        }
        return false;
    }
    public boolean Retirar(double saldoCuenta, double valor){
        if(saldoCuenta-valor>=0){
            saldoCuenta-=valor;
            this.Codigo="BancoRetiro";
            this.Codigo+=numeroTransaccion;
            this.numeroTransaccion++;
            return true;
        }
        return false;
    }
    
}
