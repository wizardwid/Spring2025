package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.DAO.TodoDAO;
import kr.hs.study.MyBatisPrj.DTO.memoDTO;
import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDAO dao;

    @Override
    public void insert(todoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public List<todoDTO> listAll() {
        return dao.listAll();
    }

    @Override
    public void update(todoDTO dto) { dao.update(dto); }

    @Override
    public todoDTO selectOne(int idx) { return dao.selectOne(idx); }

    @Override
    public String selectPw(int idx) { return dao.selectPw(idx); }

    @Override
    public void delete(int idx) { dao.delete(idx); }
}
