package kr.hs.study.Board.Service;

import kr.hs.study.Board.DTO.boardDTO;

import java.util.List;

public interface boardService {
    public void insert(boardDTO dto);

    public List<boardDTO> listAll();

    public boardDTO selectOne(int id);

    public void update_Hits(int id, int hit);

    public void update(boardDTO dto);

    public void delete(int id);

    public String selectPw(int id);
}
