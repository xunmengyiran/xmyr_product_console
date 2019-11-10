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
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author CCQ
 * @since 2019-11-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "xmyr_banner")
@ApiModel(value="XmyrBanner对象", description="")
public class XmyrBannerModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "图片路径")
    @TableField("imgSrc")
    private String imgSrc;

    @ApiModelProperty(value = "是否启用:1启用;0不启用,默认启用")
    @TableField("isEnable")
    private Integer isEnable;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("createUserId")
    private Integer createUserId;

    @TableField("updateDate")
    private LocalDateTime updateDate;

    @TableField("updateUserId")
    private Integer updateUserId;


}
