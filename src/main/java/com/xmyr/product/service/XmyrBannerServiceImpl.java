package com.xmyr.product.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmyr.product.dao.XmyrBannerDao;
import com.xmyr.product.model.XmyrBannerModel;
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
public class XmyrBannerServiceImpl extends ServiceImpl<XmyrBannerDao, XmyrBannerModel> implements IXmyrBannerService {

    @Override
    public List<XmyrBannerModel> queryAllEnableBannerForList() throws Exception {
        QueryWrapper<XmyrBannerModel> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("isEnable",1);
        return list(queryWrapper);
    }
}
