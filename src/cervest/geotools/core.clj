(ns cervest.geotools.core
  (:import [com.berico.coords Coordinates]))

(defn get-mgrs-from-lat-lon [lat lon]
  (Coordinates/mgrsFromLatLon lat lon))

(defn get-lat-lon-from-mgrs [mgrs-coords]
  (Coordinates/latLonFromMgrs mgrs-coords))
