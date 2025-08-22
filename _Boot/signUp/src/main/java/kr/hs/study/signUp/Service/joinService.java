package kr.hs.study.signUp.Service;

import kr.hs.study.signUp.DTO.joinDTO;

import java.util.List;

public interface joinService {
    public void save(joinDTO dto);

    public List<joinDTO> findAll();
}
