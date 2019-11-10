package com.xmyr.product.controller;

import com.xmyr.product.model.XmyrBannerModel;
import com.xmyr.product.model.XmyrCategoryModel;
import com.xmyr.product.model.XmyrProductModel;
import com.xmyr.product.service.IXmyrBannerService;
import com.xmyr.product.service.IXmyrCategoryService;
import com.xmyr.product.service.IXmyrProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IXmyrProductService productService;
    @Autowired
    private IXmyrBannerService bannerService;
    @Autowired
    private IXmyrCategoryService categoryService;

    @GetMapping("getproductbyid/{id}")
    @ApiOperation("根据产品ID获取产品对象")
    public XmyrProductModel getProductById(@ApiParam(value = "产品ID") @PathVariable Integer id) {
        log.info("==id=="+id);
        try {
            return productService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

   /* @GetMapping("querycategoryforlist")
    @ApiOperation("获取所有分类")
    public List<XmyrCategoryModel> queryCategoryForList(){
        try {
            return categoryService.queryCategoryForList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("querybannerforlist")
    @ApiOperation("获取所有已启用的Banner")
    public List<XmyrBannerModel> queryBannerForList(){

        try {
            return bannerService.queryAllEnableBannerForList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
