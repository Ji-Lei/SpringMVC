package com.jgs1902.service;

import com.jgs1902.dao.mapper.PhoneInfoMapper;
import com.jgs1902.pojo.Info;
import com.jgs1902.pojo.InfoList;
import com.jgs1902.pojo.Replies;
import com.jgs1902.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("infoService")
public class InfoServiceImpl implements InfoService {

    @Autowired
    @Qualifier("phoneInfoMapper")
    private PhoneInfoMapper dao;

    public List<Info> getInfoById(Integer id) {
        return dao.getInfoById(id);
    }

    public Integer insertInfo(Info info) {
        return dao.insertInfo(info);
    }

    public Integer insertContent(Replies replies) {

        return dao.insertContent(replies);
    }

    public Integer getReplyCount(Integer infoId) {
        return dao.getReplyCount(infoId);
    }

    public Integer setReplyCount(Info info) {
        return dao.setReplyCount(info);
    }


    public List<Replies> getContentById(Integer infoId) {
        return dao.getContentById(infoId);
    }

    public Integer setViewCount(Integer id) {
        return dao.setViewCount(id);
    }
}
