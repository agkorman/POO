# frozen_string_literal: true
require_relative '../../Guia8/Ej4_figure/figure'
require_relative 'movable_point'

class MovableRectangle < Rectangle
  include Movable

  def move_up(_delta)
    @bottom_right_point.move_up(_delta)
    @top_left_point.move_up(_delta)
  end

  def move_down(_delta)
    @bottom_right_point.move_down(_delta)
    @top_left_point.move_down(_delta)
  end

  def move_right(_delta)
    @bottom_right_point.move_right(_delta)
    @bottom_right_point.move_right(_delta)
  end

  def move_left(_delta)
    @bottom_right_point.move_left(_delta)
    @top_left_point.move_left(_delta)
  end
end

class MovableTriangle < Triangle
  include Movable

  def points
    [@first_point, @second_point, @third_point]
  end

  def move_up(_delta)
    points.each { |e| e.move_up(_delta)}
  end

  def move_down(delta)
    points.each { |point| point.move_down(delta) }
  end

  def move_left(delta)
    points.each { |point| point.move_left(delta) }
  end

  def move_right(delta)
    points.each { |point| point.move_right(delta) }
  end
end

