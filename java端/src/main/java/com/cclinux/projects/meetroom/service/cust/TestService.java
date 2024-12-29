package com.cclinux.projects.meetroom.service.cust;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cclinux.framework.core.mapper.Where;
import com.cclinux.framework.helper.FakerHelper;
import com.cclinux.framework.helper.TimeHelper;
import com.cclinux.projects.meetroom.mapper.MeetJoinMapper;
import com.cclinux.projects.meetroom.mapper.MeetMapper;
import com.cclinux.projects.meetroom.mapper.UserMapper;
import com.cclinux.projects.meetroom.model.MeetJoinModel;
import com.cclinux.projects.meetroom.model.MeetModel;
import com.cclinux.projects.meetroom.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Notes: 活动模块业务逻辑
 * @Author: cclinux0730 (weixin)
 * @Date: 2024/3/7 5:41
 * @Ver: ccminicloud-framework 3.2.1
 */

@Service("MeetRoomTestService")
public class TestService extends BaseMyCustService {

    @Resource(name = "MeetRoomMeetMapper")
    private MeetMapper meetMapper;

    @Resource(name = "MeetRoomMeetJoinMapper")
    private MeetJoinMapper meetJoinMapper;

    @Resource(name = "MeetRoomUserMapper")
    private UserMapper userMapper;


    public void test() {

    }

}
