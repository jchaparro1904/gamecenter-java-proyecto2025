
// === Realizado por Juan Chaparro y Enzo Díaz  
import java.util.Random;
import java.util.Scanner;

public class gameCenterChaparroYDiaz {

    // Metodo para mostrar el menu principal

    public static void menu(String nombreUsuario) {
        System.out.println("==========================================");
        System.out.println("BIENVENIDO AL GAME CENTER: " + nombreUsuario);
        System.out.println("==========================================");
        System.out.println("Elija una opción:");
        System.out.println("1) ¡Piedra, Papel o Tijera!");
        System.out.println("2) Adivina el número secreto");
        System.out.println("3) Ver estadísticas de esta sesión");
        System.out.println("4) SALIR del Game Center");
        System.out.print("Ingrese su opción: ");

    }

    // === Método para pedir el nombre del usuario
    public static String obtenerNombre(Scanner teclado) {
        System.out.println("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine();
        return nombre;
    }

    // === Método del menú de Piedra, Papel o Tijera
    // === * PPT = Piedra, Papel o Tijera
    public static void pptMenu() {
        System.out.println("Ingrese su opción:");
        System.out.println("1) Piedra");
        System.out.println("2) Papel");
        System.out.println("3) Tijera");
    }

    // === Método del menú de Adivina el número secreto
    public static void adivinaElNumeroSecretoMenu() {
        System.out.println("Elija un nivel de acuerdo a la dificultad que desea jugar:");
        System.out.println("1) Fácil -> 0 a 10");
        System.out.println("2) Medio -> 0 a 50");
        System.out.println("3) Medio-Difícil -> 0 a 100");
        System.out.println("4) Difícil -> 0 a 500");
        System.out.println("5) Ultra Difícil -> 0 a 1000");
    }

    // === Método de comparación para Adivina el número secreto
    public static int comparacionEnAdivinaElNumero(Scanner teclado, int maximo, Random ran,
            int[] ultimasCincoJugadasEnAdivinaElNumero, int intentosAdivinaElNumeroSecreto,
            int partidasJugadasEnAdivinaElNumeroSecreto) {

        int secreto = ran.nextInt(maximo + 1);
        int usuario = -1;

        System.out.println("Elija un número entre 0 y " + maximo);

        while (usuario != secreto) {
            usuario = teclado.nextInt();

            // === Mover las jugadas
            for (int i = 0; i < ultimasCincoJugadasEnAdivinaElNumero.length - 1; i++) {
                ultimasCincoJugadasEnAdivinaElNumero[i] = ultimasCincoJugadasEnAdivinaElNumero[i + 1];
            }
            ultimasCincoJugadasEnAdivinaElNumero[ultimasCincoJugadasEnAdivinaElNumero.length - 1] = usuario;

            if (usuario > secreto) {
                System.out.println("Intente más bajo");
                intentosAdivinaElNumeroSecreto++;
            } else if (usuario < secreto) {
                System.out.println("Intente más alto");
                intentosAdivinaElNumeroSecreto++;
            } else {
                System.out.println("¡Correcto!");
                partidasJugadasEnAdivinaElNumeroSecreto++;
            }

            if (usuario < 0) {
                System.out.println("No es posible ingresar número menor a 0. Pruebe con un número entre 0 y " + maximo);
            } else if (usuario > maximo) {
                System.out.println("Pruebe con un número dentro del rango de 0 a " + maximo);
            }
        }

        return intentosAdivinaElNumeroSecreto;
    }

    // === Metodo para sumar partidas jugadas
    public static int sumarPartidas(int partidasJugadas) {
        partidasJugadas++;
        return partidasJugadas;
    }

    // === Método principal
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ran = new Random();

        int menuPrincipal = 0;
        String nombreUsuario = obtenerNombre(teclado);

        int pptVictoriasEnEstaSesion = 0;
        int pptEmpatesEnEstaSesion = 0;
        int pptDerrotasEnEstaSesion = 0;

        int adivinaElNumeroSecretoVictorias = 0;
        int[] ultimasCincoJugadasEnAdivinaElNumero = new int[5];
        int intentosAdivinaElNumeroSecreto = 0;
        int partidasJugadasEnAdivinaElNumeroSecreto = 0;
        int partidasJugadasEnPapelPiedraoTijera = 0;

        int controlDePartidas = 0;// reemplazo del metodo confirmar

        while (menuPrincipal == 0) {
            menu(nombreUsuario);
            int opcion = teclado.nextInt();

            switch (opcion) {

                case 1: // Piedra , Papel o Tijera

                    int control = 1;
                    System.out.println("Elegiste jugar Piedra, Papel o Tijera.");
                    while (control != 0) {
                        System.out.println("Confirme: 1 = Jugar / 0 = Volver al Menu Principal");
                        controlDePartidas = teclado.nextInt();

                        int continuarPartidaPPT = 0;

                        if (controlDePartidas == 1) {
                            System.out.println("Iniciando el juego...");
                            continuarPartidaPPT = 1;

                            while (continuarPartidaPPT == 1) {

                                pptMenu();
                                int usuario = teclado.nextInt();
                                int maquina = ran.nextInt(3) + 1;

                                if (usuario == maquina) {
                                    System.out.println("¡Empate!");
                                    pptEmpatesEnEstaSesion++;
                                } else if ((usuario == 1 && maquina == 3)
                                        || (usuario == 2 && maquina == 1)
                                        || (usuario == 3 && maquina == 2)) {
                                    System.out.println("¡Ganaste!");
                                    pptVictoriasEnEstaSesion++;
                                } else if ((usuario == 3 && maquina == 1)
                                        || (usuario == 1 && maquina == 2)
                                        || (usuario == 2 && maquina == 3)) {
                                    System.out.println("Perdiste :(");
                                    pptDerrotasEnEstaSesion++;
                                } else {
                                    System.out.println("Número equivocado, reintente");
                                    usuario = 0;
                                }

                                if (maquina == 1 && usuario > 0 && usuario < 4) {
                                    System.out.println("La máquina eligió: Piedra");
                                } else if (maquina == 2 && usuario > 0 && usuario < 4) {
                                    System.out.println("La máquina eligió: Papel");
                                } else if (maquina == 3 && usuario > 0 && usuario < 4) {
                                    System.out.println("La máquina eligió: Tijera");
                                }
                                partidasJugadasEnPapelPiedraoTijera = sumarPartidas(
                                        partidasJugadasEnPapelPiedraoTijera);

                                System.out.println("¿Quieres seguir jugando a Piedra, Papel o Tijera?");
                                System.out.println("1 = Sí | 0 = No");
                                continuarPartidaPPT = teclado.nextInt();
                                control = continuarPartidaPPT;
                            }
                        } else if (controlDePartidas == 0) {
                            System.out.println("Volviendo al menú principal...");
                            control = 0;
                        }
                    }
                    break;

                case 2: // === Adivina El Numero Secreto
                    System.out.println("Elegiste jugar Adivina el número secreto.");
                    int control2 = 1;
                    while (control2 != 0) {

                        int maximo = 0;
                        System.out.println("Confirme: 1 = Jugar / 0 = Volver al Menu Principal");
                        controlDePartidas = teclado.nextInt();
                        if (controlDePartidas == 1) {
                            System.out.println("Iniciando el juego...");
                            adivinaElNumeroSecretoMenu();

                            int eleccionMenuNumSecreto = teclado.nextInt();

                            switch (eleccionMenuNumSecreto) {
                                case 1:
                                    maximo = 10;
                                    break;
                                case 2:
                                    maximo = 50;
                                    break;
                                case 3:
                                    maximo = 100;
                                    break;
                                case 4:
                                    maximo = 500;
                                    break;
                                case 5:
                                    maximo = 1000;
                                    break;
                                default:
                                    System.out.println("Opción equivocada.");
                                    maximo = 0;
                            }

                            if (maximo > 0) {
                                intentosAdivinaElNumeroSecreto = comparacionEnAdivinaElNumero(teclado, maximo, ran,
                                        ultimasCincoJugadasEnAdivinaElNumero, intentosAdivinaElNumeroSecreto,
                                        partidasJugadasEnAdivinaElNumeroSecreto);

                                adivinaElNumeroSecretoVictorias++;
                                partidasJugadasEnAdivinaElNumeroSecreto = sumarPartidas(
                                        partidasJugadasEnAdivinaElNumeroSecreto);

                                partidasJugadasEnPapelPiedraoTijera = sumarPartidas(
                                        partidasJugadasEnPapelPiedraoTijera);

                            }

                            System.out.println("Volviendo al menú principal...");
                        } else if (controlDePartidas == 0) {
                            System.out.println("Volviendo al menú principal...");
                            control2 = 0;

                        }
                    }
                    break;

                case 3: // === Estadisticas
                    System.out.println("Ver estadísticas de la sesión.");
                    int control3 = 1;
                    while (control3 != 0) {

                        System.out.println("Confirme: 1 = Ver Estadisticas / 0 = Volver al Menu Principal");
                        controlDePartidas = teclado.nextInt();
                        if (controlDePartidas == 1) {
                            System.out.println("Mostrando estadísticas... ");
                            System.out.println("=== Estadísticas de Piedra, Papel o Tijera ===");
                            System.out.println("Partidas Jugadas hasta ahora: " + partidasJugadasEnPapelPiedraoTijera);
                            System.out.println("Victorias: " + pptVictoriasEnEstaSesion);
                            System.out.println("Empates: " + pptEmpatesEnEstaSesion);
                            System.out.println("Derrotas: " + pptDerrotasEnEstaSesion);
                            System.out.println("==============================================");
                            System.out.println("=== Estadísticas de Adivina el número secreto ===");
                            System.out.println(
                                    "Partidas Jugadas hasta ahora: " + partidasJugadasEnAdivinaElNumeroSecreto);
                            System.out.println("Victorias: " + adivinaElNumeroSecretoVictorias);
                            System.out.println("Últimas cinco jugadas:");
                            for (int j = 0; j < ultimasCincoJugadasEnAdivinaElNumero.length; j++) {
                                System.out.println("- " + ultimasCincoJugadasEnAdivinaElNumero[j]);
                            }
                            System.out.println("Intentos hasta adivinar: " + intentosAdivinaElNumeroSecreto);
                        } else if (controlDePartidas == 0) {
                            System.out.println("Volviendo al menú principal...");
                            control3 = 0;
                        }

                    }
                    break;

                case 4: // === Salir del juego
                    System.out.println("¿Deseas salir del Game Center?");
                    int control4 = 1;
                    while (control4 != 0) {

                        System.out.println("Confirme: 1 = Salir / 0 = Volver al Menu Principal");
                        controlDePartidas = teclado.nextInt();
                        if (controlDePartidas == 1) {
                            System.out.println("¡Hasta pronto, " + nombreUsuario + "!");
                            menuPrincipal = 1;
                            control4 = 0;
                        } else if (controlDePartidas == 0) {
                            System.out.println("Volviendo al menú principal...");
                            control4 = 0;
                        }
                    }
                    break;

                default: // === Opcion Invalida
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }

        teclado.close();
    }
}