package clase05;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    PersonaR pr;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private ComboBox<Genero> cmbGenero;
    @FXML
    private ComboBox<Estado> cmbEstado;
    @FXML
    private TableView<Persona> tblPersona;
 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Carga cmbEstado
        Arrays
                .asList(Estado.values())
                .forEach(cmbEstado.getItems()::add);
        //for(Estado e:Estado.values()) 
        //    cmbEstado.getItems().add(e);
        cmbEstado.getSelectionModel().selectFirst();
        
        //Carga cmbGenero
        for(Genero g:Genero.values())
            cmbGenero.getItems().add(g);
        cmbGenero.getSelectionModel().selectFirst();
        
        //Inicializa el Repositorio
        pr=new PersonaR();
        
        cargar();
    }    

    @FXML
    private void agregar(ActionEvent event) {
        Persona p=new Persona(
                txtNombre.getText(), 
                txtApellido.getText(), 
                cmbGenero.getValue(), 
                cmbEstado.getValue()
        );
        pr.save(p);
        txtNombre.setText("");
        txtApellido.setText("");
        cmbGenero.getSelectionModel().selectFirst();
        cmbEstado.getSelectionModel().selectFirst();
        cargar();        
        
    }
    
    private void cargar(){
        FXTable<Persona> table=new FXTable();
        table.cargar(tblPersona, pr.getAll());
    }
    
}
