package dao;

import domain.Ticket;

public class TicketDAO extends DAO<Ticket>{

    @Override
    protected String getSqlString() {
        return "select m from Ticket m";
    }

    @Override
    protected Class getClassName() {
        return Ticket.class;
    }
}
