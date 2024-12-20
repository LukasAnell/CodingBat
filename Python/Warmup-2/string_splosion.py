def string_splosion(str):
  out = ""
  for i in range(len(str) + 1):
    out += str[:i]
  return out
