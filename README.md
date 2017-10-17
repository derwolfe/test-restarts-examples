# test-restarts

This project has two tests. One shows an example of a test that will block forever and cause the developer to cancel the test run by killing the test process. The other is a test that is written with failure in mind, so that the test will timeout and be able to be re-run.

# Usage

To reproduce the blocking behavior (which isn't a bug!) run `lein auto test :slow`. This will run the test that will require killing the process. To run the test that fails quickly, run `lein auto test`.

## License

Copyright © 2017 Chris Wolfe

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
