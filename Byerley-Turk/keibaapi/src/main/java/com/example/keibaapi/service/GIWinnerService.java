package com.example.keibaapi.service;

import com.example.keibaapi.repository.entity.GIWinner;

import java.util.List;

public interface GIWinnerService {
    List<GIWinner> findResult();
    void insert(GIWinner giWinner);

}
