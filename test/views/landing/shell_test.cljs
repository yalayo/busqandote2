(ns views.landing.shell-test
  (:require [views.landing.shell :refer [shell-component]]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [shell-component])

(defcard-rg shell
  [:div
   [:h1 [:i "Shell component"]]
   [show-component]])

