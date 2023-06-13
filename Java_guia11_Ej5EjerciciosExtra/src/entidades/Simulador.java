package entidades;

import java.util.ArrayList;
import java.util.HashSet;

public class Simulador {

    public ArrayList generarAlumnos(ArrayList<Alumno> listaAlumnos, int cantAlu) {

        ArrayList<String> listaNombre = new ArrayList();

        ArrayList<String> listaDni = new ArrayList();
        String nombre;
        String apellido;

        // CREAR NOMBRES Y APELLIDOS
        for (int i = 0; i < 50; i++) {
            nombre = ("Nombre " + (int) (Math.random() * 50));
            apellido = ("Apellido " + (int) (Math.random() * 50));

            listaNombre.add(nombre + " " + apellido);
        }

        // CREAR DNI
        long dn;

        for (int i = 0; i < 50; i++) {

            dn = (long) ((Math.random() * 50000000) + 1000000);

            listaDni.add(Long.toString(dn));

        }

        for (int i = 0; i < cantAlu; i++) {
            Alumno alu = new Alumno();
            alu.setNombre(listaNombre.get(i));
            alu.setDni(listaDni.get(i));
            alu.setCantVotos(0);
            listaAlumnos.add(alu);

        }

        //     for (Alumno al : listaAlumnos) {
        //       System.out.println(al);
        // }
        return listaAlumnos;
    }

    public ArrayList votacion(ArrayList<Alumno> listaAlu) {
        int numVotado;
        int contVotos = 0;
        System.out.println("----------------------");
        System.out.println("----VOTACION----");
        System.out.println("-----------------------");
        System.out.println("");

        System.out.println("Cantidad de alumnos totales: " + listaAlu.size());
        System.out.println("---------------------------------------------");
        ArrayList<Voto> listaAlumnosVotos = new ArrayList();

        for (Alumno alumno : listaAlu) {

            // CREA ARRAYLIST DE LOS ALUMNOS VOTADOS POR EL ALUMNO
            ArrayList<Alumno> votos = new ArrayList();
            Voto vt = new Voto();

            vt.setAlu(alumno); // crea el objeto Voto con el alumno que le toca votar

            do {

                numVotado = (int) (Math.random() * listaAlu.size());

                //    System.out.println("Voto a: " + listaAlu.get(numVotado).getNombre());
                if (alumno.equals(listaAlu.get(numVotado))) {
                    //    System.out.println("Me estoy votando");

                } else if (votos.contains(listaAlu.get(numVotado))) {
                    //   System.out.println("ya lo vote");

                } else {
                    votos.add(listaAlu.get(numVotado));

                    int votosAux = listaAlu.get(numVotado).getCantVotos();
                    listaAlu.get(numVotado).setCantVotos(votosAux + 1);

                    contVotos++;
                }
            } while (contVotos < 3);

            contVotos = 0;
            vt.setAluVotados(votos);

            System.out.println("-----------------------------------");
            System.out.println("Votos definitivos del Alumno: " + alumno.getNombre());
            System.out.println("-----------------------------------");
            for (Alumno voto : votos) {
                System.out.println(voto.getNombre());
            }
            listaAlumnosVotos.add(vt);

        }
/*
        System.out.println("");
        System.out.println("Ultimo listado");
        for (Voto vv : listaAlumnosVotos) {
            System.out.println(vv);
        }
*/
return listaAlumnosVotos;

    }

}
