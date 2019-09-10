package com.main.repository;

import com.main.model.CompanyModel;
import com.main.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long>{
}
