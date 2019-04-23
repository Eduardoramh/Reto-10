package practica.autoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lalor
 */
public class PracticaAutoo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        Renta[] rentas = new Renta[20];
        Automovil[] AutoLista = new Automovil[5];

        ArrayList<Renta> listaRentas = new ArrayList<Renta>();
        ArrayList<Automovil> listaAutomovil = new ArrayList<Automovil>();

        listaAutomovil.add(new Automovil(1234, "SDL", "Comun", 500, new Motor("134679", 500, 4), new Llanta("Monster", "195/15"), new Faros("Illumination", 5000)));
        listaAutomovil.add(new Automovil(4561, "SDH", "Comun", 700, new Motor("256947", 800, 8), new Llanta("Caspic", "165/13"), new Faros("Clasic", 3000)));
        listaAutomovil.add(new Automovil(7931, "SDG", "Deportivo", 1000, new Motor("FAST1234", 1200, 16), new Llanta("Rolls", "155/14"), new Faros("Round", 3500)));
        listaAutomovil.add(new Automovil(1367, "SDG", "Deportivo A", 1000, new Motor("FAST1234", 1200, 16), new Llanta("Rolls", "155/14"), new Faros("Round", 3500)));
        listaAutomovil.add(new Automovil(2564, "SDG", "Deportivo", 1000, new Motor("FAST1234", 1200, 16), new Llanta("Rolls", "155/14"), new Faros("Round", 3500)));

        System.out.println("Renta de automoviles S.A. de C.V.");

        do {
            System.out.println("Opciones disponibles:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < listaAutomovil.size(); i++) {
                        System.out.println(listaAutomovil.get(i).getIdAutomovil() + " " + listaAutomovil.get(i).getPrecioRentaD() + " " + listaAutomovil.get(i).getIdentificador() + " " + listaAutomovil.get(i).getTipoAutomovil());
                    }
                    break;
                case 2:

                    if (listaRentas.isEmpty()) {
                        System.out.println("No hay rentas registradas");
                    } else {
                        Iterator<Renta> lrentas = listaRentas.iterator();
                        while (lrentas.hasNext()) {
                            Renta r = (Renta) lrentas;
                            if (r.getStatus() == 1) {
                                Cliente usuario = r.getPersona();
                                System.out.println(usuario.getNombre() + " " + usuario.getNumLicencia());
                            }
                        }
                    }

                    break;
                case 3:

                    System.out.println("Datos de renta");
                    Cliente clienteA = new Cliente();
                    System.out.println("Indique nombre de usuario");
                    clienteA.setNombre(entrada.nextLine());
                    System.out.println("Indique direccion");
                    clienteA.setDireccion(entrada.nextLine());
                    System.out.println("Indique licencia");
                    clienteA.setNumLicencia(entrada.nextLine());
                    System.out.println("Indique teléfono");
                    clienteA.setNumTelefoco(entrada.nextLine());
                    System.out.println("Indique tipo de sangre");
                    clienteA.setTipoSangre(entrada.nextLine());

                    Automovil autoRenta = null;
                    do {
                        System.out.println("Indique ID automovil");
                        int idAutomovil = entrada.nextInt();

                        boolean idExiste = true;
                        for (int i = 0; i < listaAutomovil.size(); i++) {
                            if (listaAutomovil.get(i).getIdAutomovil() == idAutomovil) {
                                idExiste = true;
                            } else {
                                idExiste = false;
                            }
                        }

                        if (idExiste) {
                            Iterator<Automovil> lautos = listaAutomovil.iterator();
                            while (lautos.hasNext()) {
                                Automovil a = (Automovil) lautos;
                                if (a.getStatus() == 1 && a.getIdAutomovil() == idAutomovil) {
                                    autoRenta = a;
                                }
                            }
                        } else {

                        }
                        // Pendiente
                        if (autoRenta == null) {
                            System.out.println("El auto no existe o no está disponible");
                        }

                    } while (autoRenta != null);

                    System.out.println("Indique la cantidad de tiempo que va a rentar el auto");
                    int dias = entrada.nextInt();

                    Renta clienteRenta = new Renta(clienteA, autoRenta, new Date(), dias);

                    for (int i = 0; i < rentas.length; i++) {
                        if (rentas[i] == null) {
                            rentas[i] = clienteRenta;
                        }
                    }

                    break;
                case 4:

                    if (listaRentas.isEmpty()) {
                        System.out.println("No hay rentas registradas");
                    } else {
                        System.out.println("Indique el id del automovil");
                        int idAutomovil = entrada.nextInt();
                        boolean verificar = false;
                        for (int r = 0; r < listaRentas.size(); r++) {
                            if (listaRentas.get(r).getAutomovil().getIdAutomovil() == idAutomovil && listaRentas.get(r).getStatus() == 1) {
                                listaRentas.get(r).setStatus(2);
                                System.out.println("La renta se ha finalizado correctamente");
                                verificar = true;
                                break;
                            }
                        }

                    }

                    break;
                case 5:

                    if (listaAutomovil.isEmpty()) {
                        System.out.println("No hay automoviles registradas");
                    } else {
                        for (int r = 0; r < listaAutomovil.size(); r++) {
                            System.out.println(listaAutomovil.get(r).getIdentificador() + "" + listaAutomovil.get(r).getPrecioRentaD());
                        }
                    }
                    break;
                case 6:
                    if (listaRentas.isEmpty()) {
                        System.out.println("No hay automoviles registradas");
                    } else {
                        Date now = new Date();
                        for (int r = 0; r < listaRentas.size(); r++) {
                            //listaRentas.get(r).getFechaRegistro();
                            if (listaRentas.get(r).getFechaRegistro().compareTo(now) == 1) {
                                
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no disponible, intente en otra opcion");
                    break;
            }

        } while (opcion != 0);

    }

}
