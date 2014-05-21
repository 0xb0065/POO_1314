package Fitness;

import java.util.GregorianCalendar;


/**
 * Write a description of class Yoga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yoga extends Indoor 
{
    
    
    
    public Yoga(){
        super();
    }
    public Yoga(String name, GregorianCalendar date, double timeSpent){
        super(name,date,timeSpent);
        
    }
    public Yoga(Yoga tb){
        super(tb);
        
    }
    
    
    @Override
    public void setCalories(int peso) {//MET=2.5
      double mets=2.5;
      double calories=mets*peso*this.getTimeSpent();
      this.setActivityCalories(calories);    
    }
    
    ////////////toString equals clone
    
    
     public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());
        return sb.toString();      
    }
    
    
    
    @Override
    public boolean equals(Object a){
        if(this == a)
            return true;
        if(a == null || this.getClass() != a.getClass())
            return false;
        Yoga act = (Yoga) a;
        return  ( super.equals(act));
        
    }

    @Override
     public Yoga clone(){
        return new Yoga(this);
    } 
}