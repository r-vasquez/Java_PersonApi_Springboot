# Java_PersonApi_Springboot

To create docker container of PostgreSQL you should have installed Docker and Postgres images (alpine) and run:

``
docker run --name postgres-person -e POSTGRES_PASSWORD=password -d -p 9876:5432 postgres:alpine
``

Be aware that I use port 9876 for this example.

