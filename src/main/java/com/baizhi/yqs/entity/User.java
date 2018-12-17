package com.baizhi.yqs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="s_user")
public class User {
	@Id
	private Integer id;
	private String name;
	private String password;
	private Integer status;


}
