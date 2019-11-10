package com.xmyr.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmyr.product.dto.ProductDTO;
import com.xmyr.product.model.XmyrProductModel;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CCQ
 * @since 2019-11-09
 */
public interface IXmyrProductService extends IService<XmyrProductModel> {

    List<XmyrProductModel> queryProductForList(Integer currPage,String keys) throws Exception;

}
