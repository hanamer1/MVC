import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Model extends DefaultTableModel {

    public Model() {
        super(Students.DATA, Students.TABLE_HEADER);
    }

}
