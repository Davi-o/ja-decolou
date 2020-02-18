package dao;


import domain.State;

public class StateDAO extends DAO<State>{

        @Override
        protected String getSqlString() {
            return "select m from State m";
        }

        @Override
        protected Class getClassName() {
            return State.class;
        }
    }