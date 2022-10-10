# Getting Started

### Reference Documentation

* git clone https://github.com/musabbozkurt/gitlab-service.git
* Open **application.yml** and replace **url, private-token, path-with-namespace, and max-number-of-project** with your
  values
* Run the following command in the project directory to run application -> **mvn spring-boot:run**
* [Swagger URL](http://localhost:8080/swagger-ui.html) to test APIs


* [How to Import Postman Collection (OPTIONAL)](https://learning.postman.com/docs/getting-started/importing-and-exporting-data/)
    * Import Gitlab_API_Postman_Collection.json
    * Import Gitlab_API_Environment_Postman_Environment.json
    * Replace the followings with your values after the import is completed
        * ![img.png](img.png)
* [How to Install and Run Docker Image (OPTIONAL)](https://spring.io/guides/topicals/spring-boot-docker/)
    * [Download and Install Docker](https://docs.docker.com/get-docker/)
    * Run the following commands in the DockerFile path to run the Spring Boot Project:
        * mvn clean install
        * docker build -t mb/gitlab-service .
        * docker run -p 8080:8080 --name gitlab-service mb/gitlab-service
        * [Swagger URL](http://localhost:8080/swagger-ui.html) to test APIs

For further reference, please consider the following sections:

* https://docs.gitlab.com/ee/api/repositories.html#get-a-blob-from-repository
* https://stackoverflow.com/a/59006042
* https://docs.gitlab.com/ee/development/documentation/restful_api_styleguide.html
* https://docs.gitlab.com/ee/api/merge_requests.html

### Guides

The following guides illustrate how to use some features concretely:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

