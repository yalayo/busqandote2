terraform {
  backend "s3" {
    bucket = "rsarnik-terraform-state"
    key    = "path/to/my/key"
    region = "us-east-1"
  }
}