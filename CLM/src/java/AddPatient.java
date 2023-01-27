
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
public class AddPatient {
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
    private String concernDoctor;
    private String  disease;      
    public AddPatient(){
        
        
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

    public String getConcernDoctor() {
        return concernDoctor;
    }

    public void setConcernDoctor(String concernDoctor) {
        this.concernDoctor = concernDoctor;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    

   

     public void method() throws SQLException, ClassNotFoundException{
        String sql="Insert into PATIENT(ID,ROOMNO,DEPARTMENT,FIRSTNAME,LASTNAME,DATEOFBIRTH,AGE,GENDER,CONTACT_NO,ADDRESS,BLOODGROUP,CONCERNDOCTOR,DISEASE) values ('"+id+"','"+roomNo+"','"+department+"','"+firstName+"','"+lastName+"','"+dateofBirth+"','"+age+"','"+gender+"','"+contactNo+"','"+address+"','"+bloodGroup+"','"+concernDoctor+"','"+disease+"')";
        Statement st;
        st=DbConnection.conMethod().createStatement();
        st.executeQuery(sql);
        
    }
    
    
}
