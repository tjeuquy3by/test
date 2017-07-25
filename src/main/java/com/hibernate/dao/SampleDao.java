package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Sample;

public interface SampleDao {
	List<Sample> getSampleList();
	void updateSample(Sample sample);
	void createSample(Sample sample);
	void deleteSample(String id);
}
