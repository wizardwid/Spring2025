package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.DAO.TodoDAO;
import kr.hs.study.MyBatisPrj.DTO.memoDTO;
import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoDAO dao;

    @Override
    public void insert(todoDTO dto) {
        dao.insert(dto);
    }
}
