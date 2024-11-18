import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        AeropuertoDAO aeropuertoDAO = new AeropuertoDAO();
        vuelos_pasajeros vuelos_pasajeros = new vuelos_pasajeros();
        AeropuertosCompanias aeropuertoCompaniaDAO = new AeropuertosCompanias();

        
        aeropuertoDAO.guardarAeropuerto("Aeropuerto Privado 1", "Ciudad X", "Pais X", true, 0.0);

        
        aeropuertoDAO.guardarAeropuerto("Aeropuerto Público 1", "Ciudad Y", "Pais X", false, 100000.0);

        
        vuelos_pasajeros.registrarPasajeroEnVuelo(1, 1);

        
        aeropuertoCompaniaDAO.asignarCompaniaAAeropuerto(1, 1);
    }
}
