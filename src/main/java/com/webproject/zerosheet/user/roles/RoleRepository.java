package com.webproject.zerosheet.user.roles;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
