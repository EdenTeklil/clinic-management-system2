
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
        String sql="DELETE FROM DOCTOR WHERE id=?";
        String sql2="DELETE FROM LOGIN WHERE id=?";
        PreparedStatement st=DbConnection.conMethod().prepareStatement(sql);
        st.setString(1, id);
        PreparedStatement st2=DbConnection.conMethod().prepareStatement(sql2);
        st2.setString(1, id);
        
        st.executeUpdate();
        st2.executeUpdate();
        
        Statement st1=DbConnection.conMethod().createStatement();
       // st=DbConnection.conMethod().createpreparedStatement();
       st.setString(1, id);
       
       
  
       }
}