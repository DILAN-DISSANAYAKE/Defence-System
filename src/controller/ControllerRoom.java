
package controller;

import interfaces.Observable;
import java.util.ArrayList;

public class ControllerRoom extends javax.swing.JFrame{
    
    private ArrayList<Observable> observvables=new ArrayList<>();
    
    public void addObservable(Observable observable){
        this.observvables.add(observable);
    }
    
    private Observable[] observable2=new Observable[0];
    
    public void addObservable2(Observable observerble){
        Observable[] tempObservable=new Observable[observable2.length+1];
        for (int i = 0; i < observable2.length; i++) {
            tempObservable[i]=observable2[i];
        }
        tempObservable[tempObservable.length-1]=observerble;
        observable2=tempObservable;
    }
}
