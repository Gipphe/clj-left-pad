# Introduction to clj-left-pad

Using `clj-left-pad` is pretty straightforward.

First and foremost, you need to require it:

In your `project.clj`:

```clojure
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-left-pad "1.0.0"]])
```

And in the file you want to use `clj-left-pad`:

```clojure
(ns your-beautiful-thing.core
  (:require [clj-left-pad.core :refer [left-pad]))
```

Padding character defaults to spaces:

```clojure
(left-pad 5 "foo")
;=> "  foo"
```

But any valid single character can be used as the padding character:

```clojure
(left-pad "b" 5 "foo")
;=> "bbfoo"

(left-pad 4 5 "foo")
;=> "44foo"
```
