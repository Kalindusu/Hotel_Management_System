package com.ceylontours.CeylonToursHotel.repo;

import com.ceylontours.CeylonToursHotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {
    @Query("SELECT DISTINCT r.roomType rom Room r")
    List<String> findDistinctRoomTypes();


    @Query("SELECT r FROM r WHERE r.id NOT IN(SELECT b.room.id FROM Booking b")
    List<Room>getAllAvailableRooms();

}
