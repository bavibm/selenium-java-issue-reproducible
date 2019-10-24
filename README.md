Reproducible for issue: [https://github.com/SeleniumHQ/selenium/issues/7713](https://github.com/SeleniumHQ/selenium/issues/7713)

#### Steps to reproduce:
* Open terminal and issue these commands:
```terminal
git clone https://github.com/bavibm/selenium-java-issue-reproducible
cd selenium-java-issue-reproducible/selenium-issue
```
* `mvn clean package` or `mvn clean install`
* See error messages...
```
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project selenium-issue: Compilation failure: Compilation failure: 
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[4,33] module not found: org.openqa.selenium.chrome
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[5,33] module not found: org.openqa.selenium.core
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[6,33] module not found: org.openqa.selenium.firefox
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[7,33] module not found: org.openqa.selenium.ie
```
* uncomment the automodules requires in `module-info.java` and comment the other ones
* `mvn clean package` or `mvn clean install`
* See issues still...
```
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[9,22] module not found: selenium.api
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[10,29] module not found: selenium.chrome.driver
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[11,30] module not found: selenium.firefox.driver
[ERROR] /tmp/selenium-java-issue-reproducible/selenium-issue/src/main/java/module-info.java:[12,25] module not found: selenium.ie.driver
```
* Open project in Eclipse see `cannot be resolved to a module` errors on the second set of requires but not on the first
* Open project in VS Code see `cannot be resolved to a module` errors in either case and red squigglies all around.

#### Output from my `mvn -v`:
```terminal
Apache Maven 3.6.2 (40f52333136460af0dc0d7232c0dc0bcf0d9e117; 2019-08-27T11:06:16-04:00)
Maven home: /home/brandon/.sdkman/candidates/maven/current
Java version: 11.0.5, vendor: Oracle Corporation, runtime: /usr/lib/jvm/java-11-openjdk-11.0.5.10-0.fc30.x86_64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.3.6-200.fc30.x86_64", arch: "amd64", family: "unix"
```
#### Eclipse install info:
```
Version: 2019-09 R (4.13.0)
Build id: 20190917-1200
```

#### VS Code install info:
```
Version: 1.39.2
Java Extension Pack installed and enabled
```

More info on request
