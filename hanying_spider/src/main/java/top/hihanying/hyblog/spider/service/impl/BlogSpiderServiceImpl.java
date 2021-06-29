package top.hihanying.hyblog.spider.service.impl;


import top.hihanying.hyblog.spider.entity.BlogSpider;
import top.hihanying.hyblog.spider.mapper.BlogSpiderMapper;
import top.hihanying.hyblog.spider.service.BlogSpiderService;
import top.hihanying.hyblog.base.serviceImpl.SuperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客爬取服务实现类
 * </p>
 *
 * @author 应寒
 * @since 2020年2月7日21:29:42
 */
@Slf4j
@Service
public class BlogSpiderServiceImpl extends SuperServiceImpl<BlogSpiderMapper, BlogSpider> implements BlogSpiderService {

}
