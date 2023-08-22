package com.suneth.springbootdocker.repo;

import com.suneth.springbootdocker.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {
}
