package com.example.keibaapi.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface GIWinnerMapper {

    List<String> findGIWinner(
            Integer year,
            String race,
            String winner
    );
}
