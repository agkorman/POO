# frozen_string_literal: true


class WorldCup

  def initialize
    @groups = {}
  end
  # no se puede modificar
  def add_team(group, team)
    @groups[group] = {} unless @groups.key?(group)
    @groups[group][team] = TeamPosition.new(team)
  end

  def play_match(group, team1, team2, team1_goals, team2_goals)
    raise "Such #{group} does not exist" unless @groups.key?(group)
    raise "Invalid teams" if !@groups[group].key?(team1) or !@groups[group].key?(team2)
    @groups[group][team1].update_position(team1_goals, team2_goals)
    @groups[group][team2].update_position(team1_goals, team2_goals)
  end

  def to_s
    s = "World Cup\n"
    @groups.keys.sort.each do |key|
      s += "#{key}\n"
      s += "Team\tP\tGF\tGE"
      @groups[key].values.sort.each { |team_position| s += team_position.to_s}
    end
    s
  end

end
