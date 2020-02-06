# QA Testing Framework


## Project Structure

    /datafile
	/lib
	/resources
	/src
		/main/java/runners
		/test/java
				/objects
				/pages
				/steps
		
### Compilation

Local Parallel

	mvn clean test -Dsurefire.suiteXmlFiles=testngp.xml -DbrowserType=chrome -Dcucumber.options="--tags @ENV_QA7"
	mvn clean verify -Dsurefire.suiteXmlFiles=testngp.xml -DbrowserType=chrome -Dcucumber.options="--tags @Regression --tags @other"
		
Grid Parallel

	mvn clean test -Dsurefire.suiteXmlFiles=testngp.xml -Dui_server=http://seleniumgrid.com/wd/hub -DdriverType=hub -DbrowserType=chrome 
	mvn clean verify -Dsurefire.suiteXmlFiles=testngp.xml -Dui_server=http://seleniumgrid.com/wd/hub -DdriverType=hub -DbrowserType=chrome -Dcucumber.options="--tags @Smoke --tags @other"
