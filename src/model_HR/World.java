/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class World {
    private ArrayList<Regions> listRegions =  new ArrayList<Regions>();
    
    public World(){
        
    }
    public void readRegions(){
        
    }

    public ArrayList<Regions> getListRegions() {
        return listRegions;
    }

    public void setListRegions(ArrayList<Regions> listRegions) {
        this.listRegions = listRegions;
    }
    
}
