/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author info7
 */
public class Cuenta {
    private String nombre;
    private String nro_cuenta;
    private double interes;
    private double saldo;

    public Cuenta(String nombre, String nro_cuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.nro_cuenta = nro_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(String nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//metodo ingreso
    public boolean ingreso(double monto){
        if(monto > 0){
            saldo += monto;
            return true;
        }else{
            return false;
        }
    }
    
    
    //metodo extraccion
    public boolean extraccion(double monto){
        if(monto > 0 && saldo >= monto){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }
    
    
    //metodo transferencia
    
    public boolean transferencia(Cuenta cuentaEnvio, double monto){
        if(extraccion(monto) && cuentaEnvio.ingreso(monto)){
            return true;
        }else{
            return false;
        }
    }
    
    
}
