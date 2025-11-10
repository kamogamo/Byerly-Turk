package com.example.keibaapi.web.response;

import com.example.keibaapi.repository.entity.GIWinner;

public record GIWinnerResponse (
    Integer year,
    String race,
    String winner
){
    public static  GIWinnerResponse from(GIWinner giWinner){
        return new GIWinnerResponse(
                GIWinner.getYear(),
                GIWinner.getRace(),
                GIWinner.getWinner()
        );
    }
}
