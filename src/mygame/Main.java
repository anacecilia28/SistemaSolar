package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    public Spatial ob;
    
    //Creación de Quaternion para la ubicación de la cámara.
    public static final Quaternion PITCH090 = new Quaternion().fromAngleAxis(FastMath.PI/2, new Vector3f(1,0,0));

    public static void main(String[] args) {
        
        //Crear el objeto para controlar las especificaciones
        AppSettings settings = new AppSettings(true);
        settings.setTitle("UNIVERSE");//Cambiamos el nombre de la ventana
        //Integramos una imagen personal a la pantalla de inicio
        settings.setSettingsDialogImage("Interface/vista.jpg");
        //Modificar la resolución
        settings.setResolution(1280, 960);
        
        Main app = new Main();
        app.setSettings(settings);//Aplicamos las especificaciones a la app
        
        app.start();
    }

    @Override
    public void simpleInitApp() {
        
        //Extender el flyCam
        flyCam.setMoveSpeed(10f);
        //Cambiar la ubicación y rotación de la cámara para dar perspectiva
        cam.setLocation(new Vector3f(0, 200 , 0));
        cam.setRotation(PITCH090);
       
        
        //Creación del SOL
        Sphere sol = new Sphere(90, 90, 8);
        Geometry geom = new Geometry("geom", sol);
        
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setTexture("ColorMap", assetManager.loadTexture("Textures/sol.jpg"));
        geom.setMaterial(mat);
        
        geom.rotate(30, 0, 0);
        
        //Creación MERCURIO
        Sphere mercurio = new Sphere(90, 90, 1);
        Geometry geom1 = new Geometry("geom1", mercurio);
        
        Material mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat1.setTexture("ColorMap", assetManager.loadTexture("Textures/mercurio.jpg"));
        geom1.setMaterial(mat1);
        
        geom1.rotate(30, 0, 0);
        
        //Creación del VENUS
        Sphere venus = new Sphere(90, 90, 2);
        Geometry geom2 = new Geometry("geom2", venus);
        
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setTexture("ColorMap", assetManager.loadTexture("Textures/venus.jpg"));
        geom2.setMaterial(mat2);
        
        geom2.rotate(30, 0, 0);
        
        //Creación de la TIERRA
        Sphere tierra = new Sphere(50, 50, 3);
        Geometry geom3 = new Geometry("geom3", tierra);
        
        Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat3.setTexture("ColorMap", assetManager.loadTexture("Textures/tierra.jpg"));
        geom3.setMaterial(mat3);
        geom3.rotate(30, 0, 0);
        
        //Creación de MARTE
        Sphere marte = new Sphere(50, 50, 4);
        Geometry geom4 = new Geometry("geom4", marte);
        
        Material mat4 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat4.setTexture("ColorMap", assetManager.loadTexture("Textures/marte.jpg"));
        geom4.setMaterial(mat4);
        geom4.rotate(30, 0, 0);
        
        //Creación de JÚPITER
        Sphere jupiter = new Sphere(50, 50, 5);
        Geometry geom5 = new Geometry("geom5", jupiter);
        
        Material mat5 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat5.setTexture("ColorMap", assetManager.loadTexture("Textures/jupiter.jpg"));
        geom5.setMaterial(mat5);
        geom5.rotate(30, 0, 0);
        
        //Creación de SATURNO
        Sphere saturno = new Sphere(50, 50, 6);
        Geometry geom6 = new Geometry("geom6", saturno);
        
        Material mat6 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat6.setTexture("ColorMap", assetManager.loadTexture("Textures/saturno.jpg"));
        geom6.setMaterial(mat6);
        geom6.rotate(30, 0, 0);
        
        //Creación de URANO
        Sphere urano = new Sphere(50, 50, 7);
        Geometry geom7 = new Geometry("geom7", urano);
        
        Material mat7 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat7.setTexture("ColorMap", assetManager.loadTexture("Textures/urano.jpg"));
        geom7.setMaterial(mat7);
        geom7.rotate(30, 0, 0);
        
        //Creación de NEPTUNO
        Sphere neptuno = new Sphere(50, 50, 8);
        Geometry geom8 = new Geometry("geom8", neptuno);
        
        Material mat8 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat8.setTexture("ColorMap", assetManager.loadTexture("Textures/neptuno.jpg"));
        geom8.setMaterial(mat8);
        geom8.rotate(30, 0, 0);
        

        //Creación de nodos 
        Node ejemploNodo = new Node("ejemplonodo");
        ejemploNodo.attachChild(geom);
        ejemploNodo.attachChild(geom1); //Para mostrarlos
        ejemploNodo.attachChild(geom2);
        ejemploNodo.attachChild(geom3);
        ejemploNodo.attachChild(geom4);
        ejemploNodo.attachChild(geom5);
        ejemploNodo.attachChild(geom6);
        ejemploNodo.attachChild(geom7);
        ejemploNodo.attachChild(geom8); 
        
        geom1.move(20,0,5);
        geom2.move(30,0,3);
        geom3.move(45,-10,20);
        geom4.move(70,-50,50);
        geom5.move(90,0,1);
        //geom6.move(110,0,11);
        //geom7.move(140,6,13);
        //geom8.move(170,0,15);
        //geom.move(1,0,1); //quitar el movimiento del sol 

        
        rootNode.attachChild(ejemploNodo);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //Cintrolar todas las interraciones en el juego.
        
        if(ob == null){
            System.out.println("No está asignado al objeto");
            ob = rootNode.getChild("ejemplonodo");
        }
        else {
             ob.rotate(0, tpf, 0);
        }
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
