(ns webapp.core
  (:require [stedi.cdk.alpha :as cdk]))

(cdk/import [[App Stack] :from "@aws-cdk/core"]
            [[Bucket] :from "@aws-cdk/aws-s3"]
            [[BucketDeployment Source] :from "@aws-cdk/aws-s3-deployment"])

(def app (App))

(def stack (Stack app "busqndote-landing-page"))

(def bucket
  (Bucket stack
          "busqndote-landin-page-bucket"
          {:publicReadAccess true
           :websiteIndexDocument "index.html"
           }))

(def deployment
  (BucketDeployment stack
                    "busqndote-landin-page-deployment"
                    {:sources [(Source/asset "dist/")]
                     :destinationBucket bucket
                     }))

