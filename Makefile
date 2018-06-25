DEBUG_5005=-Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"

run:
	mvn spring-boot:run

run-debug:
	mvn spring-boot:run $(DEBUG_5005)