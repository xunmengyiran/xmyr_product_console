package com.xmyr.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmyr.product.dao.XmyrCategoryDao;
import com.xmyr.product.dto.CategoryDTO;
import com.xmyr.product.model.XmyrCategoryModel;
import com.xmyr.product.service.IXmyrCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CCQ
 * @since 2019-11-10
 */
@Service
public class XmyrCategoryServiceImpl extends ServiceImpl<XmyrCategoryDao, XmyrCategoryModel> implements IXmyrCategoryService {

    @Override
    public List<XmyrCategoryModel> queryCategoryForList() throws Exception {
        return list(new QueryWrapper<XmyrCategoryModel>());
    }
}
