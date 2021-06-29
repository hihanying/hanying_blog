package top.hihanying.hyblog.xo.vo;

import top.hihanying.hyblog.base.validator.annotion.BooleanNotNULL;
import top.hihanying.hyblog.base.validator.annotion.NotBlank;
import top.hihanying.hyblog.base.validator.group.GetOne;
import top.hihanying.hyblog.base.validator.group.Insert;
import top.hihanying.hyblog.base.validator.group.Update;
import top.hihanying.hyblog.base.vo.BaseVO;
import lombok.Data;

/**
 * TodoVO
 *
 * @author: 应寒
 * @create: 2019年12月18日22:16:23
 */
@Data
public class TodoVO extends BaseVO<TodoVO> {

    /**
     * 内容
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String text;
    /**
     * 表示事项是否完成
     */
    @BooleanNotNULL(groups = {Update.class, GetOne.class})
    private Boolean done;


    /**
     * 无参构造方法，初始化默认值
     */
    TodoVO() {

    }

}
