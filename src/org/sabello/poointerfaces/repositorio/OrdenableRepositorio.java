package org.sabello.poointerfaces.repositorio;

import org.sabello.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);
}
