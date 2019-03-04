
SET configurefile="application.properties"
echo %configurefile%
if "%1" == "qa" (
	set configurefile="application-qa.properties"
	echo %configurefile%
)
echo %configurefile%
java -jar batscript-0.0.1.jar --spring.config.location=%configurefile%

pause