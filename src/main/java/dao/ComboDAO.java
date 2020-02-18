package dao;

import domain.Combo;

public class ComboDAO extends DAO<Combo>{

        @Override
        protected String getSqlString() {
            return "select m from Combo m";
        }

        @Override
        protected Class getClassName() {
            return Combo.class;
        }
    }
