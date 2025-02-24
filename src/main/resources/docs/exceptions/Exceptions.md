# Excepciones

### Descripción
Este documento describe las excepciones personalizadas utilizadas en la aplicación para manejar errores específicos relacionados con cursos y profesores.


## Excepciones de Curso

- **`CourseAlreadyExistsException`**
  - **Descripción:** Se lanza cuando se intenta crear un curso que ya existe.
  - **Constructor:**
    - `CourseAlreadyExistsException(String message)`: Crea una nueva instancia con el mensaje de error especificado.


- **`CourseNotFoundException`**
  - **Descripción:** Se lanza cuando no se encuentra un curso con el ID especificado.
  - **Constructor:**
    - `CourseNotFoundException(String message)`: Crea una nueva instancia con el mensaje de error especificado.


- **`InvalidCourseDataException`**
  - **Descripción:** Se lanza cuando los datos proporcionados para un curso son inválidos.
  - **Constructor:**
    - `InvalidCourseDataException(String message)`: Crea una nueva instancia con el mensaje de error especificado.


## Excepciones de Profesor

- **`TeacherAlreadyExistsException`**
  - **Descripción:** Se lanza cuando se intenta crear un profesor que ya existe.
  - **Constructor:**
    - `TeacherAlreadyExistsException(String message)`: Crea una nueva instancia con el mensaje de error especificado.


- **`TeacherNotFoundException`**
  - **Descripción:** Se lanza cuando no se encuentra un profesor con el ID especificado.
  - **Constructor:**
    - `TeacherNotFoundException(String message)`: Crea una nueva instancia con el mensaje de error especificado.


- **`InvalidTeacherDataException`**
  - **Descripción:** Se lanza cuando los datos proporcionados para un profesor son inválidos.
  - **Constructor:**
    - `InvalidTeacherDataException(String message)`: Crea una nueva instancia con el mensaje de error especificado.