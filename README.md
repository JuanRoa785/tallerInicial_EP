# Taller Inicial - Entornos de Programación - Universidad Industrial De Santander
### Descripción del repositorio:
Pequeño repositorio creado con el objetivo de almacenar la solución de un pequeño taller introductorio de la asignatura "Entornos de Programación" de la UIS.
___
## Requerimientos Funcionales
- Leer y traducir el archivo `chicos.csv`, para mostrarlo en formato __tabla__:
  - Identificar la ciudad a partir de su equivalente númerico.
  - Mostrar `Masculino` o `Femenino` según la inicial que corresponda.
- Generar __informes__ sencillos:
  - Total de estudiantes por ciudad.
  - Total de estudiantes por sexo.
  - Total de estudiantes por grupo de Edad.
- Operaciones de __CRUD__:
  - Añadir nuevos estudiantes.
  - Actualizar estudiantes ya existentes.
  - Eliminar estudiantes.
- Exportar los datos actualizados en un nuevo __CSV__:
  - Generar registró propio de manera automática, con nuestra información personal.
 ___
## Solución Propuesta
 
### Estructura del programa
En primer lugar se implementó la lógica del sistema, para ello se creo la clase `Persona` que mapeaba los campos del csv como atributos; cabe resaltar que como se tenía que exportar el CSV en el mismo formato con el que entró, tambien se hizo necesario almacenar las iniciales del Sexo y los códigos asociados a las ciudades. Luego se implementó la clase `Gestionador` encargada de almacenar la __lista__ de personas y calcular dinámicamente (Cada vez que se actualizará la misma) los totales necesarios para generar los informes.
<p align="center">
  <img src="https://github.com/user-attachments/assets/3a95503b-83f1-44ea-a94e-edd8e46dd21b">
</p>

Luego, se optó por hacer una interfaz gráfica, aprovechando las facilidades que tiene Netbeans para crearla. Inicialmente se quería manejar todo en el mismo JFrame, pero por simplicidad se crearon 3 diferentes:

-  __Index__: Es la vista principal del sistema, fue influenciada por el lenguaje HTML y de ahí nació su nombre. Tiene el menú por medio del cual se accede al resto de funcionalidades del sistema. Ademas, contiene la tabla en la que se muestra toda la información del CSV junto con los cambios que haga el usuario durante la ejecución.
-  __Reporte__: Es un JFrame sencillo que muestra 3 diagramas de tarta implementados por medio de la librerìa `JFreeChart` que contienen los totales por ciudad, edad y sexo.
-  __Operaciones__: JFrame en el cual se muestra un menú sencillo donde se puede buscar un estudiante a partir de su código, eliminarlo, editar su información o en caso de que el usuario lo requiera, añadir nuevos estudiantes.

### ¿Como ejecutar el Software?
Una alternativa es clonar el repositorio, y ejecutar el proyecto en Netbeans, para ello lo unico que necesitaría sería descargar la libreria de `JFreeChart` del siguiente enlace: 

__JFreeChart__: https://www.mediafire.com/file/oknz7i6p3usrue0/jfreechart-1.0.19.zip 

---

Otra alternativa es ejectutar directamente el .jar en el que se compiló el sistema, para ello deberá acceder al siguiente directorio:

 ```
   /RutaRepoClonado/tallerInicial/dist
 ```
Luego, si está en __Windows__, será tan sencillo como ejecutar el .jar. 

En caso de que esté en __Ubuntu__, deberá abrir una terminal, ubicarse en el directorio anterior usando el comando `cd` y ejecutar el siguiente comando:

```
   java -jar tallerInicial.jar
 ```

### Sistema en ejecución
El software no carga por defecto el archivo `chicos.csv`, es tarea del usuario el seleccionarlo, sin embargo el sistema si hace verificaciones básicas como no dejar exportar un csv vacio, o mostrar el reporte aunque no se haya cargado ningún dato. En el caso de que el usuario seleccione un archivo que no __contenga__ en su nombre la cadena de texto de "chicos.csv", se mostrará un feedback por medio de un `JOptionPane` y no se cargará nada. Finalmente, cuando se seleccioné un archivo valido se mostrarán sus datos de la siguiente manera y se desbloquearán el resto de funcionalidades: 

<p align="center">
  <img src="https://github.com/user-attachments/assets/51e08b54-090a-419a-a0a5-490c6c1eca23">
</p>
 
Al consumir los atributos y los métodos de la instancia de la clase `Gestionador` que se crea al cargar un archivo valido en el sistema, y por medio de la librería `JFreeChart` se generan los siguientes diagramas de torta: 

<p align="center">
  <img src="https://github.com/user-attachments/assets/99fb77bd-d7b2-4f7c-87c4-4150dadbe031">
</p>

Cabe resaltar que cada cambio que se haga por medio del JFrame operaciones, se verá reflejado en el JFrame reporte, y que no se podrá hacer ningún cambio en el csv mientras que la ventana del reporte este ejecutándose (esté abierta).   

Respecto al JFrame operaciones, tiene un buscador que busca en base al codigo del estudiante, en caso de que no encuentre coincidencias, devolverá un feedback en rojo, debajo del JTextField. En caso de que efectivamente encuentré al estudiante, se cargarán los datos en el "modulo" inferior y se inhabilitará el JTextField para actualizar el codigo, pues este atributo hace de `Primary Key` para nuestro sistema. El JFrame se ve así:

<p align="center">
  <img src="https://github.com/user-attachments/assets/326a130a-eebb-4426-85e8-f665543d75f8" width="45%">
  <img src="https://github.com/user-attachments/assets/05d33211-6ed1-441f-9cc4-dab4e1ab163d" width="45%">
</p>

Para hacer las operaciones del __CRUD__ se manejaròn multiples verificaciones, para asegurar que los campos nùmericos efectivamente lo fueran y que ningùn campo quedarà en blanco, tambièn se limito el codigo a que su longitud fuera de 7 digitos. Independientemente de la operaciòn se darà un feedback al usuario, por ejemplo al eliminar a un estudiante se debe digitar su codigo en el buscador (idealmente se deberìa verificar que el estudiante es el correcto cargando sus datos, pero no es obligatorio) luego al clickear el boton `eliminar` se mostrarìa un JOptionPane donde le pide confirmaciòn y si el proceso es exitoso se reiniciarìan los campos por defecto. Para las operaciones de agregar estudiante o actualizar sus datos, el feedback es mas directo simplemente un mensaje debajo del campo de ciudad.

<p align="center">
  <img src="https://github.com/user-attachments/assets/cb6de588-830c-4d80-b93a-e65bd20baa08" width="45%">
  <img src="https://github.com/user-attachments/assets/e19c5993-d4e8-43e1-8ead-e9208e682329" width="45%">
</p>


### Soluciones "Ingeniosas"


___
## Features del Software

___
## Trabajo Futuro
