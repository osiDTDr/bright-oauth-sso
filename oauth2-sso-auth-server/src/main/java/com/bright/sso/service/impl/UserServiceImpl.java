package com.bright.sso.service.impl;

import com.bright.sso.repository.SysUserRepository;
import com.bright.sso.entity.SysUser;
import com.bright.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengyuan
 * @since 2021/02/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
