# frozen_string_literal: true

class Complex_number
  attr_accessor :a, :b
  def initialize(a, b)
    @a = a
    @b = b
  end

  def +(other)
    Complex_number.new(@a + other.a, @b + other.b)
  end

  def to_s
    "#{@a} #{@b.positive? ? '+' : '-' } #{@b.abs}i"
  end

end
