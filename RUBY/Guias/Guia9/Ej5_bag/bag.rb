require_relative '../../Guia8/Ej3_point/point.rb'

class Bag
  def initialize
    @elements = Hash.new {}
  end

  def add(elem)
    @elements[elem] = 0 unless @elements.key? elem
    @elements[elem] += 1
  end

  def size
    @elements.length
  end

  def count(elem)
    return 0 unless @elements.key? elem
    @elements[elem]
  end

  def delete(elem)
    @elements[elem] -= 1 if @elements.key? elem
    ans = @elements[elem]
    @elements.delete(elem) if @elements[elem].zero?
    ans
  end

  def to_s
    @elements.to_s
  end
end

p bag = Bag.new
p bag.add(1)
p bag.add(1)
p bag.count(1)

