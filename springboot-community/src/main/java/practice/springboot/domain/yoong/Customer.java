package practice.springboot.domain.yoong;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
public class Customer {
    private Long id;
    private String customerId;
    private String customerName;
    private String password;
    private String mobile;
    private String email;
    private Date createTime;
    private Date modifyTime;
    private String note1;
    private String note2;
    private Integer isDelete;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer_id", nullable = false, length = 50)
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name", nullable = false, length = 50)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modify_time", nullable = false)
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "note1", nullable = true, length = 200)
    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    @Basic
    @Column(name = "note2", nullable = true, length = 200)
    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                isDelete == customer.isDelete &&
                Objects.equals(customerId, customer.customerId) &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(mobile, customer.mobile) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(createTime, customer.createTime) &&
                Objects.equals(modifyTime, customer.modifyTime) &&
                Objects.equals(note1, customer.note1) &&
                Objects.equals(note2, customer.note2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, customerId, customerName, password, mobile, email, createTime, modifyTime, note1, note2, isDelete);
    }
}
