

package com.yitusite.buflo.admin.service;


import com.baomidou.mybatisplus.service.IService;
import com.yitusite.buflo.admin.model.entity.SysRoleMenu;

/**
 * <p>
 * 角色菜单表 服务类
 * </p>
 *
 * @author buflo
 * @since 2017-10-29
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 更新角色菜单
     *
     *
     * @param role
     * @param roleId  角色
     * @param menuIds 菜单列表
     * @return
     */
    Boolean insertRoleMenus(String role, Integer roleId, String menuIds);
}
