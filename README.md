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
  - Generar registró propio de manera automatica, con nuestra información personal.
 ___
## Solución Propuesta
 
### Estructura del programa
En primer lugar se implementó la logica, para ello se creo la clase `Persona` que mapeaba los campos del csv como atributos; cabe resaltar que como se tenía que exportar el CSV en el mismo formato con el que entró, tambien se hizo necesario almacenar las iniciales del Sexo y los codigos asociados a las ciudades. Luego se implementó la clase `Gestionador` encargada de almacenar la __lista__ de personas y calcular dinamicamente (Cada vez que se actualizará la misma) los totales necesarios para generar los informes.
<p align="center">
  <img src="https://github.com/user-attachments/assets/3a95503b-83f1-44ea-a94e-edd8e46dd21b">
</p>

### Logica del sistema
De ahí se implementarón las vistas, donde la vista principal siendo influenciada por el lenguaje HTML fue nombrada `index`, la cual inicializaba el `gestionador`, leía el CSV y si este era valido cargaba sus datos en la tabla debajo del menú principal.

<p align="center">
  <img src="https://github.com/user-attachments/assets/51e08b54-090a-419a-a0a5-490c6c1eca23">
</p>

La logica del sistema se centrá enteramente en la clase `Gestionador`, pues es gracias a los atributos y metodos de esta que se pueden crear y actualizar facilmente los diagramas de torta utilizados para representar los datos. Estos graficos se implementaron usando la librería `JFreeChart` y obteniendo estos resultados:

<p align="center">
  <img src="https://github.com/user-attachments/assets/99fb77bd-d7b2-4f7c-87c4-4150dadbe031">
</p>

### Soluciones "Ingeniosas"

### ¿Como ejecutar el Software?

___
## Features del Software

___
## Trabajo Futuro
