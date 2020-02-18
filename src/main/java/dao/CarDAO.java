package dao;

import domain.Car;

public class CarDAO extends DAO<Car> {

    @Override
    protected String getSqlString() {
        return "select m from Car m";
    }

    @Override
    protected Class getClassName() {
        return Car.class;
    }
}
