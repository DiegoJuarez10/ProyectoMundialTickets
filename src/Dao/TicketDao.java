/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexion.CreateConnection;
import Modelo.TicketModelo;
import Modelo.TicketPartidoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author yorch
 */
public class TicketDao {

    String qry = "";
    CreateConnection cn = new CreateConnection();

    // Metodo para insertar
    public boolean insertar(TicketModelo tic) {

        qry = "INSERT INTO public.ticket "
                + "(Partido_id, Numero_asiento, Seccion, Precio, Estado) "
                + "VALUES(?,?,?,?,?)";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);

            ps.setInt(1, tic.getPartido_id());
            ps.setString(2, tic.getNumero_asiento());
            ps.setString(3, tic.getSeccion());
            ps.setDouble(4, tic.getPrecio());
            ps.setString(5, tic.getEstado());

            ps.executeUpdate();
            ps.close();

            return true;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return false;
        }
    }

    // Metodo actualizar
    public boolean actualizar(TicketModelo tic) {

        qry = "UPDATE public.ticket SET "
                + "Partido_id=?, "
                + "Numero_asiento=?, "
                + "Seccion=?, "
                + "Precio=?, "
                + "Estado=?, "
                + "Fecha_partido=? "
                + "WHERE id=?";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);

            ps.setInt(1, tic.getPartido_id());
            ps.setString(2, tic.getNumero_asiento());
            ps.setString(3, tic.getSeccion());
            ps.setDouble(4, tic.getPrecio());
            ps.setString(5, tic.getEstado());
            ps.setTimestamp(6, Timestamp.valueOf(tic.getFecha_partido()));
            ps.setInt(7, tic.getId());

            ps.executeUpdate();
            ps.close();

            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    // Metodo cambiar estado
    public boolean cambiarEstado(String estado, int id) {

        qry = "UPDATE public.ticket SET estado=? WHERE id=?";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);

            ps.setString(1, estado);
            ps.setInt(2, id);

            ps.executeUpdate();
            ps.close();

            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    // Metodo listar
    public List<TicketModelo> listar() {

        List<TicketModelo> lista = new ArrayList<>();

        qry = "SELECT * FROM public.ticket";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                TicketModelo tic = new TicketModelo();

                tic.setId(rs.getInt("id"));
                tic.setPartido_id(rs.getInt("partido_id"));

                Timestamp fecha = rs.getTimestamp("fecha_partido");

                if (fecha != null) {
                    tic.setFecha_partido(fecha.toLocalDateTime());
                }

                tic.setNumero_asiento(rs.getString("numero_asiento"));
                tic.setSeccion(rs.getString("seccion"));
                tic.setPrecio(rs.getDouble("precio"));
                tic.setEstado(rs.getString("estado"));

                lista.add(tic);
            }

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return lista;
    }

    // Metodo JOIN Ticket + Partido
    public List<TicketPartidoDTO> obtenerTicketsconPartido() {

        List<TicketPartidoDTO> lista = new ArrayList<>();

        qry = "SELECT "
                + "t.id AS ticket_id, "
                + "t.numero_asiento, "
                + "t.seccion, "
                + "t.precio, "
                + "t.estado, "
                + "p.id AS partido_id, "
                + "p.equipo_local, "
                + "p.equipo_visitante, "
                + "p.fecha, "
                + "p.hora, "
                + "p.fase, "
                + "p.estadio "
                + "FROM public.ticket t "
                + "INNER JOIN public.partido p "
                + "ON t.partido_id = p.id";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                TicketPartidoDTO dto = new TicketPartidoDTO(
                        rs.getInt("ticket_id"),
                        rs.getString("numero_asiento"),
                        rs.getString("seccion"),
                        rs.getDouble("precio"),
                        rs.getString("estado"),
                        rs.getInt("partido_id"),
                        rs.getString("equipo_local"),
                        rs.getString("equipo_visitante"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getString("hora"),
                        rs.getString("fase"),
                        rs.getString("estadio")
                );

                lista.add(dto);
            }

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return lista;
    }

    // Metodo eliminar
    public boolean eliminar(int id) {

        qry = "DELETE FROM public.ticket WHERE id=?";

        try {

            Connection con = cn.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);

            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();

            return true;

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }
}