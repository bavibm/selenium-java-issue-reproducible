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

#### Steps to reproduce:
* Open terminal and issue these commands:
```terminal
git clone https://github.com/bavibm/selenium-java-issue-reproducible
cd selenium-java-issue-reproducible/selenium-issue
mvn clean install
```
* See error messages...
* uncomment the requires in module-info.java and comment the other ones
```
mvn clean install
```
* See issues still...
* Open project in Eclipse and VS Code (with Java Extensions enabled)
* See that it is giving module cannot be found errors on
