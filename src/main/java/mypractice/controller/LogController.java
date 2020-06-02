package mypractice.controller;

import mypractice.config.Log;
import mypractice.mapper.LogMapper;
import mypractice.popj.LogPopj;
import mypractice.service.ILogService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LogController {

    private final static Logger log = org.slf4j.LoggerFactory.getLogger(LogController.class);

    @Autowired
    private ILogService logService;
    @Autowired
    LogMapper logMapper;
    @RequestMapping("/aop")
    @ResponseBody
    @Log()
    public Object aop(String name, String nick) {
        Map<String, Object> map =new HashMap<>();
        log.info("我被执行了！");
        map.put("res", "ok");

        return map;
    }

    @GetMapping("/index")
    public String aops(LogPopj logPopj) {
        logPopj.setCreateTime(new Date());
        logPopj.setUserId(2);
        logPopj.setUserAction("测试");
        logMapper.insert(logPopj);
    return "index";
    }
}
