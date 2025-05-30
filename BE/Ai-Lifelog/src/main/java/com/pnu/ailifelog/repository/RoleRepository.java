package com.pnu.ailifelog.repository;

import com.pnu.ailifelog.entity.Role;
import com.pnu.ailifelog.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
} 