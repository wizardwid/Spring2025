package kr.hs.study.MyBatisPrj.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class todoDTO {
    private int idx;
    private String content;
    private String password;
    private String status;
    private LocalDateTime postdate;
}
