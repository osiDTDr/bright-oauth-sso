package com.bright.sso.service;

import com.bright.sso.entity.SysUser;

/**
 * @author zhengyuan
 * @since 2021/02/25
 */
public interface UserService {

    SysUser getByUsername(String username);
}
