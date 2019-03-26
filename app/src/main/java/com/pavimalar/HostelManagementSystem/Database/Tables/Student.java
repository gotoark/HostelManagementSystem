package com.pavimalar.HostelManagementSystem.Database.Tables;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity(foreignKeys = @ForeignKey(entity = Room.class,
        parentColumns = "room_number",
        childColumns = "room_number"))
public class Student implements Serializable {

    /*@PrimaryKey(autoGenerate = true)
    private int id;*/

    @PrimaryKey
    @ColumnInfo(name = "reg_number")
    private int regNumber;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "age")
    private int age;

    @ColumnInfo(name = "department")
    private String department;

    @ColumnInfo(name = "year")
    private int year;

    @ColumnInfo(name = "room_number")
    private int roomNumber;

    @ColumnInfo(name = "mess_fees")
    private int messFees;

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getMessFees() {
        return messFees;
    }

    public void setMessFees(int messFees) {
        this.messFees = messFees;
    }
}
