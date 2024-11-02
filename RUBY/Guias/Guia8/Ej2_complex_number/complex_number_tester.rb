# frozen_string_literal: true

require_relative 'complex_number'

first_complex = Complex_number.new(2, -1)
second_complex = Complex_number.new(3, 0)
res_complex = first_complex + second_complex
puts res_complex.a.to_s + ' + ' + res_complex.b.to_s + 'i'
# Imprime 5 + -1i
