(ns views.landing.shell
  (:require [re-frame.core :as re-frame]))

(defn shell-component []
  [:div.hero.is-medium
   [:div.hero-body
    [:div.level
     [:div.level-item.has-text-centered
      [:div
       [:p "Let's start from scratch!"]
       [:p "I offer you one year Free Tier that includes all the software you need for your business custom made"]
       [:p "What's in it for me? A long term relationship with my clients and a year from now we talk money"]]]]]
   [:div.level
    [:div.level-item.has-text-centered
     [:p "If you decide to get in touch, find me in SKYPE as "
      [:strong.heading "Busqandote"]]]]
   [:div.hero-body
   [:div.level
    [:div.level-item.has-text-centered
     [:div
      [:p.heading "prospects"]
      [:p.title "0"]]]
    [:div.level-item.has-text-centered
     [:div
      [:p.heading "clients"]
      [:p.title "0"]]]
    [:div.level-item.has-text-centered
     [:div
      [:p.heading "staff"]
      [:p.title "1"]]]]]
   ])
