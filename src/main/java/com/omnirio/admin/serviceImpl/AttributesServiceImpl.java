package com.omnirio.admin.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.omnirio.admin.entity.Attributes;
import com.omnirio.admin.exception.ResourceNotFoundException;
import com.omnirio.admin.repository.AttributesRepository;
import com.omnirio.admin.service.AttributesService;

@Service
@Transactional
public class AttributesServiceImpl implements AttributesService {

	@Autowired private AttributesRepository attributesRepository;
	
	@Override
	public ResponseEntity<Attributes> addAttributes(Attributes attributes) {
		attributes=attributesRepository.save(attributes);
		return new ResponseEntity<Attributes>(attributes, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Attributes> viewAttributes(Long id) {
		Optional<Attributes> attributes=attributesRepository.findById(id);
		if(attributes.isPresent()) {
			return new ResponseEntity<Attributes>(attributes.get(), HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Attribute Not Found");
		}
	}

	@Override
	public ResponseEntity<List<Attributes>> allAttributes() {
		List<Attributes> attributes=attributesRepository.findAll();
		if(!attributes.isEmpty()) {
			return new ResponseEntity<List<Attributes>>(attributes, HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Attribute Not Found");
		}
	}

}
