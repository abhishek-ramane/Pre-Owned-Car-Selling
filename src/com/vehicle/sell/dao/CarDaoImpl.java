package com.vehicle.sell.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.sell.entity.Car;
import com.vehicle.sell.model.CarDataModel;

@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	private SessionFactory factory;
	
	public Car getCar(int car_id)
	{
		Session session=factory.getCurrentSession();
		Car c=session.get(Car.class,car_id);
		return c;	
	}
	public void addCar(Car c)
	{
		Session session=factory.getCurrentSession();
		System.out.println(c);
		session.save(c);
		
	}
	public List<Car> getAllCars()
	{
		String hql = "from Car c where c.car_status='AVAILABLE'";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		return q.getResultList();
	}

	public boolean removeCar(int id) {
		Session session=factory.getCurrentSession();
		try {
			Car car=new Car();
			car.setCar_id(id);
			session.remove(car);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
