package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.DTO.todoDTO;

import java.util.List;

public interface TodoService {
    public void insert(todoDTO dto);

    public List<todoDTO> listAll();

    public void update(todoDTO dto);

    public todoDTO selectOne(int idx);

    public String selectPw(int idx);

    public void delete(int idx);
}
