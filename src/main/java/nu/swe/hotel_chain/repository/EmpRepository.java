package nu.swe.hotel_chain.repository;

import nu.swe.hotel_chain.models.Employee;
import nu.swe.hotel_chain.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select E from Employee as E where E.e_email = ?1")
    public List<Employee> findEmployeeByE_email(String email);

    @Query(value = "select E from  Employee as E where exists (select U from Users as U where U.email = E.e_email and U.role = ?1)")
    public List<Employee> findEmployeeByRole(String role);
}
