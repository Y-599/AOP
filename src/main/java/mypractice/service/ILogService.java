package mypractice.service;

import mypractice.popj.LogPopj;

//日志的接口类
public interface ILogService {

    /**
     * 插入日志
     * @param entity
     * @return
     */
    int insertLog(LogPopj entity);
}
