package mypractice.serviceImpl;

import mypractice.mapper.LogMapper;
import mypractice.popj.LogPopj;
import mypractice.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements ILogService {
    @Autowired
    LogMapper logMapper;
    @Override
    public int insertLog(LogPopj entity) {

        return  logMapper.insert(entity);

    }
}
