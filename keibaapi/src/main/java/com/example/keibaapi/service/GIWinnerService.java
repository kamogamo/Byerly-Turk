package com.example.keibaapi.service;

import com.example.keibaapi.repository.entity.GIWinnerEntity;

import java.util.List;

public interface GIWinnerService {
    List<GIWinnerEntity> findResult();
    void insert(GIWinnerEntity giWinner);

}
