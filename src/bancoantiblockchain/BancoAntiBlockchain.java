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
public class BancoAntiBlockchain {
    private static Cuenta cuenta=new Cuenta();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Cuenta cuenta1=new Cuenta(1,1,1,1006767,1400,"elver Galarga");   
         Cuenta cuenta2=new Cuenta(2,7,4,100678,800,"Rosa Melcalvo");
         
        
      cuenta1.RetirarCuenta(350);
      cuenta1.RetirarCuenta(380);
      cuenta2.CogsignarCuenta(50);
       cuenta2.CogsignarCuenta(505);
                
                      
         listadoMovimientos(cuenta1);
         listadoMovimientos(cuenta2);
    
    
    
    }
    
    public static void listadoMovimientos(Cuenta cuenta){
     for (int i = 0; i <40; i++) {
          if (cuenta.getMovimiento().getMovimientosRealizados()[i]!=null){
              System.out.println(" numero de cuenta "+cuenta.getNumeroCuenta()+" esta cuenta pertenece a "+cuenta.getCliente()+" ,este movimiento se raelizo el dia "+cuenta.getMovimiento().getMovimientosRealizados()[i].metadato.getDia()
              +" el mes "+cuenta.getMovimiento().getMovimientosRealizados()[i].metadato.getMes()+" el año "+cuenta.getMovimiento().getMovimientosRealizados()[i].metadato.getAno()+
                      " ,codigo de la trasaccion "+cuenta.getMovimiento().getMovimientosRealizados()[i].transaccion.getCodigo()+" por un valor de "+
                         cuenta.getMovimiento().getMovimientosRealizados()[i].valorCantidad);
          }
      }
      
      
  }
    
    
}
