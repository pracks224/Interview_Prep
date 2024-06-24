Key Points ::

#### Dockerfile

- A text file with instructions to build an image, human readable.Purpose => how to build an image

- Dockerfile

1. Docker Objects : Docker has Images,Containers,Volumes,Networks,Plugins.
2. Images :

#2 Docker container communication between ? (https://www.youtube.com/watch?v=xrUGEoUpa3s - Abhisek Video)
-> Talk about default bridge network Docker0
-> There types of network
A. Bridge
B. Host
C.None
D.Custom Bridge
Bridge will have it's own set of subnet. IT's the default
Containetr A
Conatiner B
------- 127.0.1.1 (A)
------- 127.0.1.2 (B)
Contianer C if I start with --network = host then it will use the host iP
Containet D if we create a custom brdige network ,then we cannot ping from one container to the cutsom bridge

#3. Docker build vs Docker run ?

Ans : In essence, docker build is about constructing an image from a set of instructions in a Dockerfile,
while docker run is about creating and starting a container from an existing image.
#4. Docker CMD Vs RUN Vs ENTRYPOINT

Ans : Absolutely!
Dockerfile RUN: The RUN instruction is used in a Dockerfile to execute commands while building the image.
It's primarily used for installing packages, setting up the environment, or any task that prepares the image
for the runtime. Each RUN command in a Dockerfile creates a new layer in the image.

      Dockerfile CMD: The CMD instruction in a Dockerfile specifies the command that should be executed when a
                      container created from that image is launched. It can be overridden at runtime by passing a
                      command when starting the container. However, there can only be one CMD instruction in a
                      Dockerfile, and if there are multiple, only the last one takes effect.

      Dockerfile ENTRYPOINT: The ENTRYPOINT instruction in a Dockerfile specifies the command to be run when the
                             container starts. It's quite similar to CMD, but the difference is that ENTRYPOINT
                             specifies a command that cannot be overridden at runtime, but arguments can be added
                             to it when the container is started. If a command is passed when starting the container,
                             it's appended to the ENTRYPOINT command.

      In summary, RUN executes commands during the image build, CMD provides the default command to be executed when
      the container starts (and can be overridden), and ENTRYPOINT sets the primary command to be executed when the
      container starts, with the ability to add arguments at runtime.

#5 Frequently used Docker Commands
Ans : Absolutely! Here are some frequently used Docker commands:

      docker build: Builds an image from a Dockerfile.
      docker run: Creates and starts a container from an image.
      docker ps: Lists running containers.
      docker images: Lists available images on the system.
      docker pull: Pulls an image from a registry.
      docker push: Pushes an image to a registry.
      docker stop: Stops one or more running containers.
      docker rm: Removes one or more containers.
      docker rmi: Removes one or more images.
      docker exec: Runs a command in a running container.
      docker logs: Fetches the logs of a container.
      docker network: Manages Docker networks.
      docker-compose: Manages multi-container applications with a YAML file
