package com.hiltonfarias.meetingroom.meetingroom.repository;

import com.hiltonfarias.meetingroom.meetingroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
