
import java.sql.PreparedStatement;
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
public class DeletePatient {
     private String id; 
    public DeletePatient(){
         
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
      public void method() throws SQLException, ClassNotFoundException{
        String sql="DELETE FROM PATIENT WHERE id=?";
       
        PreparedStatement st=DbConnection.conMethod().prepareStatement(sql);
        st.setString(1, id);
       
        
        st.executeUpdate();
       
       
       
        
    }
    
    
}
