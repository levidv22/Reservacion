package examen.poto.sucio.infraestructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "venta_vuelo")
public class reservacion_vueloEntity {
     // Atributos privados
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroVuelo;
    private String nombrePasajero;
    private LocalDateTime fechaVuelo;
    private LocalDateTime actualizarFvuelo;
    private String destino;
    private String origen;

    // Constructor vacio

    public reservacion_vueloEntity() {
    }
    
    // Constructor

    public reservacion_vueloEntity(Integer id, String numeroVuelo, String nombrePasajero, LocalDateTime fechaVuelo, LocalDateTime actualizarFvuelo, String destino, String origen) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.nombrePasajero = nombrePasajero;
        this.fechaVuelo = fechaVuelo;
        this.actualizarFvuelo = actualizarFvuelo;
        this.destino = destino;
        this.origen = origen;
    }
    
 
   
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public LocalDateTime getActualizarFvuelo() {    
        return actualizarFvuelo;
    }
    public void setActualizarFvuelo(LocalDateTime actualizarFvuelo) {
        this.actualizarFvuelo = actualizarFvuelo;    
    }


    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    // Getter y Setter para nombrePasajero
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    // Getter y Setter para fechaVuelo
    public LocalDateTime getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(LocalDateTime fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    // Getter y Setter para destino
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    // Getter y Setter para origen
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    
}
