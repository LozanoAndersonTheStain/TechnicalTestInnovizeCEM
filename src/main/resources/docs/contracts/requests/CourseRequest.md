# Clase CourseRequest

### Descripción
La clase `CourseRequest` representa la estructura de los datos necesarios para crear o actualizar un curso.

## Campos

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

- **`toEntity()`**
  - **Descripción:** Convierte el objeto `CourseRequest` a un objeto `CourseEntity`.
  - **Retorno:** Devuelve un objeto `CourseEntity` con los datos del curso.