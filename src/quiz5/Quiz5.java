/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz5;

import doublylinkedlist.DNode;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Quiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Person p1 = new Person(1, "James");
        Person p2 = new Person(5, "Dylan");
        Person p3 = new Person(7, "Felix");
        Person p4 = new Person(13, "Clian");
        Person p5 = new Person(15, "Anton");
    
        DNode<Person> person1 = new DNode<>(null, p1, null);
        DNode<Person> person2 = new DNode<>(null, p2, null);
        DNode<Person> person3 = new DNode<>(null, p3, null);
        DNode<Person> person4 = new DNode<>(null, p4, null);
        DNode<Person> person5 = new DNode<>(null, p5, null);
        
       DequeList<DNode> transaction = new DequeList<>();
       transaction.addFirst(person1);
       transaction.addFirst(person2);
       transaction.addFirst(person3);
       transaction.addFirst(person4);
       transaction.addLast(person5);
    
        try {
            System.out.println("Before Remove: ");    
            displayTransactions(transaction);
           
            System.out.println();
            System.out.println("Remove Last: " );
            System.out.print("After Remove: \n");
            transaction.removeLast();
            displayTransactions(transaction);
            
            System.out.println();
            System.out.println("Remove First: " );
            System.out.print("After Remove: \n");
            transaction.removeFirst();
            displayTransactions(transaction);
            
            System.out.println();
            System.out.println("Remove First: " );
            System.out.print("After Remove: \n");
            transaction.removeFirst();
            displayTransactions(transaction);
            
            System.out.println();
            System.out.println("Remove First: " );
            System.out.print("After Remove: \n");
            transaction.removeFirst();
            displayTransactions(transaction);
            
            System.out.println();
            System.out.println("Remove First: " );
            System.out.print("After Remove: \n");
            transaction.removeFirst();
            displayTransactions(transaction);
          
            
        } catch (EmptyDequeException ex) {
            System.out.println("Empty");
        }
    }
    private static void displayTransactions(DequeList<DNode> dequeList) throws EmptyDequeException {
            DNode<Person> temp= dequeList.first().getNext();
        for (int i = 0; i < dequeList.size(); i++) {
            System.out.println("Transaction No." + (i + 1) + ": " + temp.getElement().getName()
                    + ", Person ID: " + temp.getElement().getPersonID());
            temp = temp.getNext();
        }
    }
}

