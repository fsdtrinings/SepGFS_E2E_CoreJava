package com.cg.hrapp.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvalidDesignationException extends Exception{

	private String errorMsg;
	private String srcResName;
}
