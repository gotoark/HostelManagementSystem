package com.pavimalar.HostelManagementSystem.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.pavimalar.HostelManagementSystem.Database.Tables.AttendanceDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.ElectricityBillDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.Room;
import com.pavimalar.HostelManagementSystem.Database.Tables.StationaryBillDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.Student;

import java.util.List;

@Dao
public interface  StudentDao {
    @Query("SELECT * FROM Student")
    List<Student> getAllStudents();

    @Insert
    void insertStudent(Student student);

    @Delete
    void deleteStudent(Student student);

    @Update
    void updateStudent(Student student);


    //Room Related Activities
    @Query("SELECT * FROM Room")
    List<Room> getAllRooms();

    @Insert
    void insertRoom(Room room);

    @Delete
    void deleteRoom(Room room);

    @Update
    void updateRoom(Room room);

    //Attendance Related Activities
    @Query("SELECT * FROM AttendanceDetails")
    List<AttendanceDetails> getAllAttendanceDetails();

    @Insert
    void insertAttendance(AttendanceDetails attendanceDetails);

    @Delete
    void deleteAttendance(AttendanceDetails attendanceDetails);

    @Update
    void updateAttendance(AttendanceDetails attendanceDetails);

    //ElectricityBillDetails Related Activities
    @Query("SELECT * FROM ElectricityBillDetails")
    List<ElectricityBillDetails> getAllElectricityBillDetails();

    @Insert
    void insertElectricityBillDetails(ElectricityBillDetails electricityBillDetails);

    @Delete
    void deleteElectricityBillDetails(ElectricityBillDetails electricityBillDetails);

    @Update
    void updateElectricityBillDetails(ElectricityBillDetails electricityBillDetails);


    //StationaryBillDetails Related Activities
    @Query("SELECT * FROM StationaryBillDetails")
    List<StationaryBillDetails> getAllStationaryBillDetails();

    @Insert
    void insertStationaryBillDetails(StationaryBillDetails stationaryBillDetails);

    @Delete
    void deleteStationaryBillDetails(StationaryBillDetails stationaryBillDetails);

    @Update
    void updateStationaryBillDetails(StationaryBillDetails stationaryBillDetails);
}
