package com.NaturalStore.RESTApi.repository;

import com.NaturalStore.RESTApi.model.SignUpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SignUpRepository extends JpaRepository<SignUpModel , String>{
}
