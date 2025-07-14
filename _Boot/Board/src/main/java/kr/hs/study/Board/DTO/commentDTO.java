package kr.hs.study.Board.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class commentDTO {
    private int id;
    private String commentWriter;
    private String commentContents;
    private int boardId;
    private LocalDateTime commentCreatedTime;
}
