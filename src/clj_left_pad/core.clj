(ns clj-left-pad.core)

(defn left-pad
  "Pads the left side of the passed string to the "
  ([len s] (left-pad " " len s))
  ([ch len s] (let [strlen #(count (str %))
                    currLen (strlen s)
                    n (- len currLen)]
                (if (not (= (strlen ch) 1))
                  (throw (Exception. "Padding character should be a single character")))
                (if (<= n 0)
                  s
                  (str
                    (apply str
                      (repeat n ch)) s)))))
