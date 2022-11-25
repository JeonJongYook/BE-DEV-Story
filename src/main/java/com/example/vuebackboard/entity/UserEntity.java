package com.example.vuebackboard.entity;

import com.example.vuebackboard.web.dtos.UserDto;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
@Table(name="user_info")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String userId;
    private String userEmail;
    private String userPw;
    private String userNickname;
}