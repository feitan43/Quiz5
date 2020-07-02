/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5;

/**
 *
 * @author Administrator
 */
class EmptyDequeException extends Exception {
    public EmptyDequeException(){
        super("The queue is empty.");
    }
}
