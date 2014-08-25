$ ->
  $.get "/skills", (skills) ->
    $.each skills, (index, skill) ->
      $('#skills').append $("<li>").text skill.name