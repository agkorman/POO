# frozen_string_literal: true

class SubwayLine
  include Comparable
  def initialize(letter)
    @letter = letter
    @stations = []
  end

  def to_s
    "Subway Line #{letter}"
  end

  def ==(other)
    return false unless other.is_a?(SubwayLine)
    @letter == letter
  end

  def hash
    [@letter].hash
  end

  def <=>(other)
    return nil unless other.is_a?(SubwayLine)
    @letter <=> other.letter
  end

  def add_station(station_name)
    @stations << SubwayStation.new(station_name)
  end

  alias_method :eql?, :==

  protected attr_reader :letter
end

