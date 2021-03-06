package com.qburst.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="student")
public class Student {
       @Id
       @GeneratedValue
       @Column(name="studentid")
       int studentid;
 
       @Column(name="name",nullable=false,length=50)
       String name;
 
       @Column(name="address",nullable=false,length=100)
       String address;
 
       @Column(name="grade",nullable=false,length=50)
       String grade;
 
       public int getStudentid() {
              return studentid;
       }
 
       public void setStudentid(int studentid) {
              this.studentid = studentid;
       }
 
       public String getName() {
              return name;
       }
 
       public void setName(String name) {
              this.name = name;
       }
 
       public String getAddress() {
              return address;
       }
 
       public void setAddress(String address) {
              this.address = address;
       }
 
       public String getGrade() {
              return grade;
       }
 
       public void setGrade(String grade) {
              this.grade = grade;
       }
}