package com.xmyr.product.controller.system;

import com.xmyr.product.contants.Constants;
import com.xmyr.product.dto.ResponseDTO;
import com.xmyr.product.model.XmyrProductModel;
import com.xmyr.product.service.IXmyrProductService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("system")
public class SystemProductController {

    @Autowired
    private IXmyrProductService productService;

    @PostMapping("addProduct")
    @ApiOperation("添加商品")
    public ResponseDTO addProduct(XmyrProductModel xmyrProductModel){
log.info("==xmyrProductModel=="+xmyrProductModel.toString());
        ResponseDTO responseDTO = new ResponseDTO(Constants.RESULT_STATUS.CODE_FAIL,Constants.RESULT_STATUS.DESC_FAIL,"");
        try {
            productService.save(xmyrProductModel);
            responseDTO.setCode(Constants.RESULT_STATUS.CODE_SUCC);
            responseDTO.setDesc(Constants.RESULT_STATUS.DESC_SUCC);
            responseDTO.setMsg("添加商品成功");
        } catch (Exception e){
            e.printStackTrace();
        }
        return responseDTO;
    }
}
