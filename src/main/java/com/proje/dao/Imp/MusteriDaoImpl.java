package com.proje.dao.Imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proje.dao.MusteriDao;
import com.proje.model.Musteri;

@Repository
public class MusteriDaoImpl implements MusteriDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Musteri> findAllMusteri() {

		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Musteri> musteriListe = session.createQuery("FROM Musteri").list();
		return musteriListe;

	}

	@Override
	public List<Musteri> findByMusteriName(String musteriName) {

		String sqlSorgusu = "FROM Musteri WHERE musteriAdi LIKE '" + musteriName + "%'";

		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Musteri> musteriler = session.createQuery(sqlSorgusu).list();
		return musteriler;

	}

	@Override
	public Musteri findByMusteriId(long musteriId) {
		return this.sessionFactory.getCurrentSession().get(Musteri.class, musteriId);
	}

	@Override
	public void createMusteri(Musteri musteri) {

		this.sessionFactory.getCurrentSession().save(musteri);

	}

	@Override
	public Musteri updateMusteri(Musteri musteri) {
		this.sessionFactory.getCurrentSession().update(musteri);
		return musteri;
	}

	@Override
	public void deleteMusteri(long musteriId) {
		Musteri musteri = new Musteri();
		musteri.setMusteriId(musteriId);
		this.sessionFactory.getCurrentSession().delete(musteri);

	}

}
