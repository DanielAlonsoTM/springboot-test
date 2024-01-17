# Official PostgreSQL image from Docker Hub
FROM postgres:latest

# Set environment variables
ENV POSTGRES_DB mydatabase
ENV POSTGRES_USER dev
ENV POSTGRES_PASSWORD dev

# Copy SQL script to initialize the database
COPY init.sql /docker-entrypoint-initdb.d/

# Expose the default PostgreSQL port
EXPOSE 5432

