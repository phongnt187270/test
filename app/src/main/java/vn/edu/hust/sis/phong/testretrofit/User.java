package vn.edu.hust.sis.phong.testretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {
    @SerializedName("id_user")
    @Expose
    private Integer idUser;
    @SerializedName("phonenumber")
    @Expose
    private String phonenumber;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("division")
    @Expose
    private String division;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("id_vaccination")
    @Expose
    private String idVaccination;
    @SerializedName("created_at")
    @Expose
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;

    public User(Integer idUser, String phonenumber, String password, String name, String dob, String division, String role, String idVaccination, Object createdAt, Object updatedAt) {
        this.idUser = idUser;
        this.phonenumber = phonenumber;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.division = division;
        this.role = role;
        this.idVaccination = idVaccination;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIdVaccination() {
        return idVaccination;
    }

    public void setIdVaccination(String idVaccination) {
        this.idVaccination = idVaccination;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

}
