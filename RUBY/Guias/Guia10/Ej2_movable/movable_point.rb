# frozen_string_literal: true

require_relative '../../Guia8/Ej3_point/point'
require_relative 'movable'
class MovablePoint < Point
  include Movable

  def move_up(_delta)
    @y += _delta
  end

  def move_down(_delta)
    @y -= _delta
  end

  def move_left(_delta)
    @x -= _delta
  end

  def move_right(_delta)
    @x += _delta
  end
end

my_point = MovablePoint.new(1,2)
my_point.move_right(1)
puts my_point
