# CodeSandbox supports debian & ubuntu based images
FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

# Example; install htop by default
RUN apt update -y && apt install -y htop

# The project will be mounted in /workspace by default
RUN curl -s "https://get.sdkman.io" | bash \
    && sdk install java 17.0.14-amzn \
    && sdk install gradle

# Every new shell will open inside the built container

# On top of this build, we install `zsh`, `git` and `docker` as additional
# Docker layers.
