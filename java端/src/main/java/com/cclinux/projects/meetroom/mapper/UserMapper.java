package com.cclinux.projects.meetroom.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetroom.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetRoomUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
