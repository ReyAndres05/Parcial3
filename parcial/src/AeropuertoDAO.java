import java.sql.Connection;
import java.sql.PreparedStatement;

public class AeropuertoDAO {
    public void guardarAeropuerto(String nombre, String ciudad, String pais, boolean esPrivado, double subvencion) {
        String query = "INSERT INTO aeropuertos (nombre, ciudad, privado, publico, subvencion) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = (Connection) ConexionDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, ciudad);
            pstmt.setString(3, pais);
            
            if (esPrivado) {
                pstmt.setInt(3, 1); 
                pstmt.setInt(4, 0); 
                pstmt.setDouble(5, 0.0);
            } else {
                pstmt.setInt(3, 0);
                pstmt.setInt(4, 1); 
                pstmt.setDouble(5, subvencion); 
            }

            System.out.println("Aeropuerto guardado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
