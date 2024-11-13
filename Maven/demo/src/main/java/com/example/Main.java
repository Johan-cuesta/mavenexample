package com.example;
import com.example.Entidad.Empleado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setEdad(30);

        em.persist(empleado);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}