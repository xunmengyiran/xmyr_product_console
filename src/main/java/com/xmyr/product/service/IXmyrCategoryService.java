package com.xmyr.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmyr.product.dto.CategoryDTO;
import com.xmyr.product.model.XmyrCategoryModel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CCQ
 * @since 2019-11-10
 */
public interface IXmyrCategoryService extends IService<XmyrCategoryModel> {

    List<XmyrCategoryModel> queryCategoryForList() throws Exception;

}
