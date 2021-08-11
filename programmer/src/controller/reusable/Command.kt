package controller.reusable

interface Command {
    fun execute()
    fun undo()
}