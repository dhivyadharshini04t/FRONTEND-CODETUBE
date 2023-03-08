package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.ApiModel;

import com.example.demo.Repository.ApiRepository;

@Service

public class ApiService {

@Autowired(required=true)

ApiRepository cr;

public ApiModel saveDetails(ApiModel c)

{

return cr.save(c);

}

public List<ApiModel> getDetails()

{

return cr.findAll();

}
public ApiModel updateDetails(ApiModel c1)
{
	return cr.saveAndFlush(c1);
}
public void deleteDetails(int id)
{
	cr.deleteById(id);
}

public List<ApiModel> getSorted(String field)

{

return cr.findAll(Sort.by(Sort.Direction.ASC,field));

}

public List<ApiModel> getWithPagination(@PathVariable int offset, @PathVariable int pageSize)

{

Page<ApiModel> page=cr.findAll(PageRequest.of(offset, pageSize));

return page.getContent();

}

}