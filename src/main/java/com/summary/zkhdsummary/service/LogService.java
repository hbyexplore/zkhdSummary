package com.summary.zkhdsummary.service;

import com.summary.zkhdsummary.bean.Log;
import org.springframework.ui.Model;
import com.summary.zkhdsummary.bean.LogBean;
import com.summary.zkhdsummary.bean.User;
import com.summary.zkhdsummary.config.PageBean;

import java.util.List;

public interface LogService {
    Log findLogById(int id);
    List<LogBean> findList();

    List findTime(List<User> list);
    //查询全部的总结内容
    PageBean<Log> findLogById(Integer id,int currement,int pageSize);

    List<Integer> findUserByDate(String date);


    List<List<Log>> findSummary(List<User> listTime);

    List<LogBean> searchLog(String username, String userdate);
}
