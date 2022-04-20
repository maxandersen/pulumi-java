// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.ParsedDataResponse;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.PatientIdResponse;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.SchematizedDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMessageResult {
    /**
     * The datetime when the message was created. Set by the server.
     * 
     */
    private final String createTime;
    /**
     * Raw message bytes.
     * 
     */
    private final String data;
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    private final String messageType;
    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    private final String name;
    /**
     * The parsed version of the raw message data.
     * 
     */
    private final ParsedDataResponse parsedData;
    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    private final List<PatientIdResponse> patientIds;
    /**
     * The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
     * 
     */
    private final SchematizedDataResponse schematizedData;
    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    private final String sendFacility;
    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    private final String sendTime;

    @CustomType.Constructor
    private GetMessageResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("messageType") String messageType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parsedData") ParsedDataResponse parsedData,
        @CustomType.Parameter("patientIds") List<PatientIdResponse> patientIds,
        @CustomType.Parameter("schematizedData") SchematizedDataResponse schematizedData,
        @CustomType.Parameter("sendFacility") String sendFacility,
        @CustomType.Parameter("sendTime") String sendTime) {
        this.createTime = createTime;
        this.data = data;
        this.labels = labels;
        this.messageType = messageType;
        this.name = name;
        this.parsedData = parsedData;
        this.patientIds = patientIds;
        this.schematizedData = schematizedData;
        this.sendFacility = sendFacility;
        this.sendTime = sendTime;
    }

    /**
     * The datetime when the message was created. Set by the server.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Raw message bytes.
     * 
    */
    public String data() {
        return this.data;
    }
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The message type for this message. MSH-9.1.
     * 
    */
    public String messageType() {
        return this.messageType;
    }
    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The parsed version of the raw message data.
     * 
    */
    public ParsedDataResponse parsedData() {
        return this.parsedData;
    }
    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
    */
    public List<PatientIdResponse> patientIds() {
        return this.patientIds;
    }
    /**
     * The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
     * 
    */
    public SchematizedDataResponse schematizedData() {
        return this.schematizedData;
    }
    /**
     * The hospital that this message came from. MSH-4.
     * 
    */
    public String sendFacility() {
        return this.sendFacility;
    }
    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
    */
    public String sendTime() {
        return this.sendTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMessageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String data;
        private Map<String,String> labels;
        private String messageType;
        private String name;
        private ParsedDataResponse parsedData;
        private List<PatientIdResponse> patientIds;
        private SchematizedDataResponse schematizedData;
        private String sendFacility;
        private String sendTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.data = defaults.data;
    	      this.labels = defaults.labels;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.parsedData = defaults.parsedData;
    	      this.patientIds = defaults.patientIds;
    	      this.schematizedData = defaults.schematizedData;
    	      this.sendFacility = defaults.sendFacility;
    	      this.sendTime = defaults.sendTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder messageType(String messageType) {
            this.messageType = Objects.requireNonNull(messageType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parsedData(ParsedDataResponse parsedData) {
            this.parsedData = Objects.requireNonNull(parsedData);
            return this;
        }
        public Builder patientIds(List<PatientIdResponse> patientIds) {
            this.patientIds = Objects.requireNonNull(patientIds);
            return this;
        }
        public Builder patientIds(PatientIdResponse... patientIds) {
            return patientIds(List.of(patientIds));
        }
        public Builder schematizedData(SchematizedDataResponse schematizedData) {
            this.schematizedData = Objects.requireNonNull(schematizedData);
            return this;
        }
        public Builder sendFacility(String sendFacility) {
            this.sendFacility = Objects.requireNonNull(sendFacility);
            return this;
        }
        public Builder sendTime(String sendTime) {
            this.sendTime = Objects.requireNonNull(sendTime);
            return this;
        }        public GetMessageResult build() {
            return new GetMessageResult(createTime, data, labels, messageType, name, parsedData, patientIds, schematizedData, sendFacility, sendTime);
        }
    }
}
