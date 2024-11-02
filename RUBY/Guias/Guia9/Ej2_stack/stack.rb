
class Stack
  def initialize
    @elements = [] # empty array
  end

  def empty?
    @elements.empty?
  end

  def push(element)
    @elements.push(element)
  end

  def pop
    empty_check
    @elements.pop
  end

  def peek
    empty_check
    @elements.last
  end

  def empty_check
    raise 'Empty Stack' if empty?
  end

  def to_s
    @elements.to_s
  end

  private :empty_check # this method is only accesible from this ob 
end

class AccessStack < Stack
  attr_reader :pop_accesses
  def initialize
    super
    @pop_accesses = 0
  end

  def pop
    ans = super
    @pop_accesses += 1
    ans
  end

  def push_accesses
    @elements.size + @pop_accesses # elements in the stack + removed ones
  end
end

# mini tester

my_stack = AccessStack.new()
p my_stack.push(1)
p my_stack.push(2)
p my_stack.peek
p my_stack.pop

p my_stack.pop_accesses
p my_stack.push_accesses



