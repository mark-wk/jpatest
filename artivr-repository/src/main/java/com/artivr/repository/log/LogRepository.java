package com.artivr.repository.log;

import com.artivr.entity.log.TbSysLogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<TbSysLogsEntity, Integer> {

    TbSysLogsEntity findById(long id);

//    @Modifying
//    @Query("delete from tb_sys_logs o where o.id = :id")
//    void deleteLog(@Param("id") int id);

}
