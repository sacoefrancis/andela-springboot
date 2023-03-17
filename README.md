# Springboot Application

  This is a simple springboot application whith single api call (/live) for checking the database connection.If the connection is fine it will show message like "Well Done",if the connection is not fine it will show "Maintenance" as a message.The application port number was 8080.

----------------------------------------------------------------------------------------------------------------------------------------------
# Deploying with GitHub Actions

  This application is deployed using GitHub Actions, which is a powerful and flexible tool for automating the deployment process. The deployment process is defined in the .github/workflows/deploy.yml file, which contains a series of steps that are executed when changes are pushed to the dev branch of this repository.

To deploy this application to your own server, you can follow these steps:

 1. Fork this repository to your own GitHub account.
 2. Create a new server or use an existing one, and make sure that it has Java installed.
 3. Set up a new GitHub Actions workflow on your forked repository, using the .github/workflows/deploy.yml file as a template.
 4. Customize the deployment process to suit your needs, including specifying the server and any necessary credentials or environment variables.

  With these steps completed, you can now push changes to your forked repository and GitHub Actions will automatically deploy the changes to your server.
