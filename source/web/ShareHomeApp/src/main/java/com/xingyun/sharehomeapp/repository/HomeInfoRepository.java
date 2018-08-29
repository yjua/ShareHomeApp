package com.xingyun.sharehomeapp.repository;

import com.xingyun.sharehomeapp.model.db.HomeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeInfoRepository extends JpaRepository<HomeInfo,Long>{
}
