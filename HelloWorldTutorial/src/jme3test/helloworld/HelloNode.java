/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jme3test.helloworld;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 *
 * @author Irma Hardyanti
 */
public class HelloNode extends SimpleApplication {

    public static void main(String[] args) {
        HelloNode app = new HelloNode();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        /**
         * create a blue box at coordinates (1,-1,1)*
         */
        Box box1 = new Box(1, 1, 1);
        Geometry blue = new Geometry("Box", box1);
        blue.setLocalTranslation(new Vector3f(1, -1, 1));
        Material mat1 = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat1.setColor("Color", ColorRGBA.Blue);
        blue.setMaterial(mat1);

        /**
         * create a red box straight above the blue one at (1,3,1)
         */
        Box box2 = new Box(1, 1, 1);
        Geometry red = new Geometry("Box", box2);
        red.setLocalTranslation(new Vector3f(1, 3, 1));
        Material mat2 = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Red);
        red.setMaterial(mat2);

        /**
         * Create a pivot node at (0,0,0) and attach it to the root node
         */
        Node pivot = new Node("pivot");
        rootNode.attachChild(pivot);

        /**
         * Attach the two boxes to the *pivot* node. (And transitively to the
         * root node.)
         */
        // rootNode --> pivot --> blue or red
        pivot.attachChild(blue);
        pivot.attachChild(red);
        /**
         * Rotate the pivot node: Note that both boxes have rotated!
         */
        pivot.rotate(.4f, .4f, 0f);

        Box mesh = new Box(Vector3f.ZERO, 1, 1, 1); // a cuboid default mesh
        Geometry thing = new Geometry("thing", mesh);
        thing.setLocalTranslation(new Vector3f(1,5,1));
        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        
        mat.setColor("Color", ColorRGBA.Green);
        thing.setMaterial(mat);
        pivot.attachChild(thing);
    }
}
