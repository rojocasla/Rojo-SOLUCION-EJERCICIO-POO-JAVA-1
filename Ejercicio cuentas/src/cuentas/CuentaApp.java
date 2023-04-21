
package cuentas;

/**
 *
 * @author info7
 */
public class CuentaApp {
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("rojo", "080405", 7, 1000);
        Cuenta c2 = new Cuenta();        
        
        c2.setNombre("Rojo");
        c2.setInteres(5);
        c2.setNro_cuenta("130814");
        c2.setSaldo(1000);
        
        c1.ingreso(200);
        
        System.out.println("Saldo "+c1.getSaldo());
        
        
        c1.extraccion(500);
        
        System.out.println("Saldo "+c1.getSaldo());
        
        //c2.ingreso(600);
        System.out.println("Saldo "+c2.getSaldo());
        
        c2.ingreso(2000);
        c1.ingreso(300);
        
       //consulta saldo
       
        System.out.println("Saldo cuenta1 " + c1.getSaldo());
        System.out.println("Saldo cuenta2 " + c2.getSaldo());
        
        //transferencia
        
        c1.transferencia(c2, 500);
            
        System.out.println("Saldo despues de transferencia ");
        
         System.out.println("Saldo cuenta1 " + c1.getSaldo());
        System.out.println("Saldo cuenta2 " + c2.getSaldo());
        
        
        
    }
}
