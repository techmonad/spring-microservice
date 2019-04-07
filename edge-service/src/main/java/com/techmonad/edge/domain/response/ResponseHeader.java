package com.techmonad.edge.domain.response;

import java.util.List;

public class ResponseHeader {

	private String requestId;
	private String responseId;
	private String statusCode;
	private String statusMessage;
	private List<ErrorMessage> errorCodes;

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the responseId
	 */
	public String getResponseId() {
		return responseId;
	}

	/**
	 * @param responseId the responseId to set
	 */
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the errorCodes
	 */
	public List<ErrorMessage> getErrorCodes() {
		return errorCodes;
	}

	/**
	 * @param errorCodes the errorCodes to set
	 */
	public void setErrorCodes(List<ErrorMessage> errorCodes) {
		this.errorCodes = errorCodes;
	}

}
