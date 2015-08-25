###Maven 2 + Hibernate 3.2 + MySQL Example (XML Mapping)
Tools & Techonologies used in this project:
- Maven 2.2.1
- JDK 1.6.0_12
- Hibernate 3.2.3.GA
- MySQL 5.0

####Table Creation
MySQL script to create a "stock" table.
````
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `STOCK_ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `STOCK_CODE` VARCHAR(10) NOT NULL,
  `STOCK_NAME` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`STOCK_ID`) USING BTREE,
  UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  UNIQUE KEY `UNI_STOCK_ID` (`STOCK_CODE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
````

####Generate project structure with Maven
To generate project structure with Maven open Command Prompt. In the command prompt write **"mvn archetype:generate"**. If your maven is installed properly it will show the number let you choose to config your app. Information reflected on the command prompt will be like:
````
E:\workspace>mvn archetype:generate
[INFO] Scanning for projects...
...
Choose a number:  
(1/2/3....) 15: : 15
...
Define value for groupId: : com.mkyong.common
Define value for artifactId: : HibernateExample
Define value for version:  1.0-SNAPSHOT: :
Define value for package:  com.mkyong.common: : com.mkyong.common
[INFO] OldArchetype created in dir: E:\workspace\HibernateExample
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESSFUL
[INFO] ------------------------------------------------------------------------
````

####Convert to Eclipse project
````
mvn eclipse:eclipse
````
####Import converted project into Eclipse IDE