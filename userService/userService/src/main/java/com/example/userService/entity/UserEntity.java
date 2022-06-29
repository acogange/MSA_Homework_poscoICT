package com.example.userService.entity;

import lombok.Data;
import org.springframework.cloud.client.loadbalancer.LoadBalancerProperties;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class UserEntity {
    @Id
    private Integer id;
    private  String name;
    private String password;
    private String userid;
    private String img;
}
