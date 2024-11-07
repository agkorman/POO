# frozen_string_literal: true

require_relative 'exhibition'
class Pavilion
  include Comparable
  def initialize(name, max_exhibitions)
    @name = name
    @max_exhibitions = max_exhibitions
    @current_exhibitions = 0
    @exhibitions = []
  end

  def add_exhibition(name, theme)
    raise "Pavilion cannot host any more exhibitions" if @current_exhibitions == @max_exhibitions
    @exhibitions << Exhibition.new(name, theme)
  end

  def <=>(other)
    return nil unless other.is_a?(Pavilion)
    [@name, @max_exhibitions] <=> [other.name, other.max_exhibitions]
  end

  def to_s
    "Pavilion #{@name} with cap #{@max_exhibitions}"
  end
  attr_reader :max_exhibitions, :name, :exhibitions
end

class ThemedPavilion < Pavilion
  def initialize(name, max_exhibitions, theme)
    super(name, max_exhibitions)
    @theme = theme
  end

  def add_exhibition(name, theme)
    raise "This pavilion is only for #{@theme} themed exhibitions" unless @theme == theme
    super(name, theme)
  end
end
