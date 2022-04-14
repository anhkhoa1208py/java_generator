/*
 * Created on 2022-04-12 ( Time 14:44:11 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package com.vpbank.innovation.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.vpbank.innovation.bean.DmsDocumentM;
import com.vpbank.innovation.business.service.DmsDocumentMService;
import com.vpbank.innovation.web.listitem.DmsDocumentMListItem;

/**
 * Spring MVC controller for 'DmsDocumentM' management.
 */
@Controller
public class DmsDocumentMRestController {

	@Resource
	private DmsDocumentMService dmsDocumentMService;
	
	@RequestMapping( value="/items/dmsDocumentM",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<DmsDocumentMListItem> findAllAsListItems() {
		List<DmsDocumentM> list = dmsDocumentMService.findAll();
		List<DmsDocumentMListItem> items = new LinkedList<DmsDocumentMListItem>();
		for ( DmsDocumentM dmsDocumentM : list ) {
			items.add(new DmsDocumentMListItem( dmsDocumentM ) );
		}
		return items;
	}
	
	@RequestMapping( value="/dmsDocumentM",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<DmsDocumentM> findAll() {
		return dmsDocumentMService.findAll();
	}

	@RequestMapping( value="/dmsDocumentM/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public DmsDocumentM findOne(@PathVariable("id") BigDecimal id) {
		return dmsDocumentMService.findById(id);
	}
	
	@RequestMapping( value="/dmsDocumentM",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public DmsDocumentM create(@RequestBody DmsDocumentM dmsDocumentM) {
		return dmsDocumentMService.create(dmsDocumentM);
	}

	@RequestMapping( value="/dmsDocumentM/{id}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public DmsDocumentM update(@PathVariable("id") BigDecimal id, @RequestBody DmsDocumentM dmsDocumentM) {
		return dmsDocumentMService.update(dmsDocumentM);
	}

	@RequestMapping( value="/dmsDocumentM/{id}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("id") BigDecimal id) {
		dmsDocumentMService.delete(id);
	}
	
}