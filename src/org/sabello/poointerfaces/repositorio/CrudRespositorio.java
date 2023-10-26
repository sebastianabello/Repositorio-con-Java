package org.sabello.poointerfaces.repositorio;

import org.sabello.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRespositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
