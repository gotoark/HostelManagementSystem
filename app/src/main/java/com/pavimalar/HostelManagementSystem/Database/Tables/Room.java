package com.pavimalar.HostelManagementSystem.Database.Tables;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Room implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="room_number")
    private int roomNumber;

    @ColumnInfo(name = "room_capacity")
    private int roomCapacity;

    @ColumnInfo(name = "room_type")
    private String roomType;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
