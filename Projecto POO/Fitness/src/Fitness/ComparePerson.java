package Fitness;


import java.io.Serializable;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class ComparePerson implements Comparator<Person>,Serializable {
    
    @Override
    public int compare(Person p1,Person p2){
        
        return (p1.getName().compareTo(p2.getName()));
    }
    
    
}