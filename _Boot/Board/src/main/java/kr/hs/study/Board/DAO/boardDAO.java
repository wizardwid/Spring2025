package kr.hs.study.Board.DAO;

import kr.hs.study.Board.DTO.boardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface boardDAO {
    public void insert(boardDTO dto);

    public List<boardDTO> listAll();

    public boardDTO selectOne(int id);

    public void update_Hits(int id, int hit);

    public void update(boardDTO dto);

    public void delete(int id);

    public String selectPw(int id);
}
