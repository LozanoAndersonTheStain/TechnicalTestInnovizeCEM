# Clase CourseController

### Descripción
La clase `CourseController` es se encarga de manejar las solicitudes HTTP relacionadas con los cursos. Utiliza el servicio `CourseService` para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en los cursos.

## Métodos

- **`getCourseById(Long id)`**
  - **Descripción:** Obtiene la información de un curso por su ID.
  - **Parámetros:**
    - `id`: Identificador del curso.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del curso o un mensaje de error si no se encuentra.


- **`getAllCourses()`**
  - **Descripción:** Obtiene la información de todos los cursos.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de todos los cursos.


- **`getAllCoursesByPrice(Double price)`**
  - **Descripción:** Obtiene la información de todos los cursos por precio.
  - **Parámetros:**
    - `price`: Precio del curso.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de cursos del mismo precio.


- **`getCourseByName(String courseName)`**
  - **Descripción:** Obtiene la información de un curso por su nombre.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de cursos que coinciden con el nombre.


- **`getCourseByTeacherName(String teacherName)`**
  - **Descripción:** Obtiene la información de un curso por el nombre del profesor.
  - **Parámetros:**
    - `teacherName`: Nombre del profesor.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de cursos que coinciden con el nombre del profesor.


- **`getCourseByDurationWeeks(Integer durationWeeks)`**
  - **Descripción:** Obtiene la información de un curso por la duración en semanas.
  - **Parámetros:**
    - `durationWeeks`: Duración del curso en semanas.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la lista de cursos que coinciden con la duración.


- **`createCourse(CourseRequest courseRequest)`**
  - **Descripción:** Crea un nuevo curso.
  - **Parámetros:**
    - `courseRequest`: Objeto que contiene los datos del curso a crear.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del curso creado.


- **`updateCourse(Long id, CourseRequest courseRequest)`**
  - **Descripción:** Actualiza la información de un curso existente.
  - **Parámetros:**
    - `id`: Identificador del curso a actualizar.
    - `courseRequest`: Objeto que contiene los nuevos datos del curso.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con la información del curso actualizado.


- **`deleteCourse(Long id)`**
  - **Descripción:** Elimina un curso por su ID.
  - **Parámetros:**
    - `id`: Identificador del curso a eliminar.
  - **Retorno:** Devuelve un objeto `ResponseEntity` con un mensaje de confirmación de eliminación.