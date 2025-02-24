# Interface TeacherRepository

### Descripción
La interfaz `TeacherRepository` tiene la finalidad de proporcionar métodos para realizar operaciones CRUD en la entidad `TeacherEntity` en la base de datos. Extiende `JpaRepository` para heredar métodos estándar de JPA y define consultas personalizadas utilizando anotaciones de JPA.

## Métodos

- **`existsByNameAndEmail(String name, String email)`**
  - **Descripción:** Verifica si existe un profesor con el nombre y correo electrónico especificados.
  - **Parámetros:**
    - `name`: Nombre del profesor.
    - `email`: Correo electrónico del profesor.
  - **Retorno:** Devuelve `true` si existe un profesor con el nombre y correo electrónico especificados, sino devuelve `false`.


- **`getTeacherByCourseName(String courseName)`**
  - **Descripción:** Obtiene una lista de profesores por el nombre del curso.
  - **Parámetros:**
    - `courseName`: Nombre del curso.
  - **Retorno:** Devuelve una lista de objetos `TeacherEntity` que coinciden con el nombre del curso.