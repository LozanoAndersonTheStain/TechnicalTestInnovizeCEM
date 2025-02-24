# Clase CourseEntity

### Descripción
La clase `CourseEntity` representa la estructura de los datos de un curso en la base de datos.

## Campos

- **`id`**
  - **Descripción:** Identificador único del curso.
  - **Tipo:** `Long`


- **`nameCourse`**
  - **Descripción:** Nombre del curso.
  - **Tipo:** `String`


- **`description`**
  - **Descripción:** Descripción del curso.
  - **Tipo:** `String`


- **`durationWeeks`**
  - **Descripción:** Duración del curso en semanas.
  - **Tipo:** `int`


- **`price`**
  - **Descripción:** Precio del curso.
  - **Tipo:** `double`


- **`startDate`**
  - **Descripción:** Fecha de inicio del curso.
  - **Tipo:** `Date`


- **`teacherId`**
  - **Descripción:** Identificador del profesor asociado al curso.
  - **Tipo:** `TeacherEntity`


## Métodos

- **`toResponse()`**
  - **Descripción:** Convierte el objeto `CourseEntity` a un objeto `CourseResponse`.
  - **Retorno:** Devuelve un objeto `CourseResponse` con los datos del curso.