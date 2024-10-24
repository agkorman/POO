# frozen_string_literal: true

class Counter
  attr_accessor :count
  def initialize
    @count = 0
  end
  def increment
    @count += 1
  end
  def decrement
    @count -= 1 if @count > 0
  end
  # sería el toString()
  def to_s
    "#{@count}"
  end
  # el inspect nos ayuda a encontrar errores
  def inspect
    "#{@count}"
  end
end

my_counter = Counter.new
puts my_counter.count # Imprime 0
my_counter.increment # Aumenta en 1
my_counter.increment
puts my_counter.count # Imprime 2
my_counter.decrement # Disminuye en 1
puts my_counter.count # Imprime 1

my_counter.count = 10 # Setea el contador
my_counter.increment
puts my_counter.count # Imprime 11

puts my_counter
p my_counter