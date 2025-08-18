package kr.hs.study.signUp.Repository;

import kr.hs.study.signUp.Entity.joinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface joinRepository extends JpaRepository<joinEntity, Long> {

}
