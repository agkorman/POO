# frozen_string_literal: true

class Pares
  a = 1
  while a <= 100
    puts a if a.even?
    a+=1
  end
end

101.times { |a| puts a if a.nonzero? && a.even? }