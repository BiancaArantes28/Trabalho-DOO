/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bianca Arantes
 */
public class Programa {
    
    public static void main(String args[]){
        
        Cliente cliente1 = new Cliente();
        ContaCorrente conta1 = new ContaCorrente();
        
        cliente1.setNome("Bianca Arantes");
        conta1.setSaldo(50);
        
        
        System.out.println("O cliente "+cliente1.getNome());
        System.out.println("O saldo "+conta1.getSaldo());
        
        conta1.depositar(50);
        
        System.out.println("Saldo atual = "+conta1.getSaldo());
        
        
        
        
    }
    
}
