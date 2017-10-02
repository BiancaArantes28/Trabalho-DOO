/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bianca Arantes
 */
public class ContaPoupanca extends Conta{
    
    @Override
    public void depositar(float valor){
        this.saldo += valor + 20;
    }
    
    
}
