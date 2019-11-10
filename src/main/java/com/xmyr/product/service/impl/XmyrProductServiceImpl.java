package com.xmyr.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmyr.product.dao.XmyrProductDao;
import com.xmyr.product.dto.ProductDTO;
import com.xmyr.product.model.XmyrProductModel;
import com.xmyr.product.service.IXmyrProductService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author CCQ
 * @since 2019-11-09
 */
@Service
public class XmyrProductServiceImpl extends ServiceImpl<XmyrProductDao, XmyrProductModel> implements IXmyrProductService {

    @Autowired
    private XmyrProductDao productDao;
    @Override
    public List<XmyrProductModel> queryProductForList(Integer currPage, String keys) throws Exception {
        IPage<XmyrProductModel> page = new Page<>(currPage,30);
        QueryWrapper queryWrapper = new QueryWrapper();
        if(StringUtils.isNotEmpty(keys)){
            queryWrapper.like("productTitle",keys);
        }
        IPage<XmyrProductModel> xmyrProductModelIPage = productDao.selectPage(page,queryWrapper);
        return xmyrProductModelIPage.getRecords();
    }
}
