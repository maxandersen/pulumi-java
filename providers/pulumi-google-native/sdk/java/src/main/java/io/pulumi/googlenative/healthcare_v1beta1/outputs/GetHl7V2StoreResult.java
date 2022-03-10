// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.Hl7V2NotificationConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ParserConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetHl7V2StoreResult {
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
     */
    private final String name;
    /**
     * The notification destination all messages (both Ingest & Create) are published on. Only the message name is sent as part of the notification. If this is unset, no notifications are sent. Supplied by the client.
     * 
     */
    private final NotificationConfigResponse notificationConfig;
    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
     */
    private final List<Hl7V2NotificationConfigResponse> notificationConfigs;
    /**
     * The configuration for the parser. It determines how the server parses the messages.
     * 
     */
    private final ParserConfigResponse parserConfig;
    /**
     * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
     */
    private final Boolean rejectDuplicateMessage;

    @OutputCustomType.Constructor
    private GetHl7V2StoreResult(
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notificationConfig") NotificationConfigResponse notificationConfig,
        @OutputCustomType.Parameter("notificationConfigs") List<Hl7V2NotificationConfigResponse> notificationConfigs,
        @OutputCustomType.Parameter("parserConfig") ParserConfigResponse parserConfig,
        @OutputCustomType.Parameter("rejectDuplicateMessage") Boolean rejectDuplicateMessage) {
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.notificationConfigs = notificationConfigs;
        this.parserConfig = parserConfig;
        this.rejectDuplicateMessage = rejectDuplicateMessage;
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The notification destination all messages (both Ingest & Create) are published on. Only the message name is sent as part of the notification. If this is unset, no notifications are sent. Supplied by the client.
     * 
    */
    public NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only the message name is sent as part of the notification. Supplied by the client.
     * 
    */
    public List<Hl7V2NotificationConfigResponse> getNotificationConfigs() {
        return this.notificationConfigs;
    }
    /**
     * The configuration for the parser. It determines how the server parses the messages.
     * 
    */
    public ParserConfigResponse getParserConfig() {
        return this.parserConfig;
    }
    /**
     * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store. The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
     * 
    */
    public Boolean getRejectDuplicateMessage() {
        return this.rejectDuplicateMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHl7V2StoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String name;
        private NotificationConfigResponse notificationConfig;
        private List<Hl7V2NotificationConfigResponse> notificationConfigs;
        private ParserConfigResponse parserConfig;
        private Boolean rejectDuplicateMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHl7V2StoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.notificationConfigs = defaults.notificationConfigs;
    	      this.parserConfig = defaults.parserConfig;
    	      this.rejectDuplicateMessage = defaults.rejectDuplicateMessage;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationConfig(NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }

        public Builder setNotificationConfigs(List<Hl7V2NotificationConfigResponse> notificationConfigs) {
            this.notificationConfigs = Objects.requireNonNull(notificationConfigs);
            return this;
        }

        public Builder setParserConfig(ParserConfigResponse parserConfig) {
            this.parserConfig = Objects.requireNonNull(parserConfig);
            return this;
        }

        public Builder setRejectDuplicateMessage(Boolean rejectDuplicateMessage) {
            this.rejectDuplicateMessage = Objects.requireNonNull(rejectDuplicateMessage);
            return this;
        }
        public GetHl7V2StoreResult build() {
            return new GetHl7V2StoreResult(labels, name, notificationConfig, notificationConfigs, parserConfig, rejectDuplicateMessage);
        }
    }
}
