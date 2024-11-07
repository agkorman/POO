# frozen_string_literal: true

require_relative 'section'
require_relative 'table'
require 'sorted_set'

class Restaurant
  def initialize(name)
    @name = name
    @sections = Hash.new
  end

  def add_table(section, name, chairs)
    @sections[section] = SortedSet.new if @sections[section].nil?
    @sections[section] << Table.new(name, chairs)
  end

  def tables(section)
    raise("Section does no exist") if @sections.key?(section)
    @sections[section]
  end

  def section_count
    @sections.size
  end

  def tables_count(section)
    raise("Section does not exist") if @sections[section].key?(section)
    @sections[section].size
  end
end
