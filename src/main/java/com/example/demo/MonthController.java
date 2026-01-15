package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;

@RestController
class MonthController {

	@GetMapping("/month")
	MonthData getMonthData() {
		return new MonthData("January", Month.JANUARY);
	}
}