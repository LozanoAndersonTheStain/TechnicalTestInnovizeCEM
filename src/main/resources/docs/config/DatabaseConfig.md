# Clase DatabaseConfig

### Descripcción
La clase DatabaseConfig es la responsable de configurar y establecer la conexión con la base de datos.
Utiliza la libreria dotenv para cargar las propiedades de la base de datos desde un archivo `.env`.

## Metodos 
- **`loadDatabaseProperties()`**
  - **Descripción:** Establece las propiedades de la base de datos en el sistema utilizando las variables de entorno definidas en el archivo `.env`.

     + Las propiedades cargadas son las siguientes:
       - **DB_URL:** La URL de la base de datos. esta puede ser cualquiera que se desee, tanto para base de datos SQL como NoSQL
       -  **DB_USERNAME:** El nombre de usuario para la base de datos
       - **DB_PASSWORD:** La contraseña para acceder a la base de datos


- **`getConection()`**
    - **Description:** Establece una conexión con la base de datos, utilizando las propiedades cargadas en el metodo `loadDatabaseProperties()` 

## Manejo de errores
  Este mismo utiliza el metodo `DriverManager.getConection()` para imprimir diferentes mensajes en la consola. 
    + Si la conexión es establecida devolvera un mensaje satisfactorio "Connection to Database Established". 
    + Si la conexión falla mostrara un mensaje diferente "Failed to establish connection to Database". Ademas tambien mostrara la razon de la falla.

## Uso
Para utilizar la clase DataBaseConfig, simplemente llama al método loadDatabaseProperties() para cargar las propiedades de la base de datos, y luego llama al método getConnection() para establecer una conexión con la base de datos.

```java
    DataBaseConfig.loadDatabaseProperties();
    Connection connection = DataBaseConfig.getConnection();
```