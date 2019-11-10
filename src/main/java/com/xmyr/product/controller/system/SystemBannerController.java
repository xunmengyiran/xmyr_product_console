package com.xmyr.product.controller.system;


import com.xmyr.product.contants.Constants;
import com.xmyr.product.dto.ResponseDTO;
import com.xmyr.product.model.XmyrBannerModel;
import com.xmyr.product.service.IXmyrBannerService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CCQ
 * @since 2019-11-10
 */
@RestController
@RequestMapping("system")
public class SystemBannerController {
    @Autowired
    private IXmyrBannerService bannerService;

    @PostMapping("addbanner")
    public ResponseDTO addBanner(@ApiParam(value = "Banner对象") XmyrBannerModel xmyrBannerModel){
        ResponseDTO responseDTO = new ResponseDTO(Constants.RESULT_STATUS.CODE_FAIL,Constants.RESULT_STATUS.DESC_FAIL,"");
        try {
            bannerService.save(xmyrBannerModel);
            responseDTO.setCode(Constants.RESULT_STATUS.CODE_SUCC);
            responseDTO.setDesc(Constants.RESULT_STATUS.DESC_SUCC);
            responseDTO.setMsg("添加banner成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  responseDTO;
    }
}
