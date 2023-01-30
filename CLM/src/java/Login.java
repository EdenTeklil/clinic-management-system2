
import java.sql.ResultSet;
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
public class Login {
    private String id;
    private String password;
    public Login(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  public String method() throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM LOGIN WHERE ID='"+id+"' AND PASSWORD='"+password+"'";
        Statement st;
        st=DbConnection.conMethod().createStatement();
        ResultSet r1=st.executeQuery(sql);
        if(r1.next()){
            String role=r1.getString("ROLE");
            if("Doctor".equals(role)){
                return "SearchPage.xhtml";
            }
            else if("ADMIN".equals (role)) {
                return "AdminPage.xhtml";
            }
            

        }
       return "index.xhtml";
    }    
    
}




























