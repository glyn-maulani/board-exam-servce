package com.business_prodject.Business.Project.repositories;

import com.business_prodject.Business.Project.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<user, Long> {


}
