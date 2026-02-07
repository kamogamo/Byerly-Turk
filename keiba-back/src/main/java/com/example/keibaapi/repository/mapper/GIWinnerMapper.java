package com.example.keibaapi.repository.mapper;

import com.example.keibaapi.repository.entity.GIWinnerEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface GIWinnerMapper {
    List<GIWinnerEntity> findResult();
}
