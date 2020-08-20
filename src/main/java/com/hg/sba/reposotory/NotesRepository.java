package com.hg.sba.reposotory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hg.sba.model.Notes;

public interface NotesRepository extends MongoRepository<Notes, String> {
	List<Notes> findAll();


}
