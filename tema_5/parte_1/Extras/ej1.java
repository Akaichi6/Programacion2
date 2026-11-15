package tema_5.parte_1.Extras;

import java.util.Scanner;

public class ej1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String LUNES="LUNES", MARTES="MARTES", MIERCOLES="MIERCOLES", JUEVES="JUEVES",VIERNES="VIERNES", PROGRAMACION="PROGRAMACIÓN",BASE_DE_DATOS="BASE DE DATOS",LENGUAJE_DE_MARCAS="LENGUAJE DE MARCAS",SISTEMAS_IMFORMATICOS="SISTEMAS IMFORMATICOS", ROJO = "\u001B[31m", RESET = "\u001B[0m";

        System.out.print("Introduce un dia de la semana para saber que asignatura tienes a primera hora:");
        String dia = sc.nextLine().toUpperCase().trim();
            if (dia.equals(LUNES)){
                System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
            } else if (dia.equals(MARTES)) {
                System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
            }else if (dia.equals(MIERCOLES)) {
                System.out.println("\tLa asignatura que tienes a priera hora es: " + SISTEMAS_IMFORMATICOS);
            }else if (dia.equals(JUEVES)) {
                System.out.println("\tLa asignatura que tienes a priera hora es: " + BASE_DE_DATOS);
            }else if (dia.equals(VIERNES)) {
                System.out.println("\tLa asignatura que tienes a priera hora es: " + LENGUAJE_DE_MARCAS);
            } else {
                while (dia.equals("SABADO")|| dia.equals("DOMINGO")){
                    System.out.println(ROJO + "Introduce uno de los dias lectivos (De Lunes a Viernes)"+ RESET);
                    System.out.print("Introduce un dia de la semana para saber que asignatura tienes a primera hora: ");
                    dia = sc.nextLine().toUpperCase().trim();
                    if (dia.equals(LUNES)){
                        System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                    } else if (dia.equals(MARTES)) {
                        System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                    }else if (dia.equals(MIERCOLES)) {
                        System.out.println("\tLa asignatura que tienes a priera hora es: " + SISTEMAS_IMFORMATICOS);
                    }else if (dia.equals(JUEVES)) {
                        System.out.println("\tLa asignatura que tienes a priera hora es: " + BASE_DE_DATOS);
                    }else if (dia.equals(VIERNES)) {
                        System.out.println("\tLa asignatura que tienes a priera hora es: " + LENGUAJE_DE_MARCAS);
                    }
                }
            }
            System.out.print("Quieres comprobar algún día más?: ");
            String respuesta = sc.nextLine().toUpperCase().trim();
                while (respuesta.equals("SI")){
                    System.out.print("Introduce un dia de la semana para saber que asignatura tienes a primera hora:");
                    dia = sc.nextLine().toUpperCase().trim();
                        if (dia.equals(LUNES)){
                            System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                        } else if (dia.equals(MARTES)) {
                            System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                        }else if (dia.equals(MIERCOLES)) {
                            System.out.println("\tLa asignatura que tienes a priera hora es: " + SISTEMAS_IMFORMATICOS);
                        }else if (dia.equals(JUEVES)) {
                            System.out.println("\tLa asignatura que tienes a priera hora es: " + BASE_DE_DATOS);
                        }else if (dia.equals(VIERNES)) {
                            System.out.println("\tLa asignatura que tienes a priera hora es: " + LENGUAJE_DE_MARCAS);
                        }else {
                            while (dia.equals("SABADO")|| dia.equals("DOMINGO")){
                                System.out.println(ROJO + "Introduce uno de los dias lectivos (De Lunes a Viernes)"+ RESET);
                                System.out.print("Introduce un dia de la semana para saber que asignatura tienes a primera hora: ");
                                dia = sc.nextLine().toUpperCase().trim();
                                if (dia.equals(LUNES)){
                                    System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                                } else if (dia.equals(MARTES)) {
                                    System.out.println("\tLa asignatura que tienes a priera hora es: " + PROGRAMACION);
                                }else if (dia.equals(MIERCOLES)) {
                                    System.out.println("\tLa asignatura que tienes a priera hora es: " + SISTEMAS_IMFORMATICOS);
                                }else if (dia.equals(JUEVES)) {
                                    System.out.println("\tLa asignatura que tienes a priera hora es: " + BASE_DE_DATOS);
                                }else if (dia.equals(VIERNES)) {
                                    System.out.println("\tLa asignatura que tienes a priera hora es: " + LENGUAJE_DE_MARCAS);
                                }
                        }
                    }
                System.out.print("Quieres comprobar algún día más?: ");
                respuesta = sc.nextLine().toUpperCase().trim();
            }
        }
    }
