package dao;

import domain.City;

public class CityDAO extends DAO<City> {

        @Override
        protected String getSqlString() {
            return "select m from City m";
        }

        @Override
        protected Class getClassName() {
            return City.class;
        }
    }