# Fase 1: Construção do JAR usando uma imagem com JDK 21
FROM openjdk:21-jdk-slim AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o código-fonte do projeto para o contêiner
COPY . .

# Executa a compilação do JAR (supondo que você use Maven ou Gradle)
RUN ./mvnw clean package -DskipTests

# Fase 2: Configuração para a execução do JAR com JDK
FROM openjdk:21-jdk-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o JAR gerado da fase de build para a imagem final
COPY --from=build /app/target/springboot-0.0.1-SNAPSHOT.jar app.jar

# Define a porta que o contêiner irá expor
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
