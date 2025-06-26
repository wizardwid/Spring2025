package kr.hs.study.Board.DAO;

import kr.hs.study.Board.DTO.boardDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface boardDAO {
    public void insert(boardDTO dto);
}
