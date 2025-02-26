/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String address;
    private String phone;
}
