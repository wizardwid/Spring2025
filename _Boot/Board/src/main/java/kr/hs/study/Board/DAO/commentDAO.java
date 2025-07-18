package kr.hs.study.Board.DAO;

import org.apache.ibatis.annotations.Mapper;
import kr.hs.study.Board.DTO.commentDTO;

import java.util.List;

@Mapper
public interface commentDAO {
    public void insert(commentDTO dto);

    public List<commentDTO> listAll(int boardId);
}
