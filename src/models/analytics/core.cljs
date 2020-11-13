(ns models.analytics.core
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-event-fx
 ::page-view
 (fn []
   {:ga/page-view ["https://www.busqandote.com/"]}))
