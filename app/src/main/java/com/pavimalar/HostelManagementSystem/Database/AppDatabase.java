package com.pavimalar.HostelManagementSystem.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.pavimalar.HostelManagementSystem.Database.Tables.AttendanceDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.ElectricityBillDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.Room;
import com.pavimalar.HostelManagementSystem.Database.Tables.StationaryBillDetails;
import com.pavimalar.HostelManagementSystem.Database.Tables.Student;

@Database(entities = {Student.class, Room.class, AttendanceDetails.class, ElectricityBillDetails.class, StationaryBillDetails.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract StudentDao studentDao();
}
