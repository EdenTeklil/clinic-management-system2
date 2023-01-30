
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
public class AddDoctor {
        private String id;
    private String roomNo;
    private String department;
    private String firstName;
    private String lastName;
    private String dateofBirth;
    private String age;
    private String gender;
    private String contactNo;
    private String address;
    private String bloodGroup;
    private String email;
    private String password;
    public AddDoctor(){
    }  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
      public void method() throws SQLException, ClassNotFoundException{
        String sql="Insert into DOCTOR(ID,ROOMNO,DEPARTMENT,FIRSTNAME,LASTNAME,DATEOFBIRTH,AGE,GENDER,CONTACT_NO,ADDRESS,BLOODGROUP,EMAIL) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        String sql2="Insert into LOGIN(ID,PASSWORD,ROLE) values ('"+id+"','"+password+"','Doctor')";
        PreparedStatement st=DbConnection.conMethod().prepareStatement(sql);
        Statement st1=DbConnection.conMethod().createStatement();
       // st=DbConnection.conMethod().createpreparedStatement();
       st.setString(1, id);
       st.setString(2, roomNo);
       st.setString(3,department);
       st.setString(4, firstName);
       st.setString(5, lastName);
       st.setString(6, dateofBirth);
       st.setString(7, age);
       st.setString(8, gender);
       st.setString(9, contactNo);
       st.setString(10, address);
       st.setString(11, bloodGroup);
       st.setString(12, email);
       
        st.executeUpdate();
        st1.executeQuery(sql2);
        
    }

    
}
