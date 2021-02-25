package com.bright.sso.vo;

import com.bright.sso.entity.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author zhengyuan
 * @since 2021/02/25
 */
@Data
public class SysUserVO extends SysUser {

    /**
     * 权限列表
     */
    private List<String> authorityList;

}
