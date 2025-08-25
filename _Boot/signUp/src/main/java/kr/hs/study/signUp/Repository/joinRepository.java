package kr.hs.study.signUp.Repository;

import kr.hs.study.signUp.Entity.joinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface joinRepository extends JpaRepository<joinEntity, Long> {
    Optional<joinEntity> findByName(String name);
    Optional<joinEntity> findById(Long id);
}
