(ns alfred-dev-doctor-clojure.core)
(use 'clojure.set)
(require '[clojure.data.json :as json])

(defn deser-from-file*
  "Returns object stored in file f. Alternative version based on Chas Emerick's code."
  [f]
  (with-open [r (->     (java.io.FileInputStream. f)
                  (java.io.InputStreamReader. "UTF-8")
                  (java.io.BufferedReader.)
                  (java.io.PushbackReader.))]
    (read r) ))

(def clj-index (deser-from-file* "dev-resources/index-v1.5.clj"))

(def namespaces (:namespaces clj-index))

(def namespaces-transform (rename (project namespaces [:name :wiki-url :doc]) {:name :title, :wiki-url :url, :doc :description}))

(defn create-output-dir
  "Creates the ./output directory if it does not yet exist."
  []
  (let  [output-dir (java.io.File. "output")]
    (if (not (.exists output-dir)) (.mkdirs output-dir))))
