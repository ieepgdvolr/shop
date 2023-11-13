package com.group.shopHei.entity;

import com.nimbusds.oauth2.sdk.TokenIntrospectionSuccessResponse;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String zipcode;
    private String role;

    private LocalDateTime createDate;


    @PrePersist //DB에 INSERT 되기 직전에 실행. 즉 DB에 값을 넣으면 자동으로 실행됨.
    public void createDate(){
        this.createDate = LocalDateTime.now();
    }

//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
}
