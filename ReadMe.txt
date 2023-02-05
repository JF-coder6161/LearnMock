前言:
    PowerMock有两套API 1.EasyMock 2.Mockito
    使用PowerMock需要依赖于这两套API其中之一，以及一个测试框架
    测试框架：Junit 以及 TestNG
    针对于Junit:有三种不同的JUnit测试执行器可用,一个用于JUnit 4.4-4.12,一个用于JUnit 4.0-4.3,JUnit 3的测试执行程序从PowerMock 2.0开始就不可用了。

Maven setup
    Junit
        EasyMock JUnit Maven setup:
            JUnit 4.4 or above
                <properties>
                    <powermock.version>2.0.2</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit4</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-easymock</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>

            JUnit 4.0-4.3
                <properties>
                    <powermock.version>2.0.2</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit4-legacy</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-easymock</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>

            Junit 3 (版版过于陈旧)
                <properties>
                    <powermock.version>1.7.1</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit3</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-easymock</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>

        Maven setup for the Mockito 2.x
            JUnit 4.4 or above
                <properties>
                    <powermock.version>2.0.2</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit4</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-mockito2</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>

            JUnit 4.0-4.3
                <properties>
                    <powermock.version>2.0.2</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit4-legacy</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-mockito2</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>

            JUnit 3 (deprecated)
                <properties>
                    <powermock.version>1.7.1</powermock.version>
                </properties>
                <dependencies>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-module-junit3</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                   <dependency>
                      <groupId>org.powermock</groupId>
                      <artifactId>powermock-api-mockito2</artifactId>
                      <version>${powermock.version}</version>
                      <scope>test</scope>
                   </dependency>
                </dependencies>