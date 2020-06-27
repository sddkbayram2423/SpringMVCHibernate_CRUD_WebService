package com.proje.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proje.dao.MusteriDao;
import com.proje.model.Musteri;
import com.proje.service.MusteriService;
@Service
@Transactional
public class MusteriServiceIml implements MusteriService {
	
	@Autowired
	private MusteriDao musteriDao;
	
	@Override
	public List<Musteri> findAllMusteri() {
		return this.musteriDao.findAllMusteri();
	}

	@Override
	public List<Musteri> findByMusteriName(String musteriName) {
		return this.musteriDao.findByMusteriName(musteriName);
	}

	@Override
	public Musteri findByMusteriId(long musteriId) {
		return this.musteriDao.findByMusteriId(musteriId);
	}

	@Override
	public void createMusteri(Musteri musteri) {
		this.musteriDao.createMusteri(musteri);

	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		return this.musteriDao.updateMusteri(musteri);
	}

	@Override
	public void deleteMusteri(long musteriId) {
		this.musteriDao.deleteMusteri(musteriId);
	}

}
