package jim.strava.repository;

import jim.strava.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jim on 4-4-18.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
