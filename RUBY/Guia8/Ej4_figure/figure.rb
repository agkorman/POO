# frozen_string_literal: true

require_relative '../Ej3_point/point.rb'

class Figure
  def initialize
   raise 'No se puede instanciar una Figura'
  end
  def perimeter
    raise "No se puede instanciar el método perímetro"
  end

  def area
    raise "No se puede instanciar el método area"
  end
end

class Rectangle < Figure
 def initialize(top_left_point, bottom_right_point)
   @top_left_point = top_left_point
   @bottom_right_point = bottom_right_point
 end

 def base
   (@top_left_point.x - @bottom_right_point.x).abs
 end

 def height
   (@top_left_point.y - @bottom_right_point.y).abs
 end

 def area
   base * height
 end

 def perimeter
   (base + height) * 2
 end

 def to_s
   "Rectángulo [ #{@top_left_point} , #{@bottom_right_point} ]"
 end
end

class Triangle < Figure
 def initialize(first_point, second_point, third_point)
   @first_point = first_point
   @second_point = second_point
   @third_point = third_point 
 end

 def area
   semiperimiter = (first_side + second_side + third_side) / 2
   Math.sqrt(semiperimiter * (semiperimiter - first_side) * (semiperimiter - second_side) * (semiperimiter - third_side))
 end

 def perimeter
   first_side + second_side + third_side
 end

 def to_s
   "Triángulo [ #{@first_point} , #{@second_point} , #{@third_point} ]"
 end

 private
 def first_side
   @first_point.distance(@second_point)
 end

 def second_side
   @second_point.distance(@third_point)
 end

 def third_side
   @third_point.distance(@first_point)
 end
end

class Ellipse < Figure
 def initialize(center_point, smayor_axis, sminor_axis)
   @center_point = center_point
   @smayor_axis = smayor_axis
   @sminor_axis = sminor_axis 
 end

 def area
   Math::PI / 4 * @smayor_axis * @sminor_axis
 end

 def perimeter
   Math::PI / 2 * (@smayor_axis + @sminor_axis)
 end

 def to_s
   "Elipse [Centro: #{@center_point}, DMayor: #{@smayor_axis}, DMenor: #{@sminor_axis}]"
 end
end

class Circle < Ellipse
 def initialize(center_point, radius)
   super(center_point, 2 * radius, 2 * radius)
 end

 def to_s
   "Círculo [Centro: #{@center_point} , Radio: #{@smayor_axis / 2}]"
 end
end

p1 = Point.new(0, 0)
p2 = Point.new(3, 0)
p3 = Point.new(0, 4)

rectangle = Rectangle.new(p1, p2)
triangle = Triangle.new(p1, p2, p3)
circle = Circle.new(Point.new(1, 1), 1)

puts rectangle.to_s
puts "Área del rectángulo: #{rectangle.area}"
puts "Perímetro del rectángulo: #{rectangle.perimeter}"

puts triangle.to_s
puts "Área del triángulo: #{triangle.area}"
puts "Perímetro del triángulo: #{triangle.perimeter}"

puts circle.to_s
puts "Área del círculo: #{circle.area}"
puts "Perímetro del círculo: #{circle.perimeter}"

