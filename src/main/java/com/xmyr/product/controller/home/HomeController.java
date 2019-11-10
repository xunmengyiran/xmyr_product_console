package com.xmyr.product.controller.home;

import com.xmyr.product.dto.CategoryDTO;
import com.xmyr.product.dto.ProductDTO;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private IXmyrProductService productService;
    @Autowired
    private IXmyrBannerService bannerService;
    @Autowired
    private IXmyrCategoryService categoryService;

    @GetMapping("queryproductforlist")
    @ApiOperation("根据关键词检索产品")
    public List<XmyrProductModel> queryProductForList(@ApiParam(value = "当前页") @RequestParam Integer currPage,
                                                      @ApiParam(value = "关键词", required = false) @RequestParam(required = false) String keys) {
        log.info("==currPage=="+currPage);
        log.info("==key=="+keys);

        try {
            return productService.queryProductForList(currPage,keys);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("querycategoryforlist")
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
    }
}
