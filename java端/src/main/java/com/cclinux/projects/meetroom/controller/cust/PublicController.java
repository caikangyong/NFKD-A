package com.cclinux.projects.meetroom.controller.cust;

import cn.hutool.core.map.MapUtil;
import cn.hutool.core.util.StrUtil;
import com.cclinux.framework.core.platform.controller.BaseController;
import com.cclinux.framework.core.domain.ApiResult;
import com.cclinux.framework.exception.AppException;
import com.cclinux.projects.meetroom.service.cust.PublicService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Notes: 常用模块
 * @Author: cclinux0730 (weixin)
 * @Date: 2024/2/18 7:32
 * @Ver: ccminicloud-framework 3.2.1
 */

@RestController("MeetRoomPublicController")
public class PublicController extends BaseController {

    @Resource(name = "MeetRoomPublicService")
    PublicService publicService;

    @RequestMapping("/comm/upload")
    @ResponseBody
    public ApiResult upload(
            @RequestParam(value = "file") MultipartFile file ) throws Exception {

        if (file.isEmpty()) throw new AppException("上传文件不能为空");

        String fileName = file.getOriginalFilename();
        String extend = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        extend = extend.toLowerCase();
        if (!StrUtil.equalsAny(extend, ".png", ".jpg", ".jpeg"))
            throw new AppException("只能上传png,jpg格式的图片");

        String url = publicService.upload(file);

        return ApiResult.success(MapUtil.of("fileID", url));
    }
}
