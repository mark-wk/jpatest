package com.artivr.repository.base;

import com.artivr.entity.base.TbSysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TbSysUserEntity,Integer> {

    /**
     * spring data jpa 会自动注入实现（根据方法命名规范）
     * @return
     */
    TbSysUserEntity findById(long id);

//    @Modifying
//    @Query("delete from tb_sys_user u where u.id = :id")
//    void deleteUser(@Param("id")int id);

}
