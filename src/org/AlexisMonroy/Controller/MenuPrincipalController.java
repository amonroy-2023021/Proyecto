/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AlexisMonroy.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import org.AlexisMonroy.System.Main;
 
/*
Herencia multiple concepto, Interfaces. POO
*/
public class MenuPrincipalController implements Initializable  {
    private Main escenarioPrincipal;
    @FXML MenuItem btnMenuClientes;
    @FXML MenuItem btnProgramador;
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    public Main getEscenarioPrincipal() {
        return escenarioPrincipal;
    }
 
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
   
    @FXML
    public void buttonHandleEvent (ActionEvent event){
         if (event.getSource() == btnMenuClientes){
        escenarioPrincipal.menuClientesView();
        }
         
    }
    
    @FXML
    public void Programador (ActionEvent event)throws IOException{
         if (event.getSource() == btnProgramador){
        escenarioPrincipal.Programador();
        }
}
}

