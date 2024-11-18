import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; // Importar ResultSet
import java.sql.SQLException;

public class AeropuertosCompanias {

    public void asignarCompaniaAAeropuerto(int idAeropuerto, int idCompania) throws SQLException {
        String query = "INSERT INTO aeropuertos_companias (id_aeropuerto, id_compania) VALUES (?, ?)";
    
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setInt(1, idAeropuerto);
            pstmt.setInt(2, idCompania);
            
            pstmt.executeUpdate();  // Aquí es donde usamos executeUpdate(), no executeQuery()
            System.out.println("Compañía asignada al aeropuerto exitosamente.");
        } catch (SQLException e) {
        }
    }
    
    // Método para verificar si un registro existe
    public boolean existeRegistro(String tabla, String campo, int id) throws SQLException {
        String query = "SELECT COUNT(*) FROM " + tabla + " WHERE " + campo + " = ?";
        try (Connection conn = ConexionDB.getConnection(); // Obtener conexión
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id); // Setear el ID a buscar
            ResultSet rs = pstmt.executeQuery(); // Ejecutar consulta y obtener el ResultSet

            if (rs.next() && rs.getInt(1) > 0) {
                return true; // El registro existe
            }
        } catch (SQLException e) { // Capturar errores SQL
            e.printStackTrace();
        }
        return false; // No existe el registro
    }

    // Método estático para validar subvención de aeropuertos públicos
    public static void validarSubvencion(boolean esPrivado, double subvencion) {
        if (!esPrivado && subvencion <= 0.0) {
            throw new IllegalArgumentException("La subvención para aeropuertos públicos debe ser mayor a 0.0");
        }
    }
}
