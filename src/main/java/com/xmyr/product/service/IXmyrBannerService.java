package com.xmyr.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmyr.product.model.XmyrBannerModel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CCQ
 * @since 2019-11-10
 */
public interface IXmyrBannerService extends IService<XmyrBannerModel> {

    List<XmyrBannerModel> queryAllEnableBannerForList() throws Exception;

}
