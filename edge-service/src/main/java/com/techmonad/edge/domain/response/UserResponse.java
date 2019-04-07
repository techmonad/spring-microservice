package com.techmonad.edge.domain.response;

import java.util.List;

import com.techmonad.edge.domain.dto.User;

public class UserResponse {

	private ResponseHeader header;
	private List<User> users;

	/**
	 * @return the header
	 */
	public ResponseHeader getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
