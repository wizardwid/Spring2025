package kr.hs.study.firstJPA.Repository;

import kr.hs.study.firstJPA.DTO.memoDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memoRepository extends CrudRepository<memoDTO, Long>{

}
