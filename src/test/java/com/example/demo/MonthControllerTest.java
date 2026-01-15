package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Month;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MonthController.class)
class MonthControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	void getMonth() throws Exception {
		mockMvc.perform(get("/month"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.month", is(Month.JANUARY.name())));
	}
}
