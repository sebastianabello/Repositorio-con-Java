package org.sabello.poointerfaces.repositorio;

import org.sabello.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);

}
