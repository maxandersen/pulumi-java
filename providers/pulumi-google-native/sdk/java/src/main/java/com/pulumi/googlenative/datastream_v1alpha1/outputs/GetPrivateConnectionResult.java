// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.ErrorResponse;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.VpcPeeringConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPrivateConnectionResult {
    /**
     * The create time of the resource.
     * 
     */
    private final String createTime;
    /**
     * Display name.
     * 
     */
    private final String displayName;
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
     */
    private final ErrorResponse error;
    /**
     * Labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource's name.
     * 
     */
    private final String name;
    /**
     * The state of the Private Connection.
     * 
     */
    private final String state;
    /**
     * The update time of the resource.
     * 
     */
    private final String updateTime;
    /**
     * VPC Peering Config
     * 
     */
    private final VpcPeeringConfigResponse vpcPeeringConfig;

    @CustomType.Constructor
    private GetPrivateConnectionResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("error") ErrorResponse error,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("vpcPeeringConfig") VpcPeeringConfigResponse vpcPeeringConfig) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.error = error;
        this.labels = labels;
        this.name = name;
        this.state = state;
        this.updateTime = updateTime;
        this.vpcPeeringConfig = vpcPeeringConfig;
    }

    /**
     * The create time of the resource.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Display name.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * In case of error, the details of the error in a user-friendly format.
     * 
    */
    public ErrorResponse error() {
        return this.error;
    }
    /**
     * Labels.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The resource's name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The state of the Private Connection.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The update time of the resource.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * VPC Peering Config
     * 
    */
    public VpcPeeringConfigResponse vpcPeeringConfig() {
        return this.vpcPeeringConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private ErrorResponse error;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        private VpcPeeringConfigResponse vpcPeeringConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.vpcPeeringConfig = defaults.vpcPeeringConfig;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder error(ErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vpcPeeringConfig(VpcPeeringConfigResponse vpcPeeringConfig) {
            this.vpcPeeringConfig = Objects.requireNonNull(vpcPeeringConfig);
            return this;
        }        public GetPrivateConnectionResult build() {
            return new GetPrivateConnectionResult(createTime, displayName, error, labels, name, state, updateTime, vpcPeeringConfig);
        }
    }
}
