# frozen_string_literal: true
require_relative 'Counter'
class MultipleCounter < Counter
  attr_accessor :count
  def initialize(n)
    super()
    @n = n
  end
  def increment
    @count += @n
  end
  def decrement
    @count -= @n if @count > 0
  end

  def to_s
    "#{@count}"
  end
end

