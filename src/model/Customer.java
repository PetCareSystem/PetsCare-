/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ThienThu
 */
public class Customer extends User{

    public Customer() {
    }

    public Customer(String firstName, String lastName, int id, String userName, String password, int phone, String gender) {
        super(firstName, lastName, id, userName, password, phone, gender);
    }
    
    
}
