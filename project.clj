(defproject earth.cervest/geotools "1.0.0"
  :description "Clojure wrapper for existing OSS library for MGRS <--> lat/lon conversion"
  :url "http://github.com/Cervest/geotools"
  :license {:name "NASA OPEN SOURCE AGREEMENT VERSION 1.3"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :java-source-paths ["javasrc"]
  :repl-options {:init-ns cervest.geotools.core})
