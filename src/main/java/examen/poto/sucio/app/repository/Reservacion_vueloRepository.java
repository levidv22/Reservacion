package examen.poto.sucio.app.repository;

import examen.poto.sucio.infraestructure.entity.reservacion_vueloEntity;
import java.util.List;

public interface Reservacion_vueloRepository {
    List<reservacion_vueloEntity> getReservation(); //listando las reservaciones
    reservacion_vueloEntity getReservationById(Integer id);//llamando a las reservaciones por id
    reservacion_vueloEntity saveReservation(reservacion_vueloEntity reservationEntity);//crear y actualizar
    boolean deleteReservationById(Integer id); //eliminar reservaciones por id
}
