package com.artivr.web.service.serviceImpl;

import com.artivr.entity.log.TbSysLogsEntity;
import com.artivr.repository.log.LogRepository;
import com.artivr.web.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;
    @Override
    public TbSysLogsEntity getLogById(long id) {
        return logRepository.findById(id);
    }
}
