package ;
class Main {

    public function new() {
        var queue:Queue = new Queue();

        trace("Is the old stack empty ? : " + queue.isEmpty());

        for(i in 0...10) {
            queue.Enqueue(i);
            trace("Enqueue : " + i);
        }

        trace("is the queue empty ? : " + queue.isEmpty());

        var size:Int = queue.getSize();

        if(!queue.isEmpty()) {
            for(i in 0...size) {
                trace("dequeing : " + queue.dequeue());
            }
        }

        trace("is the queue empty ? : " + queue.isEmpty());

    }

    public static function main() {
        new Main();
    }
}
