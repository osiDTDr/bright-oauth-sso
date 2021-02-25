package com.bright.sso.service;

import com.bright.sso.entity.SysPermission;

import java.util.List;

/**
 * @author zhengyuan
 * @since 2021/02/25
 */
public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);

}
