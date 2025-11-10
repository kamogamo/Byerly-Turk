package com.example.keibaapi.web.rest;

import com.example.keibaapi.repository.entity.GIWinner;
import com.example.keibaapi.service.GIWinnerService;
import com.example.keibaapi.web.response.GIWinnerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/GIResult")
public class GIWinnerRestController {

    private final GIWinnerService giWinnerService;

    public GIWinnerRestController(GIWinnerService giWinnerService) {
        this.giWinnerService = giWinnerService;
    }

    @GetMapping
    public List<GIWinnerResponse> findResult(){
        List<GIWinner> giWinner = giWinnerService.findResult();
        return giWinner.stream()
                .map(GIWinnerResponse::from).toList();
    }


}