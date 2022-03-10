// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ids_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetEndpointResult {
    /**
     * The create time timestamp.
     * 
     */
    private final String createTime;
    /**
     * User-provided description of the endpoint
     * 
     */
    private final String description;
    /**
     * The fully qualified URL of the endpoint's ILB Forwarding Rule.
     * 
     */
    private final String endpointForwardingRule;
    /**
     * The IP address of the IDS Endpoint's ILB.
     * 
     */
    private final String endpointIp;
    /**
     * The labels of the endpoint.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The name of the endpoint.
     * 
     */
    private final String name;
    /**
     * The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    private final String network;
    /**
     * Lowest threat severity that this endpoint will alert on.
     * 
     */
    private final String severity;
    /**
     * Current state of the endpoint.
     * 
     */
    private final String state;
    /**
     * Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    private final Boolean trafficLogs;
    /**
     * The update time timestamp.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor
    private GetEndpointResult(
        @OutputCustomType.Parameter("createTime") String createTime,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("endpointForwardingRule") String endpointForwardingRule,
        @OutputCustomType.Parameter("endpointIp") String endpointIp,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("severity") String severity,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("trafficLogs") Boolean trafficLogs,
        @OutputCustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.endpointForwardingRule = endpointForwardingRule;
        this.endpointIp = endpointIp;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.severity = severity;
        this.state = state;
        this.trafficLogs = trafficLogs;
        this.updateTime = updateTime;
    }

    /**
     * The create time timestamp.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the endpoint
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The fully qualified URL of the endpoint's ILB Forwarding Rule.
     * 
    */
    public String getEndpointForwardingRule() {
        return this.endpointForwardingRule;
    }
    /**
     * The IP address of the IDS Endpoint's ILB.
     * 
    */
    public String getEndpointIp() {
        return this.endpointIp;
    }
    /**
     * The labels of the endpoint.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The name of the endpoint.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Lowest threat severity that this endpoint will alert on.
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    /**
     * Current state of the endpoint.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Whether the endpoint should report traffic logs in addition to threat logs.
     * 
    */
    public Boolean getTrafficLogs() {
        return this.trafficLogs;
    }
    /**
     * The update time timestamp.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String endpointForwardingRule;
        private String endpointIp;
        private Map<String,String> labels;
        private String name;
        private String network;
        private String severity;
        private String state;
        private Boolean trafficLogs;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpointForwardingRule = defaults.endpointForwardingRule;
    	      this.endpointIp = defaults.endpointIp;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.trafficLogs = defaults.trafficLogs;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndpointForwardingRule(String endpointForwardingRule) {
            this.endpointForwardingRule = Objects.requireNonNull(endpointForwardingRule);
            return this;
        }

        public Builder setEndpointIp(String endpointIp) {
            this.endpointIp = Objects.requireNonNull(endpointIp);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrafficLogs(Boolean trafficLogs) {
            this.trafficLogs = Objects.requireNonNull(trafficLogs);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetEndpointResult build() {
            return new GetEndpointResult(createTime, description, endpointForwardingRule, endpointIp, labels, name, network, severity, state, trafficLogs, updateTime);
        }
    }
}
