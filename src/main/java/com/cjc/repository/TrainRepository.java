package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.TrainInfo;

@Repository
public interface TrainRepository extends JpaRepository<TrainInfo, Integer> {

}
