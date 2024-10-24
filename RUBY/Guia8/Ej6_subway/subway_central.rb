
class SubwayCentral
  attr_accessor :ride_cost
  def initialize(ride_cost)
    @ride_cost = ride_cost
  end

  def to_s
    "Ride cost = #{@ride_cost}"
  end
end

sc = SubwayCentral.new(10)
puts sc.ride_cost
