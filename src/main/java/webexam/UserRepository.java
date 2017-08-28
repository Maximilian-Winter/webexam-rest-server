package webexam;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> 
{
	List<User> findByUsername(@Param("username") String username);
	List<User> findByEmail(@Param("email") String email);
	List<User> findByTitle(@Param("title")String title);
	List<User> findByFirstname(@Param("firstname")String firstname);
	List<User> findByLastname(@Param("lastname")String lastname);
	List<User> findByBirthdate(@Param("birthdate")String birthdate);
}