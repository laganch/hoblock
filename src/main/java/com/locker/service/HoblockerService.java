package com.locker.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locker.Repository.hoblockerRepo;
import com.locker.model.Hoblocker;

@Service
public class HoblockerService {
	private hoblockerRepo repo;

	@Autowired
	public HoblockerService(hoblockerRepo repo) {
		this.repo = repo;
	}
	
	public List<Hoblocker> getLocker() {
		return (List<Hoblocker>) repo.findAll();
	}

	public Hoblocker getLockerById(Long id) {
		return repo.findById(id).get();
	}
	
}
