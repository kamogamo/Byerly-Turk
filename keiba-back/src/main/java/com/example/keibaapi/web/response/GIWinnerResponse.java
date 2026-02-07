package com.example.keibaapi.web.response;

import com.example.keibaapi.repository.entity.GIWinnerEntity;

public record GIWinnerResponse (
    Integer year,
    String race,
    String winner
){
    public static  GIWinnerResponse from(GIWinnerEntity giWinner){
        return new GIWinnerResponse(
                giWinner.getYear(),
                giWinner.getRace(),
                giWinner.getWinner()
        );
    }
}
