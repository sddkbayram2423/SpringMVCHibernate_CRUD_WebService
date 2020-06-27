package com.proje.dao;

import java.util.List;

import com.proje.model.Musteri;

public interface MusteriDao {
	
	public List<Musteri> findAllMusteri();
	
	public List<Musteri> findByMusteriName(String musteriName);
	
	public Musteri findByMusteriId(long musteriId);
	
	public void createMusteri(Musteri musteri);
	
	public Musteri updateMusteri(Musteri musteri);
	
	public void deleteMusteri(long musteriId);

}
