# Clase CourseService

### Descripción
La clase `CourseService` se encarga de la lógica de negocio relacionada con los cursos en la aplicación. 
Utiliza el repositorio `CourseRepository` para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en los cursos.

## Métodos

- **`getCourseById(Long id)`**
  - **Descripción:** Obtiene la información de un curso por su ID.
  - **Parámetros:**
    - `id`: Identificador del curso.
  - **Retorno:** Devuelve un objeto `CourseResponse` con la información del curso o lanza una excepción `CourseNotFoundException` si no se encuentra.


- **`getAllCourses()`**
  - **Descripción:** Obtiene la información de todos los cursos.
  - **Retorno:** Devuelve una lista de objetos `CourseResponse` con la información de todos los cursos.


- **`getAllCoursesByPrice(Double price)`**
  - **Descripción:** Obtiene la información de todos los cursos por precio.
  - **Parámetros:**
    - `price`: Precio del curso.
  - **Retorno:** Devuelve una lista de objetos `CourseResponse` con la información de los cursos que coinciden con el precio.


- **`getCourseByName(String courseName)`**
  - **Descripción:** Obtiene la información de un curso por su nombre.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve una lista de objetos `CourseResponse` con la información de los cursos que coinciden con el nombre.


- **`getCourseByTeacherName(String teacherName)`**
  - **Descripción:** Obtiene la información de un curso por el nombre del profesor.
  - **Parámetros:**
    - `teacherName`: Nombre del profesor.
  - **Retorno:** Devuelve una lista de objetos `CourseResponse` con la información de los cursos que coinciden con el nombre del profesor.


- **`getCourseByDurationWeeks(Integer durationWeeks)`**
  - **Descripción:** Obtiene la información de un curso por la duración en semanas.
  - **Parámetros:**
    - `durationWeeks`: Duración del curso en semanas.
  - **Retorno:** Devuelve una lista de objetos `CourseResponse` con la información de los cursos que coinciden con la duración.


- **`createCourse(CourseRequest courseRequest)`**
  - **Descripción:** Crea un nuevo curso.
  - **Parámetros:**
    - `courseRequest`: Objeto que contiene los datos del curso a crear.
  - **Retorno:** Devuelve un objeto `CourseResponse` con la información del curso creado o lanza una excepción `CourseAlreadyExistsException` si el curso ya existe.


- **`updateCourse(Long id, CourseRequest courseRequest)`**
  - **Descripción:** Actualiza la información de un curso existente.
  - **Parámetros:**
    - `id`: Identificador del curso a actualizar.
    - `courseRequest`: Objeto que contiene los nuevos datos del curso.
  - **Retorno:** Devuelve un objeto `CourseResponse` con la información del curso actualizado o lanza una excepción `CourseNotFoundException` si el curso no existe.


- **`deleteCourse(Long id)`**
  - **Descripción:** Elimina un curso por su ID.
  - **Parámetros:**
    - `id`: Identificador del curso a eliminar.
  - **Retorno:** No retorna valor, pero elimina el curso de la base de datos.