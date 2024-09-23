package ReactSpringB.RRHH.repositorio;

import ReactSpringB.RRHH.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {
}
