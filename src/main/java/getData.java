
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

//import javax.inject.Named;
//import javax.enterprise.context.Dependent;

/**
 *
 * @author javier
 */
//@Named(value = "getData")
//@Dependent
@ManagedBean
@SessionScoped
public class getData {
    private Random rand;
    private int upperbound;
    private String ename;
    private String address;
    private int seniority;
    private String department;
    private int numA;
    private int numB;
    private int numC;
    
    public getData() {
        rand = new Random();
        upperbound = 50;
        numC = rand.nextInt(upperbound);
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    /**
     * Creates a new instance of getData
     */
    
    public String checkAnswer () {
        if (numA + numB == numC) {
             return "Passed";
        } else {
            return "Failed, please try again";
        }
    }
    
}
