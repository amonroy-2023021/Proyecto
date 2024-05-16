/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AlexisMonroy.System;

import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.AlexisMonroy.Controller.MenuClientesController;
import org.AlexisMonroy.Controller.MenuPrincipalController;

/**
 *
 * @author informatica
 */
public class Main extends Application{
    private Stage escenarioPrincipal;
    private Scene escena;
    private final String URLVIEW = "/org/AlexisMonroy/View/";
        /*
        FXMLLoades, Parent
        */
        @Override
        
        public void start(Stage escenarioPrincipal) throws IOException {
            this.escenarioPrincipal = escenarioPrincipal;
            this.escenarioPrincipal.setTitle("MiNiMarket");
            menuPrincipalView();
            escenarioPrincipal.show();
            
        }
        public Initializable cambiarEscena(String fxmlName, int width, int heigth)throws Exception{
        Initializable resultado = null;
        FXMLLoader loader = new FXMLLoader();
        InputStream file = Main.class.getResourceAsStream(URLVIEW + fxmlName);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(URLVIEW + fxmlName));
        escena = new Scene((AnchorPane)loader.load(file), width , heigth);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)loader.getController();
        return resultado;
    }
        
    public void menuPrincipalView(){
        try{
            MenuPrincipalController menuPrincipalView = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml", 612,400);
            menuPrincipalView.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void menuClientesView(){
        try{
            MenuClientesController menuClientesView = (MenuClientesController)cambiarEscena("MenuClientesView.fxml", 858,483);
            menuClientesView.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

        public static void main(String args[]){
            launch(args);
        }
        
        public void Programador(){
            try{
          MenuClientesController menuClientesView = (MenuClientesController)cambiarEscena("Programador.fxml",904,510);
            menuClientesView.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
        
        }
