# frozen_string_literal: true

require_relative 'pavilion'
class Museum
  def initialize
    @pavilions = []
  end

  def add_exhibition(pavilion, name, theme)
    idx = @pavilions.find_index(pavilion)
    if idx.nil?
      @pavilions << pavilion
      idx = @pavilions.size - 1
    end
    @pavilions[idx].add_exhibition(name, theme)
  end

  def pavilion_exhibits(pavilion)
    idx = @pavilions.find_index(pavilion)
    if idx.nil?
      return nil
    end
    @pavilions[idx].exhibitions
  end
  attr_accessor :pavilions
end

class ThemedMuseum < Museum
  def initialize(theme)
    super()
    @theme = theme
    @pavilions = []
  end

  def add_exhibition(themed_pavilion, name, theme)
    idx = @pavilions.find_index(themed_pavilion)
    if idx.nil?
      @pavilions << themed_pavilion
      idx = @pavilions.size - 1
    end
    @pavilions[idx].add_exhibition
  end
end
