package starter;

import controller.ControllerRoom;
import view.Helicopter;
import view.MainController;
import view.Submarine;
import view.Tank;

public class Starter {
    public static void main(String[] args) {
        MainController mainController= new MainController();
        Helicopter helicopter=new Helicopter(mainController);
        Submarine submarine=new Submarine(mainController);
        Tank tank=new Tank(mainController);
        
        mainController.addObservable(submarine);
        mainController.addObservable(tank);
        mainController.addObservable(helicopter);
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        submarine.setVisible(true);
        tank.setVisible(true);
        
    }
}
