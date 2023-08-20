package com.go.liao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Hello {

	public Hello() {}

	public Hello(String name) {
		this.username = name;
	}

	@Getter
	@Setter
	private String username;

	@Override
	public String toString() {
		return "Hello{" +
				"name='" + username + '\'' +
				'}';
	}
}
