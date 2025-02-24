# Clase TeacherEntity

### Descripción
La clase `TeacherEntity` representa la estructura de los datos de un profesor en la base de datos.

## Campos

- **`id`**
  - **Descripción:** Identificador único del profesor.
  - **Tipo:** `Long`


- **`name`**
  - **Descripción:** Nombre del profesor.
  - **Tipo:** `String`


- **`document`**
  - **Descripción:** Documento de identificación del profesor.
  - **Tipo:** `String`


- **`email`**
  - **Descripción:** Correo electrónico del profesor.
  - **Tipo:** `String`


- **`rolUser`**
  - **Descripción:** Rol del usuario (profesor).
  - **Tipo:** `RolUser`


- **`courses`**
  - **Descripción:** Lista de cursos asociados al profesor.
  - **Tipo:** `List<CourseEntity>`


## Métodos

- **`toResponse()`**
  - **Descripción:** Convierte el objeto `TeacherEntity` a un objeto `TeacherResponse`.
  - **Retorno:** Devuelve un objeto `TeacherResponse` con los datos del profesor.