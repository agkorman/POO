

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
    @items = Set[]
    @id = @@id
    @@id += 1
  end

  def add(product, amount)
    @items.add(Item.new(product, amount))
  end



  private def total
    @items.map { |item| item.subtotal }.reduce {:+}
  end

  def to_s
    s = "Ticket N #{@id}\n##########\n"
    @items.each {|item| s += "#{item.to_s}\n"}
    s += "##########"
  end
end


class Product
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

  def ==(other)
    return false unless other.is_a?(Product) && @description.eql?(other.descrption) &&
      @price.eql?(other.price)
  end
end


