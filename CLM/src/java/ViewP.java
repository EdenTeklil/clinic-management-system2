
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
public class ViewP {
    
    
    public List<ViewPatient> viewList;  
public List<ViewPatient> getViewList() throws SQLException, ClassNotFoundException {    
viewList = new ArrayList<>();   
 
    String sql="SELECT * FROM PATIENT";
        Statement s5;
        
    
        s5 = DbConnection.conMethod().createStatement();
        ResultSet re = s5.executeQuery(sql);
        while (re.next()) {
                         String ID = re.getString("ID");
                        String ROOMNO= re.getString("ROOMNO");
                        String DEPARTMENT = re.getString("DEPARTMENT");
                        String FIRSTNAME = re.getString("FIRSTNAME");
                        String LASTNAME = re.getString("LASTNAME");
                        String DATEOFBIRTH = re.getString("DATEOFBIRTH");
                         String AGE= re.getString("AGE");
                        String GENDER = re.getString("GENDER");
                        String CONTACT_NO = re.getString("CONTACT_NO");
                        String ADDRESS = re.getString("ADDRESS");
                        String BLOODGROUP = re.getString("BLOODGROUP");
                        String CONCERNDOCTOR = re.getString("CONCERNDOCTOR");
                        String DISEASE = re.getString("DISEASE");
                   viewList.add(new ViewPatient(ID,ROOMNO,DEPARTMENT,FIRSTNAME,LASTNAME ,DATEOFBIRTH ,AGE,GENDER,CONTACT_NO,ADDRESS,BLOODGROUP,CONCERNDOCTOR, DISEASE));

        }
                        
                        
                    
         
      
return viewList;  
}    
    
}
