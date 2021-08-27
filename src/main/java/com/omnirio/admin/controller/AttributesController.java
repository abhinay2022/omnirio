package com.omnirio.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omnirio.admin.entity.Attributes;
import com.omnirio.admin.service.AttributesService;

@RestController
@RequestMapping("api")
public class AttributesController {

	@Autowired private AttributesService attributesService;
	
	@PostMapping("v1/add/attribute")
    ResponseEntity<Attributes> addAttributes(@RequestBody Attributes attributes) {
        return attributesService.addAttributes(attributes);
    }
	
	@GetMapping("v1/view/attribute/{id}")
    ResponseEntity<Attributes> viewAttributes(@PathVariable Long id) {
        return attributesService.viewAttributes(id);
    }
	
	@GetMapping("v1/all/attributes")
    ResponseEntity<List<Attributes>> allAttributes() {
        return attributesService.allAttributes();
    }
}
