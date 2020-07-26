package tn.zelda.projects.microservice.ordermicroservice.security.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.zelda.projects.microservice.ordermicroservice.security.model.Role;
import tn.zelda.projects.microservice.ordermicroservice.security.model.RoleName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
