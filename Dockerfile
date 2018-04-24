FROM openjdk:8
CMD "mkdir /opt/cdbg"
CMD "wget -qO- https://storage.googleapis.com/cloud-debugger/compute-java/debian-wheezy/cdbg_java_agent_gce.tar.gz | \
    tar xvz -C /opt/cdbg"
COPY MicroServiceSample-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT ["sh","-c","java","-agentpath:/opt/cdbg/cdbg_java_agent.so","-Dcom.google.cdbg.module", "HelloWorld","-Dcom.google.cdbg.version",1.0","-jar","/app.jar"]

