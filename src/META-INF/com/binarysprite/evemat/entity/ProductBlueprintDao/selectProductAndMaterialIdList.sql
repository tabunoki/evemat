select
	distinct(TYPE_ID_LIST.TYPE_ID)
from (
	select
		distinct(MATERIAL.TYPE_ID) as TYPE_ID
	from
		MATERIAL
	inner join
		BLUEPRINT
	on
		MATERIAL.TYPE_ID = BLUEPRINT.PRODUCT_TYPE_ID
	inner join
		PRODUCT_BLUEPRINT
	on
		BLUEPRINT.BLUEPRINT_TYPE_ID =  PRODUCT_BLUEPRINT.BLUEPRINT_TYPE_ID
	union select
		distinct(MATERIAL.MATERIAL_TYPE_ID) as TYPE_ID
	from
		MATERIAL
	inner join
		BLUEPRINT
	on
		MATERIAL.TYPE_ID = BLUEPRINT.PRODUCT_TYPE_ID
	inner join
		PRODUCT_BLUEPRINT
	on
		BLUEPRINT.BLUEPRINT_TYPE_ID =  PRODUCT_BLUEPRINT.BLUEPRINT_TYPE_ID) as TYPE_ID_LIST
order by
	TYPE_ID_LIST.TYPE_ID
