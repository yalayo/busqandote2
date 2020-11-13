resource "aws_s3_bucket" "b" {
  bucket = "busqandote.com"
  acl    = "public-read"
  policy = <<POLICY
  {
    "Version": "2012-10-17",
    "Statement": [
      {
        "Sid": "PublicReadGetObject",
        "Effect": "Allow",
        "Principal": "*",
        "Action": [
          "s3:GetObject"
        ],
        "Resource": [
          "arn:aws:s3:::busqandote.com/*"
        ]
      }
    ]
  }
  POLICY

  website {
    index_document = "index.html"
    error_document = "error.html"
  }
}