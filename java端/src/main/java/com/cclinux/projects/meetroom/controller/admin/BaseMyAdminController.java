package com.cclinux.projects.meetroom.controller.admin;

import com.cclinux.framework.core.platform.controller.BaseAdminController;
import com.cclinux.projects.meetroom.service.admin.AdminMgrService;

import javax.annotation.Resource;

/**
 * @Notes: 本项目管理系统控制器基类
 * @Author: cclinux0730 (weixin)
 * @Date: 2024/2/16 14:11
 * @Ver: ccminicloud-framework 3.2.1
 */
public class BaseMyAdminController extends BaseAdminController {
    @Resource(name = "MeetRoomAdminMgrService")
    private AdminMgrService adminMgrService;

}
