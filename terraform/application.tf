terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "3.0.2"
    }
  }
}

provider "docker" {
    host = "unix:///var/run/docker.sock"
}

resource "docker_image" "quiz_app_image" {
    name = "quiz-app"
}

resource "docker_container" "quiz_app_container" {
    name = "quiz_app"
    image = docker_image.quiz_app_image.name

    ports {
        internal = 8090
        external = 8090
    }
}