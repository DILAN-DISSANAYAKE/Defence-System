
package controller;

import interfaces.Observable;
import java.util.ArrayList;
import view.Helicopter;
import view.Submarine;
import view.Tank;

public class ControllerRoom extends javax.swing.JFrame{
    
    private ArrayList<Observable> observables=new ArrayList<>();
    
    public void addObservable(Observable observable){
        this.observables.add(observable);
    }
    
//    private Observable[] observable2=new Observable[0];
//    
//    public void addObservable2(Observable observerble){
//        Observable[] tempObservable=new Observable[observable2.length+1];
//        for (int i = 0; i < observable2.length; i++) {
//            tempObservable[i]=observable2[i];
//        }
//        tempObservable[tempObservable.length-1]=observerble;
//        observable2=tempObservable;
//    }
    
    public void sendMessage(String message){
        for(Observable observable:observables){
            observable.displayMessage(message);
        }
    }
    public void sendPrivateMessage(String defenceType,String message){
        for(Observable observable:observables){
            if(defenceType.equals("Tank")&& observable instanceof Tank){
                observable.displayMessage(message);
                return;
            }else if(defenceType.equals("Submarine")&& observable instanceof Submarine){
                observable.displayMessage(message);
                return;
            }else if(defenceType.equals("Helicopter")&& observable instanceof Helicopter){
                observable.displayMessage(message);
                return;
            }
        }
    }
    public void setAreaClear(boolean isClear,String state){
        for(Observable observable:observables){
            observable.setAreaClear(isClear,state);
        }
    }
}
