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
public class FlyRocketPowered implements  FlyBehavior{
    
    public void fly(){
        System.out.println("I'm flying with a rocket");
    }
}
