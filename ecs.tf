# Must set AWS_SDK_LOAD_CONFIG=1

provider "aws" {
  region     = "us-east-1"
  profile    = "default"
}

resource "aws_ecr_repository" "artserviceecrrepository" {
  name = "artserviceecrrepository"
}
