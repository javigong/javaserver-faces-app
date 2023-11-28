
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
@ManagedBean(name="obj",eager=true)
@RequestScoped
public class getData {
    private String ename;
    private String address;
    private int age;
    /**
     * Creates a new instance of getData
     */
    public getData() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
