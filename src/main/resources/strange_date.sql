CREATE TABLE IF NOT EXISTS strange_date (
  id SERIAL PRIMARY KEY,
  code TEXT UNIQUE,
  valid_to DATE DEFAULT 'infinity'::DATE
);