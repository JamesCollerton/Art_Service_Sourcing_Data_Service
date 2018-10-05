provider "aws" {
  access_key = "${var.ecs_administrator_aws_access_key}"
  secret_key = "${var.ecs_administrator_aws_secret_key}"
  region     = "us-east-1"
}

resource "aws_ecr_repository" "artserviceecrrepository" {
  name = "artserviceecrrepository"
}
