package kr.hs.study.Board.Service;

import kr.hs.study.Board.DAO.boardDAO;
import kr.hs.study.Board.DTO.boardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class boardServiceImpl implements boardService {
    @Autowired
    public boardDAO dao;

    @Override
    public void insert(boardDTO dto){ dao.insert(dto); }

}
