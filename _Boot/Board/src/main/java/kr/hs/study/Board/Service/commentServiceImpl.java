package kr.hs.study.Board.Service;

import kr.hs.study.Board.DAO.commentDAO;
import kr.hs.study.Board.DTO.commentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commentServiceImpl implements commentService{
    @Autowired
    public commentDAO dao;

    @Override
    public void insert(commentDTO dto){ dao.insert(dto); }

    @Override
    public List<commentDTO> listAll(int boardId){ return dao.listAll(boardId); }
}
