# Interface CourseRepository

### Descripción
La interfaz `CourseRepository` es la que se encarga de proporcionar métodos para realizar operaciones CRUD en la entidad `CourseEntity` en la base de datos. 
Extiende `JpaRepository` para heredar métodos estándar de JPA y define algunas consultas personalizadas utilizando anotaciones de JPA.

## Métodos

- **`findCourseByTeacherName(String teacherName)`**
  - **Descripción:** Obtiene una lista de cursos por el nombre del profesor.
  - **Parámetros:**
    - `teacherName`: Nombre del profesor.
  - **Retorno:** Devuelve una lista de objetos `CourseEntity` que coinciden con el nombre del profesor.


- **`findAllByPrice(Double price)`**
  - **Descripción:** Obtiene una lista de cursos por precio.
  - **Parámetros:**
    - `price`: Precio del curso.
  - **Retorno:** Devuelve una lista de objetos `CourseEntity` que coinciden con el precio.


- **`findCourseByName(String courseName)`**
  - **Descripción:** Obtiene una lista de cursos por nombre.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve una lista de objetos `CourseEntity` que coinciden con el nombre del curso.


- **`findCourseByDurationWeeks(Integer durationWeeks)`**
  - **Descripción:** Obtiene una lista de cursos por duración en semanas.
  - **Parámetros:**
    - `durationWeeks`: Duración del curso en semanas.
  - **Retorno:** Devuelve una lista de objetos `CourseEntity` que coinciden con la duración.


- **`existsCourseByName(String nameCourse)`**
  - **Descripción:** Verifica si existe un curso con el nombre especificado.
  - **Parámetros:**
    - `nameCourse`: Nombre del curso.
  - **Retorno:** Devuelve `true` si existe un curso con el nombre especificado, de lo contrario `false`.