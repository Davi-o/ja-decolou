import dao.*;
import domain.*;

public class App {
    public static void main(String[] args) {
        TicketDAO ticketDAO = new TicketDAO();
        StateDAO stateDAO = new StateDAO();
        CityDAO cityDAO = new CityDAO();
        ModalityDAO modalityDAO = new ModalityDAO();
        CarDAO carDAO = new CarDAO();
        ComboDAO comboDAO = new ComboDAO();

        State state = new State("Rio Grande do Sul");
        stateDAO.save(state);

        City city = new City("PortoAlegre", state);
        cityDAO.save(city);

        Modality modality = new Modality();
        modalityDAO.save(modality);

        Car car = new Car("SUV", 150.00);
        carDAO.save(car);

        Combo combo = new Combo(car);
        comboDAO.save(combo);

        Double value = 1000.00;

        Ticket ticket = new Ticket(city, modality, value, combo);
        ticketDAO.save(ticket);

    }
}
