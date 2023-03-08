package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ApiModel;

import com.example.demo.Service.ApiService;

@RestController
@CrossOrigin
public class ApiController {

@Autowired

ApiService s;

@PostMapping("/addDetails")

public ApiModel addInfo(@RequestBody ApiModel c)

{

return s.saveDetails(c);

}

@GetMapping("/get")

public List<ApiModel> fetchDetails()

{

return s.getDetails();

}
@PutMapping("/updateDetails")
public ApiModel updateInfo(@RequestBody ApiModel c1)
{
	return s.updateDetails(c1);
}
@DeleteMapping("/delete/{busId}")
public String deleteInfo(@PathVariable("busId") int id)
{
	s.deleteDetails(id);
	return "Deleted details";
}

@GetMapping("/product/{field}")

public List<ApiModel> getWithSort(@PathVariable String field)

{

return s.getSorted(field);

}

@GetMapping("/product/{offset}/{pageSize}")

public List<ApiModel> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize)

{

return s.getWithPagination(offset,pageSize);

}

}