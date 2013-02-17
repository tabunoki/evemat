select
  TYPE_ID,
  ALL_VOLUME,
  ALL_AVERAGE,
  ALL_MAX,
  ALL_MIN,
  ALL_MEDIAN,
  ALL_STANDARD_DEVIATION,
  SELL_VOLUME,
  SELL_AVERAGE,
  SELL_MAX,
  SELL_MIN,
  SELL_MEDIAN,
  SELL_STANDARD_DEVIATION,
  BUY_VOLUME,
  BUY_AVERAGE,
  BUY_MAX,
  BUY_MIN,
  BUY_MEDIAN,
  BUY_STANDARD_DEVIATION,
  UPDATE_TIME
from
  PRODUCT_PRICE
where
  TYPE_ID = /* typeId */1
