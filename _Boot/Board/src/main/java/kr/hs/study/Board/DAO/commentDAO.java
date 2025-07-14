package kr.hs.study.Board.DAO;

import org.apache.ibatis.annotations.Mapper;
import kr.hs.study.Board.DTO.commentDTO;

@Mapper
public interface commentDAO {
    public void insert(commentDTO dto);
}
