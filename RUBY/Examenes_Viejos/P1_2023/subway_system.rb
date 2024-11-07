# frozen_string_literal: true

require_relative 'subway_line'
require_relative 'subway_station'
require 'sorted_set'

class SubwaySystem
  def initialize(name)
    @name = name
    @lines = {}
  end

  def add_station(line, station_name)
    line = SubwayLine.new(line)
    @lines[line] = SortedSet.new unless @lines.key?(line)
    station = SubwayStation.new(station_name)
    @lines[line].add(station)
    station
  end

  def lines
    @lines.keys
  end

  def stations(line)
    @lines[line].stations
  end

end
