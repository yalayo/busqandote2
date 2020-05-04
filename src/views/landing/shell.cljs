(ns views.landing.shell
  (:require [re-frame.core :as re-frame]))

(defn shell-component []
  [:div.hero.is-medium
   [:div.hero-body
    [:div.level
     [:div.level-item.has-text-centered
      [:div
       [:p "Let's start from scratch!"]
       [:p "We offer you one year Free Tier that includes all the software you need for your business custom made"]
       [:p "What's in it for us? A long term relationship with our clients and a year from now we talk money"]]]]
    [:div.level
     [:div.level-item.has-text-centered
      [:div.field.has-addons
       [:p.control
        [:input.input {:type "text" :placeholder "Email"}]]
       [:p.control
        [:button.button "Done!"]]]]]]])
