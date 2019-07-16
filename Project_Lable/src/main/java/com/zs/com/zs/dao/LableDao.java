package com.zs.com.zs.dao;

import com.zs.entity.Lable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface LableDao extends JpaRepository<Lable,String>,JpaSpecificationExecutor<Lable> {

    @Query(nativeQuery = true, value = "select * from tf_Lable where id = ?")
    public Lable findByLableId(String id);
}
