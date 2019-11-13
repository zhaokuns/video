package com.it.video.mapper;

import com.it.video.domain.Video;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: dell
 * @Date: 2019/11/13 23:55
 * @Description:
 */
public interface VideoMapper {

    @Select("select * from video")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    List<Video> getAll();
}
