package com.apzon.service.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.dao.SampleDao;
import com.hibernate.model.Sample;

@Repository
public class SampleDaoImpl implements SampleDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public List<Sample> getSampleList() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM SAMPLE");
		sql.append(" WHERE 1=1");
		
//		if (invCost.getItemcode() != null) {
//			sql.append(" AND ITEMNUM = :itemnum");
//		}
//		if (invCost.getWhscode() != null) {
//			sql.append(" AND LOCATION = :location");
//		}
//		if (invCost.getSiteid() != null) {
//			sql.append(" AND SITEID = :siteid");
//		}
//		if (invCost.getOrgid() != null) {
//			sql.append(" AND ORGID = :orgid");
//		}
//
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
//		
//		if (invCost.getItemcode() != null) {
//			query.setString("itemnum", invCost.getItemcode());
//		}
//		if (invCost.getWhscode() != null) {
//			query.setString("location", invCost.getWhscode());
//		}
//		if (invCost.getSiteid() != null) {
//			query.setString("siteid", invCost.getSiteid());
//		}
//		if (invCost.getOrgid() != null) {
//			query.setString("orgid", invCost.getOrgid());
//		}
		
		List<Sample> samples = query.addEntity(Sample.class).list();
		return samples;
	}

	@Override
	public void updateSample(Sample sample) {
		
	}

	@Override
	public void createSample(Sample sample) {
		
	}

	@Override
	public void deleteSample(String id) {
		
	}
	
}
