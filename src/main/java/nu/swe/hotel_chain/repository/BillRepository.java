package nu.swe.hotel_chain.repository;

import nu.swe.hotel_chain.models.Bill;
import nu.swe.hotel_chain.models.BillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, BillId> {
}
