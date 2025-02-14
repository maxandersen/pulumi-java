// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.GetQueueOutboundCallerConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetQueueResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    private final String arn;
    /**
     * @return Specifies the description of the Queue.
     * 
     */
    private final String description;
    /**
     * @return Specifies the identifier of the Hours of Operation.
     * 
     */
    private final String hoursOfOperationId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;
    /**
     * @return Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    private final Integer maxContacts;
    private final String name;
    /**
     * @return A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    private final List<GetQueueOutboundCallerConfig> outboundCallerConfigs;
    /**
     * @return The identifier for the Queue.
     * 
     */
    private final String queueId;
    /**
     * @return Specifies the description of the Queue. Values are `ENABLED` or `DISABLED`.
     * 
     */
    private final String status;
    /**
     * @return A map of tags assigned to the Queue.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetQueueResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("hoursOfOperationId") String hoursOfOperationId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("maxContacts") Integer maxContacts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundCallerConfigs") List<GetQueueOutboundCallerConfig> outboundCallerConfigs,
        @CustomType.Parameter("queueId") String queueId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.description = description;
        this.hoursOfOperationId = hoursOfOperationId;
        this.id = id;
        this.instanceId = instanceId;
        this.maxContacts = maxContacts;
        this.name = name;
        this.outboundCallerConfigs = outboundCallerConfigs;
        this.queueId = queueId;
        this.status = status;
        this.tags = tags;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Specifies the description of the Queue.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Specifies the identifier of the Hours of Operation.
     * 
     */
    public String hoursOfOperationId() {
        return this.hoursOfOperationId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    public Integer maxContacts() {
        return this.maxContacts;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    public List<GetQueueOutboundCallerConfig> outboundCallerConfigs() {
        return this.outboundCallerConfigs;
    }
    /**
     * @return The identifier for the Queue.
     * 
     */
    public String queueId() {
        return this.queueId;
    }
    /**
     * @return Specifies the description of the Queue. Values are `ENABLED` or `DISABLED`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the Queue.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String hoursOfOperationId;
        private String id;
        private String instanceId;
        private Integer maxContacts;
        private String name;
        private List<GetQueueOutboundCallerConfig> outboundCallerConfigs;
        private String queueId;
        private String status;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.hoursOfOperationId = defaults.hoursOfOperationId;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.maxContacts = defaults.maxContacts;
    	      this.name = defaults.name;
    	      this.outboundCallerConfigs = defaults.outboundCallerConfigs;
    	      this.queueId = defaults.queueId;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder hoursOfOperationId(String hoursOfOperationId) {
            this.hoursOfOperationId = Objects.requireNonNull(hoursOfOperationId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder maxContacts(Integer maxContacts) {
            this.maxContacts = Objects.requireNonNull(maxContacts);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundCallerConfigs(List<GetQueueOutboundCallerConfig> outboundCallerConfigs) {
            this.outboundCallerConfigs = Objects.requireNonNull(outboundCallerConfigs);
            return this;
        }
        public Builder outboundCallerConfigs(GetQueueOutboundCallerConfig... outboundCallerConfigs) {
            return outboundCallerConfigs(List.of(outboundCallerConfigs));
        }
        public Builder queueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetQueueResult build() {
            return new GetQueueResult(arn, description, hoursOfOperationId, id, instanceId, maxContacts, name, outboundCallerConfigs, queueId, status, tags);
        }
    }
}
