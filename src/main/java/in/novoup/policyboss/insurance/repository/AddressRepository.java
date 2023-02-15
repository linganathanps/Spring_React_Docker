package in.novoup.policyboss.insurance.repository;

import in.novoup.policyboss.insurance.data.Address;
import in.novoup.policyboss.insurance.data.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByState(State state);
}
