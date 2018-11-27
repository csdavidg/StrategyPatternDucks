/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.duck;

import co.com.duck.behavior.FlyWithWings;
import co.com.duck.behavior.Quack;

/**
 *
 * @author Usuario
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm real mallard duck");
    }

}
