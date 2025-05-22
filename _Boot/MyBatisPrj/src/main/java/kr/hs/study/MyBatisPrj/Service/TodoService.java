package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.DTO.todoDTO;

import java.util.List;

public interface TodoService {
    public void insert(todoDTO dto);

    public List<todoDTO> listAll();

}
