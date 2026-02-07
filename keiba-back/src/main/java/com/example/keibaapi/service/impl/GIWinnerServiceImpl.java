package com.example.keibaapi.service.impl;

import com.example.keibaapi.repository.entity.GIWinnerEntity;
import com.example.keibaapi.repository.mapper.GIWinnerMapper;
import com.example.keibaapi.service.GIWinnerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GIWinnerServiceImpl implements GIWinnerService {
    private final GIWinnerMapper giWinnerMapper;

    public GIWinnerServiceImpl(GIWinnerMapper giWinnerMapper) {
        this.giWinnerMapper = giWinnerMapper;
    }


    @Override
    @Transactional
    public List<GIWinnerEntity> findResult() {
        return giWinnerMapper.findResult();
    }
}
