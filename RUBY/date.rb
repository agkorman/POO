# frozen_string_literal: true

class Date

  @day
  @month
  @year

  def initialize(day, month, year)
    @day = day
    @month = month
    @year = year
  end

  def to_s
    "#{@day}-#{@month}-#{@year}"
  end

end

mi_fecha = Date.new(10, 10, 2007)
puts mi_fecha.to_s