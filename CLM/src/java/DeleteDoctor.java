
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
@ManagedBean
public class DeleteDoctor {
     private String id; 
    public DeleteDoctor(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     public void method() throws SQLException, ClassNotFoundException{
        String sql="DELETE FROM DOCTOR WHERE id='"+id+"'";
        String sql2="DELETE FROM LOGIN WHERE id='"+id+"'";

        Statement st;
        st=DbConnection.conMethod().createStatement();
        st.executeQuery(sql);
        st.executeQuery(sql2);

}
}