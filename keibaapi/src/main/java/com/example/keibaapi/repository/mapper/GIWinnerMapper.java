package com.example.keibaapi.repository.mapper;

import com.example.keibaapi.repository.entity.GIWinner;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface GIWinnerMapper {

    @Select("SELECT * FROM GI_winner")
    List<GIWinner> findResult();





}


