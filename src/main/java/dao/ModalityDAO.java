package dao;

import domain.Modality;

public class ModalityDAO extends DAO<Modality> {


        @Override
        protected String getSqlString() {
            return "select m from Modality m";
        }

        @Override
        protected Class getClassName() {
            return Modality.class;
        }
    }