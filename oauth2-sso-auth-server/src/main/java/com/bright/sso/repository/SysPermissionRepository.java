package com.bright.sso.repository;

import com.bright.sso.entity.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author zhengyuan
 * @since 2021/02/25
 */
public interface SysPermissionRepository extends JpaSpecificationExecutor<SysPermission>, JpaRepository<SysPermission, Integer> {

    @Query(value = "SELECT * FROM sys_permission WHERE id IN (:ids)", nativeQuery = true)
    List<SysPermission> findByIds(@Param("ids") List<Integer> ids);

}
