package com.example.addition.subtraction;



	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class SUbtractionController {

	    @GetMapping("/subtract")
	    public int subtract(@RequestParam int a,
	                   @RequestParam int b) {

	        return a - b;
	    }
	
}
