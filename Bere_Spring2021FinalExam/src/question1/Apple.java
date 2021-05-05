/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Apple extends Game implements SmartPhone, Features {

    @Override
    public void Game() {
        System.out.println("Games can be installed in ios platform");
    }

    @Override
    public void os() {
        System.out.println("This is an ios platform");
    }

    @Override
    public void appStore() {
        System.out.println("This is a place for downloading applications");
    }

    @Override
    public void touchId() {
        System.out.println("TouchId is an important feature of Apple");
    }
}
