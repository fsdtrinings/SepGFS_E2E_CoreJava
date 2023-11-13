package com.cg.hrapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hrapp.entity.Insurance;

@Repository
public interface IInsuranceRepository extends JpaRepository<Insurance, Integer> {

}
