# App
This application was generated using JHipster 4.13.3, you can find documentation and help at [http://www.jhipster.tech/documentation-archive/v4.13.3](http://www.jhipster.tech/documentation-archive/v4.13.3).

## Development

To start your application in the dev profile, simply run:

    mvn


For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].



## Building for production

To optimize the App application for production, run:

    mvn -Pprod clean package

To ensure everything worked, run:

    java -jar target/*.war


Refer to [Using JHipster in production][] for more details.

## Testing

To launch your application's tests, run:

    mvn clean test

For more information, refer to the [Running tests page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a postgresql database in a docker container, run:

    docker-compose -f src/main/docker/postgresql.yml up -d

To stop it and remove the container, run:

    docker-compose -f src/main/docker/postgresql.yml down

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: http://www.jhipster.tech
[JHipster 4.13.3 archive]: http://www.jhipster.tech/documentation-archive/v4.13.3

[Using JHipster in development]: http://www.jhipster.tech/documentation-archive/v4.13.3/development/
[Using Docker and Docker-Compose]: http://www.jhipster.tech/documentation-archive/v4.13.3/docker-compose
[Using JHipster in production]: http://www.jhipster.tech/documentation-archive/v4.13.3/production/
[Running tests page]: http://www.jhipster.tech/documentation-archive/v4.13.3/running-tests/
[Setting up Continuous Integration]: http://www.jhipster.tech/documentation-archive/v4.13.3/setting-up-ci/


