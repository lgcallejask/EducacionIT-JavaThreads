package clase05;
import java.lang.reflect.Field;
import java.util.List;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
public class FXTable <E> {
    public void cargar(TableView tbl,List<E> list){
        if(tbl==null) return;
        tbl.getItems().clear();
        tbl.getColumns().clear();
        if(list==null || list.isEmpty()) return;
        E e=list.get(0);
        for(Field f:e.getClass().getDeclaredFields()){
            TableColumn t=new TableColumn(f.getName());
            t.setCellValueFactory(new PropertyValueFactory(f.getName()));
            tbl.getColumns().add(t);
        }
        tbl.getItems().addAll(list);
    }
}
