package uk.co.techblue.docusign.client.dto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class AuditEvent {
	private DateFormat iso8601DateFormat = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss");
	public static final String LOG_TIME = "logTime";
	public static final String SOURCE = "Source";
	public static final String USERNAME = "UserName";
	public static final String USER_ID = "UserId";
	public static final String ACTION = "Action";
	public static final String MESSAGE = "Message";
	public static final String ENVELOPE_STATUS = "EnvelopeStatus";
	public static final String CLIENT_IP_ADDRESS = "ClientIPAddress";
	public static final String INFORMATION = "Information";
	public static final String GEO_LOCATION = "GeoLocation";
	public static final String LANGUAGE = "Language";
	
	/** The envelope fields. */
	@JsonProperty
	private List<AuditEventField> eventFields;

	private Map<String, String> eventFieldMap;
	
	public List<AuditEventField> getEventFields() {
		return eventFields;
	}
	
	public Map<String, String> getMap() {
		if (eventFieldMap == null) {
			synchronized (AuditEvent.class) {
				if (eventFieldMap == null) {
					synchronized (AuditEvent.class) {
						eventFieldMap = new HashMap<String, String>(eventFields.size());
						for (AuditEventField field : eventFields) {
							eventFieldMap.put(field.getName(), field.getValue());
						}
					}
				}
			}
		}
		
		return eventFieldMap;
	}
	
	public String getEventField (String key) {
		return getMap().get(key);
	}
	
	public Date getLogTime() {
		String value = getEventField(LOG_TIME);
		Date datetime = null;
		if (value != null) {
			try {
				datetime = iso8601DateFormat.parse(value);
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return datetime;
	}
	
	public String getMessage() {
		String message = getEventField(MESSAGE);
		
		return message;
	}
	
	public String getAction() {
		String action = getEventField(ACTION);
		
		return action;
	}
	
	public String getGeoLocation() {
		String geoLocation = getEventField(GEO_LOCATION);
		
		return geoLocation;
	}
}
