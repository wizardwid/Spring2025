package kr.hs.study.firstJPA.Service;

import kr.hs.study.firstJPA.DTO.memoDTO;

import java.util.List;

public interface memoService {
    public void save(memoDTO memo);

    public List<memoDTO> findAll();
}
