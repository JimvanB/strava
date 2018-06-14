
package jim.strava.repository;

import jim.strava.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by jim on 4-4-18.
 */

@Repository
public interface UserRepository extends CrudRepository<AppUser, Long> {



}

