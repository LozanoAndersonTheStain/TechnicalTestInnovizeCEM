# Clase SwaggerConfig

### Descripción
La clase `SwaggerConfig` es responsable de configurar Swagger para la documentación de la API en la aplicación. Utiliza Springdoc OpenAPI para generar y personalizar la documentación de la API.

## Métodos

- **`customOpenAPI()`**
    - **Descripción:** Configura la instancia de `OpenAPI` con la información básica de la API, como el título, la versión y la descripción.

- **`publicApi()`**
    - **Descripción:** Configura un grupo de API público que incluye todos los endpoints que coinciden con el patrón `/api/**`.

## Uso
El uso de esta se da por medio de la ruta `http://localhost:8080/swagger-ui/index.html#/` en la cual se puede visualizar la documentación los endpoints del API.