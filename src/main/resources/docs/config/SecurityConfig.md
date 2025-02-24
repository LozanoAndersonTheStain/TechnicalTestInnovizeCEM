# Clase SecurityConfig

### Descripción
La clase SecurityConfig es la encargada de configurar la seguridad de la aplicacion, esta utiliza Spring Security para definir las reglas de autorizacipon para los diferentes roles de usuario y configurar la autenticación básica.

## Métodos

- **`securityFilterChain(HttpSecurity http)`**
- **Descripción:** Configura las reglas de seguridad/autorización de la aplicación para los diversos roles.
- **Parámetros:** 
  - **http:** Es un objeto de tipo HttpSecurity que se utiliza para configurar las reglas de seguridad.
  - **Reglas de autorización:**
    - **ADMIN:** Puede acceder a todos los endpoints bajo `/api/teacher/**` y `/api/courses/**`.
    - **STUDENT:** Puede acceder a los endpoints para obtener información de profesores y cursos.
    - **TEACHER:** Puede acceder a los endpoints para obtener y actualizar información de cursos y profesores.

- **`userDetailsService()`**
  - **Descripción:**  Configura un servicio de detalles de usuario en memoria con tres usuarios predeterminados: admin, student y teacher.
  - **Usuarios predeterminados:**
      - **admin:** Usuario con rol ADMIN.
      - **student:** Usuario con rol STUDENT.
      - **teacher:** Usuario con rol TEACHER.
  - **Retorno:** Devuelve un objeto `UserDetailsService` configurado con los usuarios en memoria

- **`passwordEncoder()`**
- **Descripción:** Configura un codificador de contraseñas BCrypt con fuerza 10.
- 
- **Uso:** Se utiliza para codificar las contraseñas de los usuarios almacenados en memoria.