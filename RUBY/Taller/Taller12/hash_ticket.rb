# frozen_string_literal: true



class Item
  attr_accessor :product, :amount
  def initialize(product, amount)
    @product = product
    @amount = amount
  end

  def ==(other)
    return false unless other.is_a?(Item)
    @product == other.product
  end

  alias_method :eql?, :==

  def <=>(other)
    return nil unless other.is_a?(Item)
    @product <=> other.product
  end

  def hash
    [@product, @amount].hash
  end


  def to_s
    "#{@product.description}\t#{@amount}  $#{@product.price}"
  end

  def subtotal
    @product.price * @amount
  end
end

class Ticket
  @@id = 1000
  def initialize
    @items = Hash.new { 0 } # set default value for every key = 0
    @id = @@id
    @@id += 1
  end

  def add(product, amount)
    @items[product] += amount
  end

  alias_method :eql?, :==

  private def total
    @items.map { |item| item.subtotal }.reduce {:+}
  end

  def to_s
    @items.values.each { |items| s += "#{item}\n"}
  end

  def total
    @items.values.map { |item| item.total}.reduce {|accum, e| accum + e}
  end
end

class Product
  include Comparable
  attr_reader :price, :description
  def initialize(description, price)
    @description = description
    @price = price
  end

  def hash
    [@price, @description].hash
  end

  def <=>(other)
    return nil unless other.is_a?(Product)
    [@price, @description] <=> [other.price, other.description]
  end

  alias_method :eql, :==

  def ==(other)
    false unless other.is_a?(Product) && @description.eql?(other.description) &&
    @price.eql?(other.price)
  end
end



