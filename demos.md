# Proto REPL Demos

This is a list of demos for the Proto REPL package for Atom. It assumes you've followed the setup steps in the README first. Follow the steps in this file to see a demonstration of the different capabilities of Proto REPL.

Keyboard shortcuts below refer to the `cmd` key. Use that if you're on Mac OSX or the equivalent for your operating system.

## Demo: Start the REPL

Start the REPL using one of the following methods.

* Use the keyboard shortcut - cmd-alt-L
* Select the menu item "Packages" -> "proto-repl" -> "Start REPL"
* Bring up the Command Palette (cmd-alt-p) and select "Proto REPL: Toggle"

### How Does it Work?

When the REPL starts in Proto REPL it runs the Clojure build tool, Leiningen as a child process. Leiningen starts a Clojure REPL using the current project's classpath. Proto REPL sends code to the REPL which is evaluated. Any standard out from the REPL including the evaluation response is returned and displayed in the REPL.

### About the REPL

The REPL in Proto REPL is not a typical REPL. It's more of a text editor that is the target for output from REPL execution. You can type anywhere and modify any of the displayed text. Commands are not sent by typing in the REPL and pressing enter. They are sent through keyboard shortcuts. You will typically type Clojure forms in one text editor and send them to the REPL for evaluation. You continue the cycle of code modification and REPL evaluation until it does what you want it to do.

## Demo: Send a Block of Clojure Code to the REPL

Put your cursor somewhere within the `println` statement below and press `cmd-alt-b`.

```clojure
(println "Hello World!")
```

Try placing your cursor in different sections in this more sophisticated example. Depending on which block you execute you may get a compiler exception because certain variable names will not be bound. See [the Proto REPL README](https://github.com/jasongilman/proto-repl#sending-a-block) for a description of a how it finds which block to execute.

Note that if you place your cursor outside of block but within the Markdown code block the entire block will be executed.

```clojure
(let [letters (map char (range (int \a) (inc (int \z))))]
  (doseq [letter letters]
    (println "The ascii decimal value of" letter "is" (int letter))))
```

## Demo: Send Selected Text to the REPL

Select the three `println` statements below (including parentheses) and press `cmd-alt-s`.

```clojure
(println "hello 1")
(println "hello 2")
(println "hello 3")
```

## Demo: Refresh all Code in the Project

All of the code in the project can be loaded and refreshed from the file system by pressing the tool bar button or using the keyboard shortcut `cmd-alt-R`. It works by executing the `reset` function in the `user` namespace. This is defined in this project in `dev/user.clj`. The `reset` function uses [clojure.tools.namespace](https://github.com/clojure/tools.namespace) to load all the code in the project.

1. Reload all code using `cmd-alt-R`.
2. Open dev/user.clj
3. Uncomment the line in the `start` function.
4. Reload all code using `cmd-alt-R`. You should see "Starting" is printed in the REPL indicating your code change was loaded.

## Demo: Run All Tests

Run all the tests in the project by pressing the tool bar button or hitting the keyboard shortcut `cmd-alt-a`. When you do you should see that one of the tests fails.

## Demo: Run a Single Test File

Open `test/proto_repl_demo/demo_test.clj`. Run the tests in that namespace by pressing `cmd-alt-x`. That runs all of the tests in that namespace.

## Demo: Run a Single Test

Select the name of a test in the `test/proto_repl_demo/demo_test.clj` file. Press `cmd-alt-t` to run the selected test.

## Demo: Load a single file.

Sometimes you don't want to reload all the code in a project and you don't want to evaluate each block separately. You can load a single file using the `cmd-alt-shift-f` keybinding.

## Demo: View Documentation or Code of a Function.

Select the text `vector` in this file and press `cmd-alt-d`. This will print the documentation for that Clojure function. Select the same text and try pressing `cmd-alt-c` to display the source code of that function.

You can show documentation or code for a function in a namespace other that clojure.core. Select the text `clojure.string/join` and press `cmd-alt-d`. You must select the namespace (`clojure.string`) so that the join function is found.

## Demo: View List of Functions in a Namespace.

Select the namespace `clojure.string` and press `cmd-alt-n` to list the vars defined in that namespace. Try pressing `cmd-alt-shift-s` to list the vars with documentation.

## Demo: Open Namespace or Var Definition

The open command is triggered by selecting something and pressing `cmd-alt-o`. Try selecting each of the following and pressing `cmd-alt-o`

* A namespace in this project: `proto-repl-demo.demo`
* A var in this project: `proto-repl-demo.demo/subtract-numbers`
* A var in Clojure: `clojure.string/join`
* A var in a library: `clojure.tools.namespace.repl/refresh`

Pretty much anytime you see a var or namespace in Clojure code you can open it. The open command finds the location of a var either on the local file system or in a referenced library. If the var is located in a library the code from the jar is extracted to `~/.lein/tmp-atom-jars/` and opened there. If the jar was already extracted it uses that first.
