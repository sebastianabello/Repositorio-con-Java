package org.sabello.poointerfaces;

import org.sabello.poointerfaces.modelo.Cliente;
import org.sabello.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRespositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Luci", "Gonzales"));
        repo.crear(new Cliente("sebas", "Abello"));
        repo.crear(new Cliente("Sofia", "Gutierrez"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===========Paginable===============");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);
        System.out.println("===========Ordenar===============");
        List<Cliente> clienteOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);
        for (Cliente c : clienteOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("===========Editar===============");
        Cliente luciActualizar = new Cliente("Luci", "Martinez");
        luciActualizar.setId(2);
        repo.editar(luciActualizar);
        Cliente luci = repo.porId(2);
        System.out.println(luci);

    }
}
