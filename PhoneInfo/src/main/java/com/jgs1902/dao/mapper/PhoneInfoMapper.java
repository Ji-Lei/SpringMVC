package com.jgs1902.dao.mapper;

import com.jgs1902.pojo.Info;
import com.jgs1902.pojo.InfoList;
import com.jgs1902.pojo.Replies;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhoneInfoMapper {
//  利用动态SQL查询，id为空的话查询所有
    public List<Info> getInfoById(@Param("id") Integer id);
//  添加资讯
    public Integer insertInfo(Info info);
//  向回复表插入数据
    public Integer insertContent(Replies replies);
//  根据infoId查询评论表中评论数
    public Integer getReplyCount(@Param("infoId") Integer infoId);
//  根据id设置评论数和最新评论时间
    public Integer setReplyCount(Info info);
//  根据id查询回复表中该资讯的回复
    public List<Replies> getContentById(@Param("infoId") Integer infoId);
//  设置浏览量加一
    public Integer setViewCount(@Param("id") Integer id);
}
