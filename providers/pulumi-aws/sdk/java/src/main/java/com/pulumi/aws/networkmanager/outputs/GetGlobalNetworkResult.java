// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGlobalNetworkResult {
    /**
     * @return The ARN of the global network.
     * 
     */
    private final String arn;
    /**
     * @return The description of the global network.
     * 
     */
    private final String description;
    private final String globalNetworkId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A map of resource tags.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetGlobalNetworkResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("globalNetworkId") String globalNetworkId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.description = description;
        this.globalNetworkId = globalNetworkId;
        this.id = id;
        this.tags = tags;
    }

    /**
     * @return The ARN of the global network.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The description of the global network.
     * 
     */
    public String description() {
        return this.description;
    }
    public String globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A map of resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String globalNetworkId;
        private String id;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.id = defaults.id;
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
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetGlobalNetworkResult build() {
            return new GetGlobalNetworkResult(arn, description, globalNetworkId, id, tags);
        }
    }
}
