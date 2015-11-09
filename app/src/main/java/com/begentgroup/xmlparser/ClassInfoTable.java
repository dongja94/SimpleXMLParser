package com.begentgroup.xmlparser;

import java.lang.reflect.Field;
import java.util.HashMap;

class ClassInfoTable {
	Field[] fields;
	FieldInfo defaultField;
	HashMap<String,FieldInfo> fieldInfos = new HashMap<String,FieldInfo>();
}
