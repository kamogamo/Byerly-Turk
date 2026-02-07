//ここはエンティティクラスでDBから来るデータをプログラムで扱いやすくする
package com.example.keibaapi.repository.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GIWinnerEntity {
    private Integer year;
    private String race;
    private String winner;
}
