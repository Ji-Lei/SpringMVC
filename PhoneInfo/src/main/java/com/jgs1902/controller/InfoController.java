package com.jgs1902.controller;

import com.jgs1902.pojo.Info;
import com.jgs1902.pojo.InfoList;
import com.jgs1902.pojo.Replies;
import com.jgs1902.service.InfoService;
import com.jgs1902.util.NowTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/info")
public class InfoController {

    @Autowired
    @Qualifier("infoService")
    private InfoService service;

    @RequestMapping("/insertInfo")
    public String insertInfo(Model model,String title,String content){
        Info info=new Info();
        info.setTitle(title);
        info.setContent(content);
        info.setReportTime(NowTime.now());
        service.insertInfo(info);
        return "redirect:showAll";
    }

    @RequestMapping("/showOne")
    public String showOne(Model model,@RequestParam Integer id){
        service.setViewCount(id);//每访问一次给对应id浏览量加一
        List<Info> lists=service.getInfoById(id);
        List<Replies> repliesList=service.getContentById(id);
        model.addAttribute("lists",lists);
        model.addAttribute("repliesList",repliesList);
        return "jsp/showOne";
    }

    @RequestMapping("/showAll")
    public String showAll(Model model, @RequestParam(required = false) Integer id){
        List<Info> lists=service.getInfoById(id);
        model.addAttribute("lists",lists);
        model.addAttribute("id",id);
        return "jsp/showAll";
    }

    @RequestMapping("/addReplies")
    public String addReplies(Model model,@RequestParam(required = false) Integer id,@RequestParam(required = false) String content){

        System.out.println(content.length());//查看评论的长度
        if(content.length()<50) {//评论数小于50才执行数据库操作
            Replies replies = new Replies();
            replies.setContent(content);
            replies.setReplyTime(NowTime.now());
            replies.setInfoId(id);
            Integer test = service.insertContent(replies);

            Info info = new Info();
            info.setId(id);
            info.setLastPostTime(NowTime.now());
//      根据id查评论数
            info.setReplyCount(service.getReplyCount(id));

            if (test > 0) {
                service.setReplyCount(info);//设置评论数和最新评论时间
            }
        }else {
            model.addAttribute("numsize","评论超过50个字，评论失败！");
        }
        return "redirect:showOne?id="+id;
    }
}
