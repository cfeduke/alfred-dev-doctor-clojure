# alfred-dev-doctor-clojure

Builds the `data.clojure.json` file into `output` using the [Clojure API index found on Github](https://raw.github.com/clojure/clojure/gh-pages/index-v1.5.clj).

## Usage

As of now, in a REPL:

    (use 'alfred-doc-doctor-clojure)
    (alfred-dev-doctor-clojure.core/-main)

This will create a `output/data.clojure.json` file which can then be copied to:

    ~/Library/Application Support/Alfred 2/Alfred.alfredpreferences/workflows/$ALFRED_DEV_DOCTOR/parsers/autosuggest/data/

## License

Copyright © 2013 Charles Feduke/Deployment Zone

Distributed under the Eclipse Public License, the same as Clojure.
