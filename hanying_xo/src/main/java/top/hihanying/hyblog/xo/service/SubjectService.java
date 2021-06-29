package top.hihanying.hyblog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.hihanying.hyblog.commons.entity.Subject;
import top.hihanying.hyblog.xo.vo.SubjectVO;
import top.hihanying.hyblog.base.service.SuperService;

import java.util.List;

/**
 * 专题表 服务类
 *
 * @author 应寒
 * @date 2020年8月22日22:03:52
 */
public interface SubjectService extends SuperService<Subject> {

    /**
     * 获取专题列表
     *
     * @param subjectVO
     * @return
     */
    public IPage<Subject> getPageList(SubjectVO subjectVO);

    /**
     * 新增专题
     *
     * @param subjectVO
     */
    public String addSubject(SubjectVO subjectVO);

    /**
     * 编辑专题
     *
     * @param subjectVO
     */
    public String editSubject(SubjectVO subjectVO);

    /**
     * 批量删除专题
     *
     * @param subjectVOList
     */
    public String deleteBatchSubject(List<SubjectVO> subjectVOList);

}
