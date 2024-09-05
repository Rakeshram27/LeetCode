# Write your MySQL query statement below
select weather.id as 'ID' from weather join weather w on DATEDIFF(weather.recordDate, w.recordDate) = 1 and weather.Temperature > w.Temperature;