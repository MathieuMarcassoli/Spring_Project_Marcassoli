package org.example.spring_app.dao;

import org.example.spring_app.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomDao extends JpaRepository<Room, Long> {

    @Query("select r from Room where r.id=:l")
    Room getReferenceById(@Param("l") Long l);
}
