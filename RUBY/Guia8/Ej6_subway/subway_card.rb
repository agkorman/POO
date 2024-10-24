
require_relative 'subway_central'

class SubwayCard
  def initialize(sc)
    @sc = sc #sc -> subway central
  end

  def ride 
    raise "Can\'t use this card"
  end

  def can_ride?
    raise "Can\'t use this card"
  end

  def to_s
    "Subway Card [Central: #{@sc}]"
  end
end

class FixedSubwayCard < SubwayCard
  def initialize(sc, rides)
    super(sc)
    raise "Invalid rides" unless rides.is_a?(Integer) && rides.positive?
    @rides = rides 
  end

  private def ride?
    @rides.positive?
  end

  def ride
    raise 'No rides available' unless ride?
    @rides -= 1
  end

  def to_s
    "Fixed #{super} [Rides: #{@rides}]"
  end
  
end

class RechargeableSC < SubwayCard
  def initialize(sc)
    super(sc)
    @ride_cost = sc.ride_cost
    @balance = 0
  end
  def recharge(amount)
    raise 'Invalid amount' unless amount.is_a?(Numeric) && amount.positive?
    @balance += amount
  end
  private def ride?
    (@balance - @ride_cost).positive?
  end
  def ride
    raise "Not enough funds" unless ride?
  end
  def to_s
    "Rechargeable #{super} [Balance: #{@balance}]"
  end
end

class DiscountRSC < RechargeableSC
  def initialize(sc, discountp)
    super(sc)
    raise 'Invalid discount' unless discountp.is_a?(Numeric) &&
      discountp >= 0 && discountp <= 1
    @discountp = discountp
    @ride_cost = sc.ride_cost * (1 - discountp)
  end
end





