package com.multitenat.multiapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController to handle all the CRUD for User Management
 * @author rajavela
 *
 */

@RestController
@RequestMapping(value="/user")
public class UserController {

	@GetMapping("/usersList")
	public String getUsers() {
		return "No User registed with Multi-Tenant App!, contact Admin.";
	}
}

