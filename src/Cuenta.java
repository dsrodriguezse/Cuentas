/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsrodriguezse
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String dueno;
    public float saldo;
    
    public static void main(String[]args){
    Cuenta cuenta = new Cuenta (1012,"Magdalena");
    cuenta.setClave(1234);
    boolean resultado = cuenta.consignar(100000);
    if(resultado==true){
        System.out.println("Consignacion exitosa");
    }
    else{
        System.out.println("No se realizar la operacion");
    }
}

    public boolean consignar(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }
        else{
        return false;
        }
}
    public boolean retirar(double valor){
        if(valor<=0){
        return false;
        }
        else{
            this.saldo -= valor;
        if (saldo>= 0){
            return true;
        }
        else{
            return false;
        }
        }
}
    public boolean cambiarClave(int nuevaClave){
        if(nuevaClave>9999 || nuevaClave<0){
            return false;
        }
        else{
        this.clave=nuevaClave;
        return true;
        }
}
    public double consultarSaldo(){
        return this.saldo;
}
   
}
