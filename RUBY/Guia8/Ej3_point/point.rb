# frozen_string_literal: true

class Point
  attr_accessor :x , :y
  def initialize(x, y)
    @x = x
    @y = y
  end

  def distance_to(other)
    Math.sqrt((@x - other.x)**2 + (@y - other.y)**2)
  end

  def horizontal_distance(other)
    (@x - other.x).abs
  end

  def vertical_distance(other)
    (@y - other.y).abs
  end

  def to_s
    "[#{@x}, #{@y}]"
  end

end

puts Point.new(1, 1)
