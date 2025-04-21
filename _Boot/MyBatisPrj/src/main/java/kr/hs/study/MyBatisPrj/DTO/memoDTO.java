package kr.hs.study.MyBatisPrj.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class memoDTO {
    private int idx;
    private String writer;
    private String memo;
    private LocalDateTime post_data;
}
