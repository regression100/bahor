package bahor.test.repo;

import bahor.test.model.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BLRepo extends JpaRepository<BlackList, Long> {
}
