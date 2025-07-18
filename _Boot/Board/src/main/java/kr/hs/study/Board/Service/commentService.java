package kr.hs.study.Board.Service;

import kr.hs.study.Board.DTO.commentDTO;

import java.util.List;

public interface commentService {
    public void insert(commentDTO dto);

    public List<commentDTO> listAll(int boardId);
}
