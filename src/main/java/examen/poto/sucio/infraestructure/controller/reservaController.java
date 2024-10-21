package examen.poto.sucio.infraestructure.controller;

import examen.poto.sucio.app.service.Reservacion_vueloService;
import examen.poto.sucio.infraestructure.entity.reservacion_vueloEntity;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vuelo")
public class reservaController {

    private final Reservacion_vueloService reservacionService;

    public reservaController(Reservacion_vueloService reservacionService) {
        this.reservacionService = reservacionService;
    }

    @GetMapping("/list")
    public String showReservations(Model model) {
        List<reservacion_vueloEntity> reservaciones = reservacionService.getReservation();
        model.addAttribute("reservaciones", reservaciones);
        return "list_reservaciones"; // Redirecciona a la vista "list_reservaciones.html"
    }

    // Mostrar reservación por ID
    @GetMapping("/view/{id}")
    public String getReservationById(@PathVariable Integer id, Model model) {
        reservacion_vueloEntity reservacion = reservacionService.getReservationById(id);
        model.addAttribute("reservacion", reservacion);
        return "view_reservacion"; // Redirecciona a la vista "view_reservacion.html"
    }

    // Crear nueva reservación (GET - Mostrar formulario)
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("reservacion", new reservacion_vueloEntity());
        return "create_reservacion"; // Redirecciona a la vista "create_reservacion.html"
    }

    // Crear nueva reservación (POST - Guardar datos)
    @PostMapping("/create")
    public String saveReservation(@ModelAttribute reservacion_vueloEntity reservacion) {
        reservacionService.saveReservation(reservacion);
        return "redirect:/vuelo/list"; // Redirecciona a la lista de reservaciones después de crear
    }
    
    // Mostrar formulario para editar una reservación
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        reservacion_vueloEntity reservacion = reservacionService.getReservationById(id);
        model.addAttribute("reservacion", reservacion);
        return "edit"; // Retorna la vista 'edit.html'
    }

    // Eliminar reservación por ID
    @GetMapping("/delete/{id}")
    public String deleteReservationById(@PathVariable Integer id) {
        reservacionService.deleteReservationById(id);
        return "redirect:/vuelo/list"; // Redirecciona a la lista de reservaciones después de eliminar
    }

}
