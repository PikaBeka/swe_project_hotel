package nu.swe.hotel_chain.repository;

import nu.swe.hotel_chain.models.Room;
import nu.swe.hotel_chain.models.RoomId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, RoomId> {
}
