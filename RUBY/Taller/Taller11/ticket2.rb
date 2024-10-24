
# frozen_string_literal: true
class Item
  attr_accessor :product, :amount
  def initialize(product, amount)
    @product = product
    @amount = amount
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
    @items = []
    @id = @@id
    @@id += 1
  end

  def add(product, amount)
    found = false
    @items.each do |item|
      if item.product == product
        item.increment_amount(amount)
        found = true
      end
    end
    @items << Item.new(product, amount) unless found
  end

  private def increment_amount(amount)
    @amount += amount
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
end

