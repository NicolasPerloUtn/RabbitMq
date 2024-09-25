# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado en el directorio de trabajo
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "demo.jar"]
