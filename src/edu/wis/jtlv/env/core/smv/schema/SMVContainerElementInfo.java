package edu.wis.jtlv.env.core.smv.schema;

import edu.wis.jtlv.env.core.smv.SMVParseException;

public abstract class SMVContainerElementInfo extends SMVAbstractElementInfo {

	public SMVContainerElementInfo(Boolean visible, String a_name, SMVParsingInfo a_parse_info)
			throws SMVParseException {
		super(visible, a_name, a_parse_info);
	}
}
