# frozen_string_literal: true

class TeamPosition
  include Comparable
  def initialize(team)
    @Team = team
    @GF = 0
    @GE = 0
    @Points = 0
  end

  def <=>(other)
    return nil unless other.is_a?(TeamPosition)
    [@Points, @GF - @GE, @Team] <=> [other.Points, other.GF - other.GE, other.Team]
  end

  def update_position(gf, ge)
    if gf > ge
      @Points += 3
    elsif gf == ge
      @Points += 1
    end
    @GE += ge
    @GF += gf
  end

  def to_s
    "#{@Team} #{@Points} #{@GF} #{@GE}"
  end

  private attr_accessor :Points, :GE, :GF, :Team
end
