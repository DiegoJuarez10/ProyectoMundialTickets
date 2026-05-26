package DAO;

import Conexion.CreateConnection;
import Modelo.PartidoModelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidoDao {

    private final CreateConnection connFactory = new CreateConnection();

    public List<PartidoModelo> obtenerTodos() {

        List<PartidoModelo> lista = new ArrayList<>();

        String sql = "SELECT * FROM partido";

        try(Connection conn = connFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                PartidoModelo partido = new PartidoModelo(
                    rs.getInt("id"),
                    rs.getString("equipo_local"),
                    rs.getString("equipo_visitante"),
                    rs.getDate("fecha").toLocalDate(),
                    rs.getString("hora"),
                    rs.getString("fase"),
                    rs.getString("estadio"),
                    rs.getString("ciudad"),
                    rs.getInt("capacidad"),
                    rs.getString("estado")
                );

                lista.add(partido);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public List<PartidoModelo> buscarPorSeleccion(String seleccion) {

        List<PartidoModelo> lista = new ArrayList<>();

        String sql = "SELECT * FROM partido WHERE equipo_local = ? OR equipo_visitante = ?";

        try(Connection conn = connFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, seleccion);
            ps.setString(2, seleccion);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                PartidoModelo partido = new PartidoModelo(
                    rs.getInt("id"),
                    rs.getString("equipo_local"),
                    rs.getString("equipo_visitante"),
                    rs.getDate("fecha").toLocalDate(),
                    rs.getString("hora"),
                    rs.getString("fase"),
                    rs.getString("estadio"),
                    rs.getString("ciudad"),
                    rs.getInt("capacidad"),
                    rs.getString("estado")
                );

                lista.add(partido);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean guardar(PartidoModelo partido) {

        String sql = "INSERT INTO partido (equipo_local, equipo_visitante, fecha, hora, fase, estadio, ciudad, capacidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = connFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, partido.getEquipo_local());
            ps.setString(2, partido.getEquipo_visitante());
            ps.setDate(3, java.sql.Date.valueOf(partido.getFecha()));
            ps.setString(4, partido.getHora());
            ps.setString(5, partido.getFase());
            ps.setString(6, partido.getEstadio());
            ps.setString(7, partido.getCiudad());
            ps.setInt(8, partido.getCapacidad());

            ps.executeUpdate();

            return true;

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean actualizar(PartidoModelo partido) {

        String sql = "UPDATE partido SET equipo_local=?, equipo_visitante=?, fecha=?, hora=?, fase=?, estadio=?, ciudad=?, capacidad=? WHERE id=?";

        try(Connection conn = connFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, partido.getEquipo_local());
            ps.setString(2, partido.getEquipo_visitante());
            ps.setDate(3, java.sql.Date.valueOf(partido.getFecha()));
            ps.setString(4, partido.getHora());
            ps.setString(5, partido.getFase());
            ps.setString(6, partido.getEstadio());
            ps.setString(7, partido.getCiudad());
            ps.setInt(8, partido.getCapacidad());
            ps.setInt(9, partido.getId());

            ps.executeUpdate();

            return true;

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean cambiarEstado(int id, String estado) {

        String sql = "UPDATE partido SET estado = ? WHERE id = ?";

        try(Connection conn = connFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, estado);
            ps.setInt(2, id);

            ps.executeUpdate();

            return true;

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}