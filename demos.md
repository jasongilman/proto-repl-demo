# Proto REPL Demos

This is a list of demos for the Proto REPL package for Atom. It assumes you've followed the setup steps in the README first. Follow the steps in this file to see a demonstration of the different capabilities of Proto REPL.

## A Note About Keyboard Shortcuts

Keyboard shortcuts below refer to using `ctrl-,` then a letter. That means press the `ctrl` key and the comma key at the same time, release them, and then press the subsequent letter. Some keyboard shortcuts also include the shift key.

## Demo: Start the REPL

Start the REPL using one of the following methods.

* Use the keyboard shortcut - `ctrl-, L`
* Select the menu item "Packages" -> "proto-repl" -> "Start REPL"
* Bring up the Command Palette (ctrl-, p) and select "Proto REPL: Toggle"

### How Does it Work?

When the REPL starts in Proto REPL it runs the Clojure build tool, Leiningen as a child process. Leiningen starts a Clojure REPL using the current project's classpath. Proto REPL sends code to the REPL which is evaluated. Any standard out from the REPL including the evaluation response is returned and displayed in the REPL.

[Boot](https://github.com/boot-clj/boot) is supported for running the REPL as well. Proto REPL will use a project.clj file first if it is found.

## Demo: Start the REPL with a specific build.boot or project.clj

You can force Proto REPL to use a specific build.boot or project.clj file by opening it and then using one of the following methods.

* Use the keyboard shortcut for specific build file - `ctrl-, shift-L`
* Select the menu item "Packages" -> "proto-repl" -> "Start REPL from open project.clj/build.boot"
* Right click and select "proto-repl" -> "Start REPL from open project.clj/build.boot"

## Demo: Send a Block of Clojure Code to the REPL

Put your cursor somewhere within the statement below and press `ctrl-, b`.

```clojure
(+ 1 2 3)
```

Try placing your cursor in different sections in this more sophisticated example. Depending on which block you execute you may get a compiler exception because certain variable names will not be bound. See [the Proto REPL README](https://github.com/jasongilman/proto-repl#sending-a-block) for a description of a how it finds which block to execute.

Note that if you place your cursor outside of block but within the Markdown code block the entire block will be executed.

```clojure
(let [letters (map char (range (int \a) (inc (int \z))))]
  (doseq [letter letters]
    (println "The ascii decimal value of" letter "is" (int letter))))

```

### Executing the Outermost Block

Proto REPL allows execution of the outermost block no matter what the location of your cursor is. Put your cursor anywhere within the block above and press `ctrl-, shift-b`.

## Demo: Send Selected Text to the REPL

Select the three `println` statements below (including parentheses) and press `ctrl-, s`. Note that all the commands are executed but only the result from the last one is returned (`nil`).

```clojure
(println "hello 1")
(println "hello 2")
(println "hello 3")
```

## Demo: Interrupting a Long Running Command

Proto REPL allows you to interrupt a long running command using `ctrl-shift-c`. Try running the code below which will run forever and then interrupt it.

```clojure
(while true
  (Thread/sleep 500)
  (println "I'm still running"))
```

## Demo: Refresh all Code in the Project

All of the code in the project can be loaded and refreshed from the file system by pressing the tool bar button or using the keyboard shortcut `ctrl-, R`. It works by executing the `reset` function in the `user` namespace. This is defined in this project in `dev/user.clj`. The `reset` function uses [clojure.tools.namespace](https://github.com/clojure/tools.namespace) to load all the code in the project.

1. Reload all code using `ctrl-, r`.
2. Open dev/user.clj
3. Uncomment the line in the `start` function.
4. Reload all code using `ctrl-, r`. You should see "Starting" is printed in the REPL indicating your code change was loaded.

## Demo: Run All Tests

Run all the tests in the project by pressing the tool bar button or hitting the keyboard shortcut `ctrl-, a`. When you do you should see that one of the tests fails.

## Demo: Run a Single Test File

Open `test/proto_repl_demo/demo_test.clj`. Run the tests in that namespace by pressing `ctrl-, x`. That runs all of the tests in that namespace.

## Demo: Run a Single Test

Put your cursor within the name of a test in the `test/proto_repl_demo/demo_test.clj` file. Press `ctrl-, t` to run the  test under the cursor.

## Demo: Load a single file.

Sometimes you don't want to reload all the code in a project and you don't want to evaluate each block separately. You can load a single file using the `ctrl-, f` keybinding.

## Demo: View Documentation or Code of a Function.

Put your cursor within the text `vector` in this file and press `ctrl-, d`. This will print the documentation for that Clojure function. Leave your cursor within the same text and try pressing `ctrl-, c` to display the source code of that function.

You can show documentation or code for a function in a namespace other that clojure.core. Put your cursor within the name `clojure.string/join` and press `ctrl-, d`.

## Demo: View List of Functions in a Namespace.

Put your cursor within the text of the namespace name `clojure.string` and press `ctrl-, n` to list the vars defined in that namespace. Try pressing `ctrl-shift-, n` to list the vars with documentation.

## Demo: Open Namespace or Var Definition

The open command is triggered by placing your cursor within a var reference and pressing `ctrl-, o`. Try placing your cursor in each of the following and pressing `ctrl-, o`

* A namespace in this project: `proto-repl-demo.demo`
* A var in this project: `proto-repl-demo.demo/subtract-numbers`
* A var in Clojure: `clojure.string/join`
* A var in a library: `clojure.tools.namespace.repl/refresh`

Pretty much anytime you see a var or namespace in Clojure code you can open it. The open command finds the location of a var either on the local file system or in a referenced library. If the var is located in a library the code from the jar is extracted to `~/.lein/tmp-atom-jars/` and opened there. If the jar was already extracted it uses that first.

## Demo: Autoeval File

Open auteval.clj for an example of Autoeval.
