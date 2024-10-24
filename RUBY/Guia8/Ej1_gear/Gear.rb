class Gear
  def initialize(chainring, cog, rim, tire)
    @chainring = chainring
    @cog = cog
    @tire = tire
    @rim = rim
  end

  def ratio
    @chainring / @cog.to_f
  end

  def gear_inches
    ratio * wheel_diameter
  end

  def wheel_diameter
    @rim + (@tire * 2)
  end
end
