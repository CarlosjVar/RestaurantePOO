/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author Jos
 */
public interface Observable {
    public void addObserver (Observer observador);
    public void updateObservers ();
    public void removeObserver (int index) ;
    public void removeObserver (Observer observer) ;
    public ArrayList <Observer> getObservers () ;
}
