# CodeSandbox supports debian & ubuntu based images
FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

# Example; install htop by default
RUN apt update -y && apt install -y htop

# The project will be mounted in /workspace by default
RUN apt install -y zip \
    && curl -s "https://get.sdkman.io" | bash \
    && bash -c "source /root/.sdkman/bin/sdkman-init.sh && sdk install java 17.0.15-amzn && sdk install gradle 8.14"

# Every new shell will open inside the built container
# Run container indifinitely

# On top of this build, we install `zsh`, `git` and `docker` as additional
# Docker layers.
