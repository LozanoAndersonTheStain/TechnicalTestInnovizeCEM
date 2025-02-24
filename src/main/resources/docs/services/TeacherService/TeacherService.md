# Clase TeacherService

### Descripción
La clase `TeacherService` es responsable de la lógica de negocio relacionada con los profesores en la aplicación. Utiliza el repositorio `TeacherRepository` para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los profesores.

## Métodos

- **`getTeacherById(Long id)`**
  - **Descripción:** Obtiene la información de un profesor por su ID.
  - **Parámetros:**
    - `id`: Identificador del profesor.
  - **Retorno:** Devuelve un objeto `TeacherResponse` con la información del profesor o lanza una excepción `TeacherNotFoundException` si no se encuentra.


- **`getAllTeachers()`**
  - **Descripción:** Obtiene la información de todos los profesores.
  - **Retorno:** Devuelve una lista de objetos `TeacherResponse` con la información de todos los profesores.


- **`getTeacherByCourseName(String courseName)`**
  - **Descripción:** Obtiene la información de los profesores por el nombre del curso.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve una lista de objetos `TeacherResponse` con la información de los profesores que coinciden con el nombre del curso.


- **`createTeacher(TeacherRequest teacherRequest)`**
  - **Descripción:** Crea un nuevo profesor.
  - **Parámetros:**
    - `teacherRequest`: Objeto que contiene los datos del profesor a crear.
  - **Retorno:** Devuelve un objeto `TeacherResponse` con la información del profesor creado o lanza una excepción `TeacherAlreadyExistsException` si el profesor ya existe.


- **`updateTeacher(Long id, TeacherRequest teacherRequest)`**
  - **Descripción:** Actualiza la información de un profesor existente.
  - **Parámetros:**
    - `id`: Identificador del profesor a actualizar.
    - `teacherRequest`: Objeto que contiene los nuevos datos del profesor.
  - **Retorno:** Devuelve un objeto `TeacherResponse` con la información del profesor actualizado o lanza una excepción `TeacherNotFoundException` si el profesor no existe.


- **`deleteTeacher(Long id)`**
  - **Descripción:** Elimina un profesor por su ID.
  - **Parámetros:**
    - `id`: Identificador del profesor a eliminar.
  - **Retorno:** No retorna valor, pero elimina el profesor de la base de datos.