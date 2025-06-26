package kr.hs.study.Board.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class boardDTO {
    private int id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTIme;
}
