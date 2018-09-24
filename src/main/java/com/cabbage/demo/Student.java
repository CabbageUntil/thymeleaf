package com.cabbage.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private Integer studetId;

    private String name;

    private String idCard;

    private Integer gredeId;

    private String address;

    private String phone;

    private Integer classId;

    private Integer scourceId;

    public Student(){}


}
