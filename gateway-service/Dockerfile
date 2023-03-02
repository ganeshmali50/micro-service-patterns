FROM adoptopenjdk/openjdk14:alpine-jre
COPY target/*.jar /app/api-gateway-app.jar
ENV JAVA_OPTS=""
EXPOSE 8900
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/app/api-gateway-app.jar" ]