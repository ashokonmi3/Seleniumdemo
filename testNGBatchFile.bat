set projectLocation= C:\Users\assharma\eclipse-workspace\TestNG
cd %projectLocation%
echo %ProjectPath%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo %classpath%

java org.testng.TestNG %projectLocation%\Testsuite.xml
pause