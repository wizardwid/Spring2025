package kr.hs.study.signUp.Entity;

import jakarta.persistence.*;
import kr.hs.study.signUp.DTO.joinDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="joinJpa")
public class joinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String email;

    @Column
    private String passwd;

    @Column
    private String name;

    public static joinDTO toDTO(joinEntity ent){
        return joinDTO.builder()
                .id(ent.getId())
                .email(ent.getEmail())
                .passwd(ent.getPasswd())
                .name(ent.getName())
                .build();
    }
}
