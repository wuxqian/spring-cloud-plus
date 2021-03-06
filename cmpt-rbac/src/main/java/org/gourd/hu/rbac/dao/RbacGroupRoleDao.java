package org.gourd.hu.rbac.dao;

import org.gourd.hu.rbac.entity.RbacGroupRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户组角色关系表 Mapper 接口
 * </p>
 *
 * @author gourd.hu
 * @since 2020-04-14
 */
@Repository
public interface RbacGroupRoleDao extends BaseMapper<RbacGroupRole> {

}
