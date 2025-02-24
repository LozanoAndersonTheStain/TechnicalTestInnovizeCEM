#  🛠️  TechnicalTestInnovizeCEM

## 📌 Introducción

Este proyecto es una prueba técnica para Innovize CEM. 
Se trata de una APIREST que permite la gestión de profesores y cursos de una academia.

## 📂 Documentación Estandar

### 📁 Estructura del proyecto

El proyecto está estructurado de la siguiente manera:

TechnicalTestInnovizeCEM
* 📄 `.env` (Fichero de configuración de variables de entorn
* 📄 `.gitatributes` (Fichero de configuración de git)
* 📄 `.gitignore` (Fichero de configuración de archivos ignorados por git)
* 📄 `build.gradle` (Fichero de configuración de dependencias de Gradle)
* 📂 `.gradle/` (Directorio de configuración de Gradle)
* 📄 `gradlew` (Script de ejecución de Gradle)
* 📄 `gradlew.bat` (Script de ejecución de Gradle para Windows)
* 📄 `HELP.md` (Fichero de ayuda de Gradle)
* 📄 `README.md` (Fichero de documentación)
* 📄 `settings.gradle` (Fichero de configuración de Gradle)
  * 📂 `src/` (Directorio de código fuente)
    + 📂 `main/` (Directorio de código fuente principal)
        - 📂 `java/` (Directorio de código fuente Java)
           - 📂 `com.technical.test.technicaltestInnovicecem` (Directorio de código fuente de la aplicación)
              - ⚙️ `config/` (Directorio de configuración de la aplicación)
              - 🎮 `controller/` (Directorio de controladores de la aplicación)
              - 🔄 `dto/ o contracts/` (Directorio de objetos de transferencia de datos)
              - ⚠️ `exception/` (Directorio de excepciones personalizadas de la aplicación)
              - 🗂️ `model/` (Directorio de modelos de la aplicación)
              - 🏛️ `repository/` (Directorio de repositorios de la aplicación)
              - 🔧 `service/` (Directorio de servicios de la aplicación)
              - 🚀 `TechnicalTestInnovicecemApplication.java` (Clase principal de la aplicación)
        - 📂 `resources` (Directorio de recursos)
           - 📂 `db/` (Directorio de scripts de base de datos)
           - 📂 `docs/` (Directorio de documentación)
           - 📂 `postman/` (Directorio de colecciones de Postman)
           - ⚙️ `application.properties` (Fichero de configuración de la aplicación)


### 📦 Dependencias

El proyecto utiliza las siguientes dependencias:

- 🌱 **Spring Boot Starter Test**
- 🧪 **JUnit Platform Launcher**
- 🛢️ **MySQL Driver**
- 🗝️ **Java Dotenv**
- 🏛️ **Spring Boot Starter Data JPA**
- 🏗️ **Lombok**
- 🏷️ **Hibernate ORM**
- 🐱‍💻 **Tomcat Embed Core**
- 🌎 **Spring Boot Starter Web**
- 🛡️ **Spring Boot Starter Validation**
- 📜 **Spring Boot Starter Security**
- 📖**Springdoc OpenAPI Starter WebMVC UI**


### ⚙️ Configuración de las variables de entorno

#### Variables de entorno

Para configurar las variables de entorno, se debe crear un fichero `.env` en la raíz del proyecto con las siguientes variables:

```properties
# Database Configuration
    DB_URL=jdbc:mysql://localhost:3306/yourdatabase
    DB_USERNAME=yourusername
    DB_PASSWORD=yourpassword
```


### 🚀 Ejecución del proyecto

- ☕ **Java 17**
- 📦 **Gradle**

Para ejecutar el proyecto, se deben ejecutar los siguientes comandos en la raíz del proyecto:

```bash
  ./gradlew build
  ./gradlew bootRun
```


### 🔗 Metodos de la API

#### 📚 Endpoints

* **Teachers**
  - 🟢 **GET** /api/teacher/getTeacherById/{id}
  - 🟢 **GET** /api/teacher/getAllTeachers
  - 🟢 **GET** /api/teacher/getTeacherByName/{name}
  - 🟠 **POST** /api/teacher/createTeacher
  - 🔵**PUT** /api/teacher/updateTeacher/{id}
  - 🔴 **DELETE** /api/teacher/deleteTeacher/{id}


* **Courses**
   -  🟢 **GET** /api/courses/getCourseById/{id}
   -  🟢 **GET** /api/courses/getAllCourses
   -  🟢 **GET** /api/courses/getAllCoursesByPrice/{price}
   -  🟢 **GET** /api/courses/getCourseByName/{name}
   -  🟢 **GET** /api/courses/getCourseByTeacherName/{teacherName}
   -  🟢 **GET** /api/courses/getCourseByDurationWeeks/{durationWeeks}
   -  🟠 **POST** /api/courses/createCourse
   - 🔵 **PUT** /api/courses/updateCourse/{id}
   - 🔴 **DELETE** /api/courses/deleteCourse/{id}


### 🛠️ Instalación

Para instalar el proyecto, siga estos pasos:

1️⃣  Clona el repositorio
   ```sh
      git clone https://github.com/LozanoAndersonTheStain/TechnicalTestInnovizeCEM.git
   ```

2️⃣  Crea un fichero `.env` en la raíz del proyecto con las variables de entorno necesarias mencionadas anteriormente.

3️⃣ Ejecuta el proyecto con el comando 

    ```sh
      ./gradlew build
      ./gradlew bootRun 
    ```

4️⃣ Listo. Ya puedes empezar a utilizar la aplicación.

5️⃣ Abre tu navegador y accede a la URL `http://localhost:8080/swagger-ui.html` para ver la documentación de los endpoints.


## 📜 Documentación de la API y metodos

📂 La documentacion de los metodos y archivos importantes para la aplicación se encuentran en el proyecto en la carpeta `docs`, la cual se encuentra en ``resources``

## 📜 Documentación de los endpoints en postman
* 🔗 https://documenter.getpostman.com/view/24188518/2sAYdeLBMz

# 🔗 Recursos utilizados

* 📌  Acceso a datos con MySQL
  - 🔗 https://spring.io/guides/gs/accessing-data-mysql


* 📌  Como Almacenar la información en la base de datos
  - 🔗 https://www.tutorialesprogramacionya.com/springbootya/detalleconcepto.php?punto=12&codigo=13&inicio=0#:~:text=MySQL%20Driver%3A%20La%20dependencia%20MySQL,de%20una%20aplicaci%C3%B3n%20Spring%20Boot.


* 📌  Como configurar JPA
  - 🔗 https://docs.spring.io/spring-framework/reference/data-access/orm/jpa.html


* 📌  Como usar Spring Security
  - 🔗 https://somospnt.com/blog/162-maneja-tus-usuarios-y-sus-roles-con-spring-security


* 📌  Autenticación y Autorización
  - 🔗 https://medium.com/somos-pragma/autenticaci%C3%B3n-y-autorizaci%C3%B3n-medidas-de-seguridad-con-spring-security-3f3de4e0b1b2


* 📌  Configuración de Migraciones
  - 🔗 https://docs.spring.io/spring-security/reference/migration-7/configuration.html


* 📌  Configuración de Swagger
  - 🔗 https://www.oscarblancarteblog.com/2020/08/28/documentar-un-api-rest-con-swagger-y-spring-boot/
  - 🔗  https://springdoc.org/#how-can-i-set-a-global-header


* 📌  Spring Data JPA @Query
  - 🔗 https://www.baeldung.com/spring-data-jpa-query