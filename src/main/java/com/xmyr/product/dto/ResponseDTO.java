package com.xmyr.product.dto;

import com.xmyr.product.contants.Constants;
import io.swagger.annotations.ApiModelProperty;

public class ResponseDTO<T> {

    @ApiModelProperty(value = "状态：{1000,成功},{2000,失败},{3000,Token失效},{4000,没有权限}", required = true, position = 1, example = "1000")
    private Integer code;
    @ApiModelProperty(value = "描述：成功或失败等", required = true, position = 2, example = "描述信息")
    private String desc;
    @ApiModelProperty(value = "消息提示", required = true, position = 3, example = "消息提示")
    private String msg;
    @ApiModelProperty(value = "数据：Json格式数据", required = true, position = 4)
    private T data;

    public ResponseDTO(Integer code, String desc, String msg) {
        super();
        this.code = code;
        this.desc = desc;
        this.msg = msg;
    }

    public ResponseDTO(Integer code, String desc, String msg, T data) {
        super();
        this.code = code;
        this.desc = desc;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseDTO<T> success() {
        return new ResponseDTO<T>(Constants.RESULT_STATUS.CODE_SUCC, Constants.RESULT_STATUS.DESC_SUCC, "");
    }

    public ResponseDTO<T> success(T data) {
        return new ResponseDTO<T>(Constants.RESULT_STATUS.CODE_SUCC, Constants.RESULT_STATUS.DESC_SUCC, "", data);
    }

    public ResponseDTO<T> fail() {
        return new ResponseDTO<T>(Constants.RESULT_STATUS.CODE_FAIL, Constants.RESULT_STATUS.DESC_FAIL, "");
    }

    public ResponseDTO<T> fail(T data) {
        return new ResponseDTO<T>(Constants.RESULT_STATUS.CODE_FAIL, Constants.RESULT_STATUS.DESC_FAIL, msg, data);
    }
}
