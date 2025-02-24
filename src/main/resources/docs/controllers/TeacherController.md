# Clase TeacherController

### Descripción
La clase `TeacherController` es responsable de manejar las solicitudes HTTP relacionadas con los profesores en la aplicación. Utiliza el servicio `TeacherService` para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los profesores.

## Métodos

- **`getTeacherByID(Long id)`**
  - **Descripción:** Obtiene la información de un profesor por su ID.
  - **Parámetros:**
    - `id`: Identificador del profesor.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del profesor o un mensaje de error si no se encuentra.


- **`getAllTeachers()`**
  - **Descripción:** Obtiene la información de todos los profesores.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de todos los profesores.


- **`getTeacherByCourseName(String courseName)`**
  - **Descripción:** Obtiene la información de los profesores por el nombre del curso.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de profesores que coinciden con el nombre del curso.


- **`createTeacher(TeacherRequest teacherRequest)`**
  - **Descripción:** Crea un nuevo profesor.
  - **Parámetros:**
    - `teacherRequest`: Objeto que contiene los datos del profesor a crear.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del profesor creado.


- **`updateTeacher(Long id, TeacherRequest teacherRequest)`**
  - **Descripción:** Actualiza la información de un profesor existente.
  - **Parámetros:**
    - `id`: Identificador del profesor a actualizar.
    - `teacherRequest`: Objeto que contiene los nuevos datos del profesor.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del profesor actualizado.


- **`deleteTeacher(Long id)`**
  - **Descripción:** Elimina un profesor por su ID.
  - **Parámetros:**
    - `id`: Identificador del profesor a eliminar.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con un mensaje de confirmación de eliminación.