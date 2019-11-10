package com.xmyr.product.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    @TableField("商品标题")
    private String title;
    @TableField("商品描述")
    private String describe;
    @TableField("实际价格")
    private Double actualPrice;
    @TableField("是否具有折扣")
    private Integer haveDiscount;
    @TableField("原始价格")
    private Double originalPrice;
    @TableField("小图路径")
    private String smallImgSrc;
}
