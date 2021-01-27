package com.yoong.maven.core.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Department {
    private int id;
    private String deptName;
    private String note;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dept_name", nullable = true, length = 30)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 40)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deptName, note);
    }
}
