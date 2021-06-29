package top.hihanying.hyblog.base.vo;

import top.hihanying.hyblog.base.validator.annotion.IdValid;
import top.hihanying.hyblog.base.validator.group.Delete;
import top.hihanying.hyblog.base.validator.group.Update;
import lombok.Data;

/**
 * BaseVO   view object 表现层 基类对象
 *
 * @author: 应寒
 * @create: 2019-12-03-22:38
 */
@Data
public class BaseVO<T> extends PageInfo<T> {

    /**
     * 唯一UID
     */
    @IdValid(groups = {Update.class, Delete.class})
    private String uid;

    private Integer status;
}
