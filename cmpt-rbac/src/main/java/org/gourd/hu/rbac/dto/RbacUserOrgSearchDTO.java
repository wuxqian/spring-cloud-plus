package org.gourd.hu.rbac.dto;

import lombok.Data;
import org.gourd.hu.base.common.dto.BaseFindDTO;

/**
 * @author gourd
 * @date 2019-04-02 17:26:16
 */
@Data
public class RbacUserOrgSearchDTO extends BaseFindDTO {

    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 组织名
     */
    private Long orgName;

    /**
     * 组织code
     */
    private Long orgCode;

}