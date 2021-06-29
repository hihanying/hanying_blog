package top.hihanying.hyblog.xo.vo;

import top.hihanying.hyblog.base.validator.annotion.NotBlank;
import top.hihanying.hyblog.base.validator.group.Insert;
import top.hihanying.hyblog.base.validator.group.Update;
import top.hihanying.hyblog.base.vo.BaseVO;
import lombok.Data;

/**
 * <p>
 * RoleVO
 * </p>
 *
 * @author 应寒
 * @since 2019年12月20日16:47:02
 */
@Data
public class RoleVO extends BaseVO<RoleVO> {


    /**
     * 角色名称
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String roleName;

    /**
     * 介绍
     */
    private String summary;

    /**
     * 该角色所能管辖的区域
     */
    private String categoryMenuUids;

}
