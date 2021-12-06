package nu.swe.hotel_chain.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer emp_id;

    @Column(name = "name")
    private String e_name;

    @Column(name = "sname")
    private String e_sname;

    @Column(name = "mobile_n")
    private String mobile;

    @Column(name = "salary")
    private float salary;
    public static enum Role {Manager, Clerk, Staff};

    @Column(name = "emp_email")
    private String e_email;

    @Column(name = "m_w_hours")
    private int e_hours;

    @Column(name = "hotel_id")
    private String hotel_id;

    public Employee() {
    }

    public Employee(Integer emp_id, String e_name, String e_sname, String mobile, float salary, String e_email, int e_hours, String hotel_id) {
        this.emp_id = emp_id;
        this.e_name = e_name;
        this.e_sname = e_sname;
        this.mobile = mobile;
        this.salary = salary;
        this.e_email = e_email;
        this.e_hours = e_hours;
        this.hotel_id = hotel_id;
    }

    public Employee(String e_name, String e_sname, String mobile, float salary, String e_email, int e_hours, String hotel_id) {
        this.e_name = e_name;
        this.e_sname = e_sname;
        this.mobile = mobile;
        this.salary = salary;
        this.e_email = e_email;
        this.e_hours = e_hours;
        this.hotel_id = hotel_id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_sname() {
        return e_sname;
    }

    public void setE_sname(String e_sname) {
        this.e_sname = e_sname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getE_email() {return e_email; }

    public void setE_email(String e_email) {
        this.e_email = e_email;
    }

    public Integer getE_hours() {
        return e_hours;
    }

    public void setE_hours(Integer e_hours) {
        this.e_hours = e_hours;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", e_name='" + e_name + '\'' +
                ", e_sname='" + e_sname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salary=" + salary +
                ", e_email='" + e_email + '\'' +
                ", e_hours=" + e_hours +
                ", hotel_id=" + hotel_id +
                '}';
    }
}
