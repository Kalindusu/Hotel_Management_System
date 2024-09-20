package com.ceylontours.CeylonToursHotel.repo;

import com.ceylontours.CeylonToursHotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {
    List<String> findDistinctRoomTypes();
}
