cd ..
call mvn clean
call mvn clean install -e -Dmaven.test.skip=true
@pause