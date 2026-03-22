ENTREGA DE
PROYECTO DE
PROGRAMACIÓN
ESCUELA TÉCNICA DE SANTA ROSA
1° BT TECNOLOGÍAS DE LA INFORMACIÓN
PROF. JHON LIENCRES



Integrantes:
1. Juan Manuel Chaparro Gomez (C.I: --------)
2. Enzo Emiliano Díaz Rossi (C.I: --------)


1Proyecto Final – Programación – Escuela Técnica de Santa Rosa – Juegos de Consola
Juegos Elegidos
1. Piedra, Papel o Tijera
2. Adivina el número
Requisitos Implementados
Mínimos:
1. Menú principal y submenús implementados con switch, con navegación clara y control de
opciones inválidas.
2. Uso de arreglos para representar estados y/o puntajes de los juegos. (Se utiliza un arreglo
para almacenar los últimos cinco números utilizados para descifrar el número secreto
en el Juego Adivina El Número Secreto).
3. Al menos 5 métodos propios, excluyendo Main(Nuestro programa contiene 6 métodos
propios, 7 si se incluye al Main) que organicen la lógica en tareas claras (inicialización,
turnos, verificación de estado, reportes, etc.).
4. Validaciones de entrada con if/else y re-intentos cuando corresponde.
5. Lógica correcta de cada juego: reglas implementadas, detección de fin de partida/ronda.
6. Al menos 2 Estadísticas o reportes totales (Nuestro programa incluye 4 Estadísticas por
juego; En el caso del Piedra, Papel o Tijera: Partidas Jugadas Hasta Ahora, Victorias,
Empates, Derrotas; En el caso de Adivina el número secreto: Partidas Jugadas Hasta
Ahora, Victorias, Ultimas Cinco Jugadas , Intentos Hasta Adivinar) usando recorridos
de arreglos (se utiliza solo un arreglo, para guardar las ultimas cinco jugadas en
Adivina El Número Secreto) y condicionales (ej.: top 3 puntajes, victorias/derrotas,
promedios).
7. Mensajes claros por consola y manejo de errores de uso (opción invalida, valores fuera de
rango, arreglos vacíos).
8. Documentación completa.
9. El Programa debe compilar y ejecutarse correctamente.
10. No usar librerias externas ni contenidos fuera de los materiales.
2Proyecto Final – Programación – Escuela Técnica de Santa Rosa – Juegos de Consola
Complementarios:
1. Múltiples niveles de dificultad en al menos un juego (+0,5 (Cinco Niveles de Dificultad
añadidos en Adivina El Número Secreto: Fácil,Medio,Medio-Difícil,Difícil,Ultra
Difícil))
2. Estadísticas ampliadas con arreglos y recorridos (totales por juego, promedios, top 3
puntajes, rachas) (+1).
3. Persistencia Temporal en memoria durante la ejecución con historial de partidas (arreglos
que guarden últimos N Resultados (Aplicado en el juego Adivina El Número Secreto: se
usa un arreglo para guardar los últimos cinco números que se digitaron para adivinar
el número secreto)) (+1).
4. Submenús y navegación robusta (volver atrás, confirmar salida, re-intentos) (+0,5).
5. Reportes comparativos entre los dos juegos (promedios, rachas, mejores resultados) (+0,5).
Requisitos No Implementados
1. No se aplicó nivel de dificultad en el juego Piedra, Papel o Tijera (Si en el juego Adivina El
Numero Secreto) (+ 0,5 en un juego, +1 en ambos)
2. Generador o selección de contenidos con arreglos (categorias de palabras en
Ahorcado;secuencias sin repetir en rangos simples) (+1).
3. Ítem de Investigacion: Ordenamiento manual para rankings con un algoritmo clasico
implementado por ustedes sobre arreglos (Por ejemplo, Bubble Sort), Con una breve
explicacion en el README y defensa clara del mismo (+1,5 , Fuera de Materiales).
Guía de uso
Para ejecutar el programa, siga los siguientes pasos:
1. Descargue el archivo .java
2. Ábralo en su IDE de Preferencia (Visual Studio Code, Jdoodle, IntelliJ Idea, etc.)
3. Ejecutá el programa haciendo clic en RUN, EXECUTE o el que corresponde según el IDE.
4. Esperar que el programa compile.
5. Ingrese su nombre.
6. Selecciona una opción del 1 al 4 ( 1: Piedra, Papel o Tijera; 2: Adivina el número secreto; 3:
Ver estadísticas de esta sesión; 4: Salir).
3Proyecto Final – Programación – Escuela Técnica de Santa Rosa – Juegos de Consola
7. Confirme a través de 1 para ingresar a la opción seleccionada o 0 Para Retornar al menú
Principal.
7.1 Piedra, Papel o Tijera.
Ingrese su opción preferida
1. Piedra
2. Papel
3. Tijera
Se le informara en caso de que halla Ganado, Perdido o empatado contra la maquina.
Confirme a través de 1 si quiere seguir jugando o 0 si desea retornar al menú principal.
-----------------------------------------------------------------------------------------------------------------
7.2 Adivina el número secreto
Selecciona en el menú el nivel de dificultad que desea jugar.
1. Fácil -> 0 a 10
2. Medio -> 0 a 50
3. Medio-Difícil -> 0 a 100
4. Difícil -> 0 a 500
5. Ultra Difícil -> 0 a 1000
Proceda a elegir un número desde 0 hasta el rango seleccionado
¡Trate de Adivinar el número!
Una vez lo halla adivinado, en caso de querer seguir jugando presiona 1, en caso contrario
presiona 0
---------------------------------------------------------------------------------------------------------------
7.3 Estadísticas
Va a encontrar las siguientes estadísticas:
Piedra, Papel, Tijera:
- Partidas Jugadas Hasta Ahora
- Victorias
- Empates
- Derrotas
4Proyecto Final – Programación – Escuela Técnica de Santa Rosa – Juegos de Consola
Adivina el número secreto:
- Partidas Jugadas Hasta Ahora
- Victorias
- Ultimas Cinco Jugadas
- Intentos Hasta Adivinar
En caso de querer volver a ver las estadísticas presiona 1, si quiere volver al Menú Principal
presione 0.
---------------------------------------------------------------------------------------------------------------
7.4 Salir
Confirme que desea salir con 1, en caso de querer volver al Menú Principal digita 0.
---------------------------------------------------------------------------------------------------------------
En caso de querer volver a ejecutar este programa, vuelva a ejecutarlo.
Limitaciones Conocidas
1. No es posible utilizar letras en los momentos de selección de juego y del juego en si, solo se
podrán utilizar letras al principio de la ejecución, cuando se le solicita el nombre al usuario.
2. En el juego Adivina El Número Secreto , una vez seleccionado el nivel de dificultad, no va
a ser posible volver a elegir otro nivel de dificultad hasta haber adivinado el número secreto.
3. Utiliza unicamente números del tipo entero (Sin coma, ej.: 1,2,3,4…) ya que las variables
que se utilizan están definidas para aceptar ese tipo de números. Evite usar números con
decimales (Del tipo double o float) como por ejemplo: 1.2 , 3.7 , 10.2 , 13.2 … , ya que el
programa dejará de funcionar.
Confirmación de compliación
•
Si, se compila y ejecuta correctamente, de acuerdo a los requisitos establecidos.
