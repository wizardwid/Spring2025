package kr.hs.study.firstJPA.Repository;

import kr.hs.study.firstJPA.DTO.memoDTO;
import kr.hs.study.firstJPA.Entity.memoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface memoRepository extends JpaRepository<memoEntity, Long> {

}
