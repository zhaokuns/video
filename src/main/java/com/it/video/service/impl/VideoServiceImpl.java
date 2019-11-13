package com.it.video.service.impl;

import com.it.video.domain.Video;
import com.it.video.mapper.VideoMapper;
import com.it.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: dell
 * @Date: 2019/11/14 00:02
 * @Description:
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper mapper;

    @Override
    public List<Video> getAll() {
        return mapper.getAll();
    }
}
