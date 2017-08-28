package webexam;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface UserRoleRepository
{
	List<User> findByRolename(@Param("rolename") String rolename);
}
