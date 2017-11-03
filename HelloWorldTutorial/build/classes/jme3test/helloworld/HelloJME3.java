/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jme3test.helloworld;

/**
 *
 * @author Irma Hardyanti
 */
import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;

public class HelloJME3 extends SimpleApplication{
    public static void main(String[] args) {
        HelloJME3 app = new HelloJME3();
        app.start();//starts the game
    }
    
    @Override
    /**
     * This method automatically called when an application started
     */
    public void simpleInitApp(){
        //MUNGKIN, sebelum bikin object(?) harus bikin blueprint(?) nya dulu
        Box b;
        b = new Box(1,1,1);//asumsi gue ini "blueprint" sebuah kubus
        Geometry geom =new Geometry("Box",b);//buat sebuah objek dari "blueprint" yang sudah dibuat
        
        //sampe sini, si kubus udah jadi (?) ga yakin juga sih..
        //tapi cuman rangkanya doang...
        //harus di tempel material...
        Material mat = new Material(assetManager,"Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color",ColorRGBA.Magenta);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
        //root node object is derived from SimpleApplication class
    }
    
}
