package com.infotech.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1")
public class ActuatorController {

	@GetMapping("/")
	public String get(@RequestParam(value = "name", defaultValue = "Guest") String name) {
		return "Hello  User: " + name + "!!";
	}

	@GetMapping("/demo")
	public String testMetricApi(@RequestParam(value = "sleepTime", defaultValue = "0") Integer sleepTime)
			throws InterruptedException {
		if (sleepTime == 0) {
			sleepTime = new Random().nextInt(15);
		}
		TimeUnit.SECONDS.sleep(sleepTime);

		return "Successfully executed demo Api.";
	}
}
