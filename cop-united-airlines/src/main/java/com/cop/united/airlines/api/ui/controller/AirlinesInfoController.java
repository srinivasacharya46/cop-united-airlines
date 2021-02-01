package com.cop.united.airlines.api.ui.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cop.united.airlines.api.ui.request.model.AirlinesRequest;
import com.cop.united.airlines.api.ui.response.model.AirlinesResponse;

@RestController
@RequestMapping("/airlinesInfo/admin")
public class AirlinesInfoController {
	@PostMapping
	@RequestMapping("/addFlight")
	public AirlinesResponse addFlightDetails(@RequestBody AirlinesRequest airlinesRequest) {
		AirlinesResponse returnValue = new AirlinesResponse();

		return returnValue;
	}
}
