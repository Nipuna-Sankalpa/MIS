/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.student;

import util.Gender;

/**
 *
 * @author Mampitiya
 */
public class Student {

    private String studentID;
    private String firstName;
    private String lastName;
    private String address;
    private String telephone;
    private String guardianName;
    private String guardianTelephone;
    private Gender gender;

    public Student(String studentID, String first_name, String last_name, String address, String telephone, String guardian_name, String guardian_number, Gender gender) {
        this.studentID = studentID;
        this.firstName = first_name;
        this.lastName = last_name;
        this.address = address;
        this.telephone = telephone;
        this.guardianName = guardian_name;
        this.guardianTelephone = guardian_number;
        this.gender = gender;
    }

    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param gender new value of gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Get the value of guardian_number
     *
     * @return the value of guardian_number
     */
    public String getGuardian_number() {
        return guardianTelephone;
    }

    /**
     * Set the value of guardian_number
     *
     * @param guardian_number new value of guardian_number
     */
    public void setGuardian_number(String guardian_number) {
        this.guardianTelephone = guardian_number;
    }

    /**
     * Get the value of guardian_name
     *
     * @return the value of guardian_name
     */
    public String getGuardian_name() {
        return guardianName;
    }

    /**
     * Set the value of guardian_name
     *
     * @param guardian_name new value of guardian_name
     */
    public void setGuardian_name(String guardian_name) {
        this.guardianName = guardian_name;
    }

    /**
     * Get the value of telephone
     *
     * @return the value of telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Set the value of telephone
     *
     * @param telephone new value of telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Get the value of address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the value of address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the value of last_name
     *
     * @return the value of last_name
     */
    public String getLast_name() {
        return lastName;
    }

    /**
     * Set the value of last_name
     *
     * @param last_name new value of last_name
     */
    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    /**
     * Get the value of first_name
     *
     * @return the value of first_name
     */
    public String getFirst_name() {
        return firstName;
    }

    /**
     * Set the value of first_name
     *
     * @param first_name new value of first_name
     */
    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    /**
     * Get the value of studentID
     *
     * @return the value of studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Set the value of studentID
     *
     * @param studentID new value of studentID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

}
