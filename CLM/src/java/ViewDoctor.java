/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class ViewDoctor {
       private  String id;    
private  String roomNo;    
private  String department;    
private  String firstName;    
private  String lastName; 
private  String dateofBirth;    
private  String age;    
private  String gender;    
private String contactNo;    
private String address; 
private  String bloodGroup;    
private  String email;    
private  String password; 
public ViewDoctor(String id, String roomNo,String department,String firstName,String lastName,String dateofBirth,String age,String gender,String contactNo,String address,String bloodGroup,String email) {    
this.id = id;    
this.roomNo =roomNo ;    
this.department = department;
this.firstName=firstName;
this.lastName=lastName;
this.dateofBirth=dateofBirth;
this.age=age;
this.gender=gender;
this.contactNo=contactNo;
this.address=address;
this.bloodGroup=bloodGroup;
this.email=email;

}  

    public String getId() {
        return id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    

}
