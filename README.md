# clj-left-pad

[![Circle CI](https://circleci.com/gh/Gipphe/clj-left-pad/tree/master.svg?style=svg)](https://circleci.com/gh/Gipphe/clj-left-pad/tree/master)

[![Clojars Project](https://img.shields.io/clojars/v/clj-left-pad.svg)](https://clojars.org/clj-left-pad)

A Clojure library for left-padding strings, with a function signature that
lends itself better to functional style programming.

## Usage

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

```clojure
(left-pad 5 "foo")
;=> "  foo"

(left-pad "x" 5 "foo")
;=> "xxfoo"
```

## Motivation

There are, at this time of writing (2018-02-11), three libraries for
left-padding strings on clojars, and all of them have the same function
signature:

```clojure
(left-pad :stringToPad :length :paddingCharacter)
```

They all otherwise do the same, some utilizing other libraries for string
formatting and such. I got a bit annoyed, having to monkey-patch an imported
library to have the signature I wanted

```clojure
(defn proper-left-pad
  ([len s] (left-pad s len))
  ([ch len s] (left-pad s len ch)))
```

So I wrote my own. No, I hope you do not seriously *need* to ever use this
little library.

## License

Copyright © 2018, Victor Nascimento Bakke.

Released under the [MIT License](https://github.com/Gipphe/clj-left-pad/blob/master/LICENSE).
