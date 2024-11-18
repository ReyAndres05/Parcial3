import java.sql.Connection;
import java.sql.PreparedStatement;

public class vuelos_pasajeros {
    public void registrarPasajeroEnVuelo(int idPasajero, int idVuelo) {
        String query = "INSERT INTO pasajeros_vuelos (id_pasajero, id_vuelo) VALUES (?, ?)";

        try (Connection conn = (Connection) ConexionDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idPasajero);
            pstmt.setInt(2, idVuelo);

            pstmt.executeUpdate();
            System.out.println("Pasajero registrado en el vuelo exitosamente.");
        } catch (Exception e) {
        }
    }
}
