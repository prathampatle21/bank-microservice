package com.pratham.accounts.service;

import com.pratham.accounts.dto.CustomerDto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public interface IAccountsService {

	/**
	 *
	 * @param customerDto - CustomerDto Object
	 */
	void createAccount(@Valid CustomerDto customerDto);

	/**
	 *
	 * @param mobileNumber - Input Mobile Number
	 * @return Accounts Details based on a given mobileNumber
	 */
	CustomerDto fetchAccount(
			@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber);

	/**
	 *
	 * @param customerDto - CustomerDto Object
	 * @return boolean indicating if the update of Account details is successful or
	 *         not
	 */
	boolean updateAccount(CustomerDto customerDto);

	/**
	 *
	 * @param mobileNumber - Input Mobile Number
	 * @return boolean indicating if the delete of Account details is successful or
	 *         not
	 */
	boolean deleteAccount(
			@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits") String mobileNumber);

}
