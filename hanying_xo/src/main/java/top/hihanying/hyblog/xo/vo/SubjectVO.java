package top.hihanying.hyblog.xo.vo;

import top.hihanying.hyblog.base.validator.annotion.NotBlank;
import top.hihanying.hyblog.base.validator.group.Insert;
import top.hihanying.hyblog.base.validator.group.Update;
import top.hihanying.hyblog.base.vo.BaseVO;
import lombok.Data;

/**
 * SubjectVO
 *
 * @author: 应寒
 * @create: 2020年8月22日21:53:40
 */
@Data
public class SubjectVO extends BaseVO<SubjectVO> {

    /**
     * 专题名
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String subjectName;

    /**
     * 专题介绍
     */
    private String summary;

    /**
     * 封面图片UID
     */
    private String fileUid;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 专题点击数
     */
    private String clickCount;

    /**
     * 专题收藏数
     */
    private String collectCount;
}
