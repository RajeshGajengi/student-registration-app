# 1. Use MySQL driver + MySQL URL (recommended if your RDS is MySQL)

application.properties :

```java
spring.datasource.url=jdbc:mysql://mydb.cujwsmiewj2i.us-east-1.rds.amazonaws.com:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

In pom.xml or build.gradle, make sure you have the right dependency:

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```

# 2. Use MariaDB driver + MariaDB URL (if your RDS is MariaDB)

application.properties:

```java
spring.datasource.url=jdbc:mariadb://mydb.cujwsmiewj2i.us-east-1.rds.amazonaws.com:3306/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

```
In pom.xml or build.gradle, make sure you have the right dependency:

```xml

<dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
    <scope>runtime</scope>
</dependency>

```