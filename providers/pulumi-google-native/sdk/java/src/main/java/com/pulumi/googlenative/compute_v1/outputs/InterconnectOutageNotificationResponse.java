// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InterconnectOutageNotificationResponse {
    /**
     * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be affected.
     * 
     */
    private final List<String> affectedCircuits;
    /**
     * A description about the purpose of the outage.
     * 
     */
    private final String description;
    /**
     * Scheduled end time for the outage (milliseconds since Unix epoch).
     * 
     */
    private final String endTime;
    /**
     * Form this outage is expected to take, which can take one of the following values: - OUTAGE: The Interconnect may be completely out of service for some or all of the specified window. - PARTIAL_OUTAGE: Some circuits comprising the Interconnect as a whole should remain up, but with reduced bandwidth. Note that the versions of this enum prefixed with &#34;IT_&#34; have been deprecated in favor of the unprefixed values.
     * 
     */
    private final String issueType;
    /**
     * Unique identifier for this outage notification.
     * 
     */
    private final String name;
    /**
     * The party that generated this notification, which can take the following value: - GOOGLE: this notification as generated by Google. Note that the value of NSRC_GOOGLE has been deprecated in favor of GOOGLE.
     * 
     */
    private final String source;
    /**
     * Scheduled start time for the outage (milliseconds since Unix epoch).
     * 
     */
    private final String startTime;
    /**
     * State of this notification, which can take one of the following values: - ACTIVE: This outage notification is active. The event could be in the past, present, or future. See start_time and end_time for scheduling. - CANCELLED: The outage associated with this notification was cancelled before the outage was due to start. - COMPLETED: The outage associated with this notification is complete. Note that the versions of this enum prefixed with &#34;NS_&#34; have been deprecated in favor of the unprefixed values.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private InterconnectOutageNotificationResponse(
        @CustomType.Parameter("affectedCircuits") List<String> affectedCircuits,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("issueType") String issueType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state) {
        this.affectedCircuits = affectedCircuits;
        this.description = description;
        this.endTime = endTime;
        this.issueType = issueType;
        this.name = name;
        this.source = source;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs that will be affected.
     * 
    */
    public List<String> affectedCircuits() {
        return this.affectedCircuits;
    }
    /**
     * A description about the purpose of the outage.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Scheduled end time for the outage (milliseconds since Unix epoch).
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * Form this outage is expected to take, which can take one of the following values: - OUTAGE: The Interconnect may be completely out of service for some or all of the specified window. - PARTIAL_OUTAGE: Some circuits comprising the Interconnect as a whole should remain up, but with reduced bandwidth. Note that the versions of this enum prefixed with &#34;IT_&#34; have been deprecated in favor of the unprefixed values.
     * 
    */
    public String issueType() {
        return this.issueType;
    }
    /**
     * Unique identifier for this outage notification.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The party that generated this notification, which can take the following value: - GOOGLE: this notification as generated by Google. Note that the value of NSRC_GOOGLE has been deprecated in favor of GOOGLE.
     * 
    */
    public String source() {
        return this.source;
    }
    /**
     * Scheduled start time for the outage (milliseconds since Unix epoch).
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * State of this notification, which can take one of the following values: - ACTIVE: This outage notification is active. The event could be in the past, present, or future. See start_time and end_time for scheduling. - CANCELLED: The outage associated with this notification was cancelled before the outage was due to start. - COMPLETED: The outage associated with this notification is complete. Note that the versions of this enum prefixed with &#34;NS_&#34; have been deprecated in favor of the unprefixed values.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectOutageNotificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> affectedCircuits;
        private String description;
        private String endTime;
        private String issueType;
        private String name;
        private String source;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectOutageNotificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCircuits = defaults.affectedCircuits;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.issueType = defaults.issueType;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder affectedCircuits(List<String> affectedCircuits) {
            this.affectedCircuits = Objects.requireNonNull(affectedCircuits);
            return this;
        }
        public Builder affectedCircuits(String... affectedCircuits) {
            return affectedCircuits(List.of(affectedCircuits));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder issueType(String issueType) {
            this.issueType = Objects.requireNonNull(issueType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public InterconnectOutageNotificationResponse build() {
            return new InterconnectOutageNotificationResponse(affectedCircuits, description, endTime, issueType, name, source, startTime, state);
        }
    }
}
