FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/ru/gb/jcore/machine/BoxMachine.java
CMD java -classpath ./out ru/gb/jcore/machine/BoxMachine
CMD javadoc -d docs -sourcepath src -cp out -subpackages ru


