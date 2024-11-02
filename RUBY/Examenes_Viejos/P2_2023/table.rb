# frozen_string_literal: true

class Table
  include Comparable
  attr_reader :name, :chairs
  def initialize(name, chairs)
   @name = name
   @chairs = chairs
  end

  def to_s
    "Table #{@name} for #{@chairs} people"
  end

  def <=>(other)
    return nil unless other.is_a?(Table)
    [other.chairs, @name] <=> [@capacity, other.name]
  end
end
