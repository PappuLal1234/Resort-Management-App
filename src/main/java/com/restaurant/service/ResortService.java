package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.Repository.ResortRepository;
import com.restaurant.entities.Resort;


@Service
public class ResortService {
	@Autowired
	private ResortRepository resortRepository;

	public List<Resort> getAllSubjects() {
		List<Resort> subjects = new ArrayList<>();
		resortRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Resort subject) {
		resortRepository.save(subject);
	}

	public void updateSubject(int id, Resort subject) {
		resortRepository.save(subject);
	}

	public void deleteSubject(int id) {
		resortRepository.deleteById(id);

	}

	public Optional<Resort>  getSubject(int id, Resort subject) {
		Optional<Resort> findById = resortRepository.findById(id);

		return findById;
		
	}

}
