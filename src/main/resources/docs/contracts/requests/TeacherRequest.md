# Clase TeacherRequest

### Descripción
La clase `TeacherRequest` representa la estructura de los datos necesarios para crear o actualizar un profesor.

## Campos

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


## Métodos

- **`toEntity()`**
  - **Descripción:** Convierte el objeto `TeacherRequest` a un objeto `TeacherEntity`.
  - **Retorno:** Devuelve un objeto `TeacherEntity` con los datos del profesor.