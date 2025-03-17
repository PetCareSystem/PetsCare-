/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ThienThu
 */
public abstract class User {

    private String firstName;
    private String lastName;
    private int id;
    private String userName;
    private String password;
    private int phone;
    private String gender;

    public User() {
    }

    public User(String firstName, String lastName, int id, String userName, String password, int phone, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "User {\n"
                + "  %-10s: %s\n"
                + "  %-10s: %s\n"
                + "  %-10s: %d\n"
                + "  %-10s: %s\n"
                + "  %-10s: %s\n"
                + "  %-10s: %s\n"
                + "  %-10s: %s\n"
                + "}",
                "firstName", firstName,
                "lastName", lastName,
                "id", id,
                "userName", userName,
                "password", password,
                "phone", phone,
                "gender", gender
        );
    }

}
