package top.hihanying.hyblog.xo.vo;

import top.hihanying.hyblog.base.validator.annotion.IntegerNotNull;
import top.hihanying.hyblog.base.validator.annotion.NotBlank;
import top.hihanying.hyblog.base.validator.group.Insert;
import top.hihanying.hyblog.base.validator.group.Update;
import top.hihanying.hyblog.base.vo.BaseVO;
import lombok.Data;

/**
 * SubjectItemVO
 *
 * @author: 应寒
 * @create: 2020年8月22日21:53:40
 */
@Data
public class SubjectItemVO extends BaseVO<SubjectItemVO> {

    /**
     * 专题UID
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String subjectUid;

    /**
     * 博客UID
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String blogUid;

    /**
     * 排序字段，数值越大，越靠前
     */
    @IntegerNotNull(groups = {Insert.class, Update.class})
    private int sort;

}
