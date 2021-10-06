## Commits on red state

  * committing on "does not compile" red helps you notice your language mastery, specially about syntax and errors
  that the compiler masters better than you do
  * committing on red "compiles but not functionally ready" lets you work at a slower level, moving more work to the
  front of the cycle (i.e., class creation) before committing
  * committing on red is a good option on katas, as it lets you know your pace, differentiates between red and green:
   time to think and write the failing code (ask a question) and time to think and code the solution (solve the
   question)

## Smells you capture, Reflections, Thoughts

  * thoughts about the code can be expressed as an empty commit, only with a message. This represents the smell in
  its closer form to the current code. An empty commit can be inserted using the command:
    ```bash
    git commit -m "smell: message" --allow-empty
    ```
