package top.hihanying.hyblog.xo.mapper;

import top.hihanying.hyblog.commons.entity.Admin;
import top.hihanying.hyblog.base.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表 Mapper 接口
 *
 * @author 应寒
 * @since 2018-09-04
 */
public interface AdminMapper extends SuperMapper<Admin> {

    /**
     * 通过uid获取管理员
     *
     * @return
     */
    public Admin getAdminByUid(@Param("uid") String uid);
}
