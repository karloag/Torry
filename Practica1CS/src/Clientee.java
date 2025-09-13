/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Local User
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Cliente {
    
    public static void main(String[] args){
    ClienteRMI client=new ClientRMI();
    client.connectServer();

}
    
    private void connectServer(){

    try{
        Registry registro=LocateRegistry.getRegistry("localhost",8001);
        RMI intefaz=(RMI) registro.lookup("RemotoRMI");//busquedaObjetoRemoto
        
        int Suma;
        Suma=interfaz.sumar(5,5);
        System.out.println("La suma es igual a: ",Suma);
        
        
}
        catch (Exception ex){
            System.out.println(ex);
            
        }
}
}
