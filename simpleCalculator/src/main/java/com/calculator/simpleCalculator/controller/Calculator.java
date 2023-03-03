package com.calculator.simpleCalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.simpleCalculator.calculatorLogic.CalculatorLogic;

@RestController
public class Calculator {
	@GetMapping("/calculator/add")//it is use to get the request for the specific method
	public String calculate(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate method use for the take parameter
	{
		return "<h2> The sum is"+CalculatorLogic.addNO(n1, n2)+"</h2>";//call CalculatorLogic class addNO()method
	}
	@GetMapping("/calculator/sub")//it is use to get the request for the specific method
	public String calculate1(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2) //It is a calculate method use for the take parameter
	{
		return "<h2> The substraction is"+CalculatorLogic.subNO(n1, n2)+"</h2>";//call CalculatorLogic class subNO()method
	}
	@GetMapping("/calculator/mul")//it is use to get the request for the specific method
	public String calculate3(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2) //It is a calculate method use for the take parameter
	{
		return "<h2> The multiplication is"+CalculatorLogic.mulNO(n1, n2)+"</h2>";//call CalculatorLogic class mulNO()method
	}
	@GetMapping("/calculator/div")//it is use to get the request for the specific method
	public String calculate4(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate method use for the take parameter
	{
		return "<h2> The division is"+CalculatorLogic.divNO(n1, n2)+"</h2>";//call CalculatorLogic class divNO()method
	}

}
