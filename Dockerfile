FROM openjdk:8
COPY cdbg/* /cdbg/
RUN ls -la /cdbg/*
COPY camelHelloWorld-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-agentpath:/cdbg/cdbg_java_agent.so","-Dcom.google.cdbg.module=HelloWorld","-Dcom.google.cdbg.version=1.0","-jar","/app.jar"]
