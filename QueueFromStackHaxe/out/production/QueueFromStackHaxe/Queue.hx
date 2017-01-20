package ;
import haxe.io.Error;
class Queue {

    var oldStack:Array<Int> = [];
    var newStack:Array<Int> = [];
    var topElement:Int = -1;

    public function new() {
    }

    public function Enqueue(element:Int):Bool {

        var rvalue:Bool = true;


        try {
            newStack.push(element);
        } catch (error:Error) {
            rvalue = false;
            trace("Something went wrong with added an element to the Queue: " + error);
        }

        return rvalue;
    }

    public function dequeue():Int {

        topElement = -1;

        if(oldStack.length <= 0) {
            while(newStack.length > 0) {
                topElement = newStack.pop();
                oldStack.push(topElement);
            }
        }

        if(oldStack.length > 0) {
            topElement = oldStack.pop();
        }

        return topElement;
    }


    public function getSize():Int {
        return oldStack.length + newStack.length;
    }

    public function isEmpty():Bool {
        return (oldStack.length <= 0 && newStack.length <= 0);
    }
}
