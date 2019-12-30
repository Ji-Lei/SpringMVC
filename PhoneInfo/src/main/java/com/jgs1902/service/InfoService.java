package com.jgs1902.service;

import com.jgs1902.pojo.Info;
import com.jgs1902.pojo.InfoList;
import com.jgs1902.pojo.Replies;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoService {

    public List<Info> getInfoById(Integer id);

    public Integer insertInfo(Info info);

    public Integer insertContent(Replies replies);

    public Integer getReplyCount(@Param("infoId") Integer infoId);

    public Integer setReplyCount(Info info);

    public List<Replies> getContentById(Integer infoId);

    public Integer setViewCount(@Param("id") Integer id);
}
