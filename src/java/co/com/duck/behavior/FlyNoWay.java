/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.duck.behavior;

import co.com.duck.interfaces.FlyBehavior;

/**
 *
 * @author Usuario
 */
public class FlyNoWay implements FlyBehavior{

    public void fly(){
        System.out.println("I can't fly");
    }
    
}
