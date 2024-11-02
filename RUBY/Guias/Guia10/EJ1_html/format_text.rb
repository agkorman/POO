# frozen_string_literal: true
require_relative 'html_text'
require_relative 'plain_text'
class FormatText < PlainText
  def initialize(content, format)
    super(content)
    @format = format
  end
  def source
    "<#{@format}>#{super}<#{@format}"
  end
end
