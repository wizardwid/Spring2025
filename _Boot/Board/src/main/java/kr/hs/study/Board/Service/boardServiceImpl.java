package kr.hs.study.Board.Service;

import kr.hs.study.Board.DAO.boardDAO;
import kr.hs.study.Board.DTO.boardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class boardServiceImpl implements boardService {
    @Autowired
    public boardDAO dao;

    @Override
    public void insert(boardDTO dto){ dao.insert(dto); }

    @Override
    public List<boardDTO> listAll() {
        return dao.listAll();
    }

    @Override
    public boardDTO selectOne(int id) { return dao.selectOne(id); }

    @Override
    public void update_Hits(int id, int hit) {
        dao.update_Hits(id, hit);
    }

    @Override
    public void update(boardDTO dto){
        dao.update(dto);
    }

    @Override
    public void delete(int id){
        dao.delete(id);
    }

    @Override
    public String selectPw(int id){
        return dao.selectPw(id);
    }
}
