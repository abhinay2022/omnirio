package com.omnirio.admin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.omnirio.admin.entity.Attributes;

public interface AttributesService {

	ResponseEntity<Attributes> addAttributes(Attributes attributes);

	ResponseEntity<Attributes> viewAttributes(Long id);

	ResponseEntity<List<Attributes>> allAttributes();

}
