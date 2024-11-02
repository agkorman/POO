# frozen_string_literal: true

require_relative 'format_text'

class LinkText < PlainText
  def initialize(content, link)
    super(content)
    @link = link
  end
  def source
    "<a href:\"#{@link}\">#{super}</a>"
  end
end
