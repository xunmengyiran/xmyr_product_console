package com.xmyr.product.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author CCQ
 * @since 2019-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "xmyr_product")
@ApiModel(value="XmyrProductModel对象", description="")
public class XmyrProductModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品标题")
    @TableField("productTitle")
    private String productTitle;

    @ApiModelProperty(value = "商品描述")
    @TableField("productDescribe")
    private String productDescribe;

    @ApiModelProperty(value = "商品规格")
    @TableField("specs")
    private String specs;

    @ApiModelProperty(value = "类别ID")
    @TableField("categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "实际价格")
    @TableField("actualPrice")
    private BigDecimal actualPrice;

    @ApiModelProperty(value = "是否具有折扣(1:有;0:无)")
    @TableField("haveDiscount")
    private Integer haveDiscount;

    @ApiModelProperty(value = "原始价格")
    @TableField("originalPrice")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "小图路径")
    @TableField("smallImgSrc")
    private String smallImgSrc;

    @ApiModelProperty(value = "大图路径")
    @TableField("bigImgSrc")
    private String bigImgSrc;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "创建人id")
    @TableField("createUserId")
    private Integer createUserId;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateDate")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "更新人id")
    @TableField("updateUserId")
    private Integer updateUserId;


}
