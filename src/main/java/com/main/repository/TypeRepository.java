package com.main.repository;

import com.main.model.TypeModel;
import com.main.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeModel, Long>{
}
