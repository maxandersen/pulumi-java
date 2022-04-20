// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRouteResult {
    /**
     * The create time of the resource.
     * 
     */
    private final String createTime;
    /**
     * Destination address for connection
     * 
     */
    private final String destinationAddress;
    /**
     * Destination port for connection
     * 
     */
    private final Integer destinationPort;
    /**
     * Display name.
     * 
     */
    private final String displayName;
    /**
     * Labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource&#39;s name.
     * 
     */
    private final String name;
    /**
     * The update time of the resource.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetRouteResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("destinationAddress") String destinationAddress,
        @CustomType.Parameter("destinationPort") Integer destinationPort,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.destinationAddress = destinationAddress;
        this.destinationPort = destinationPort;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * The create time of the resource.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Destination address for connection
     * 
    */
    public String destinationAddress() {
        return this.destinationAddress;
    }
    /**
     * Destination port for connection
     * 
    */
    public Integer destinationPort() {
        return this.destinationPort;
    }
    /**
     * Display name.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Labels.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The resource&#39;s name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The update time of the resource.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destinationAddress;
        private Integer destinationPort;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPort = defaults.destinationPort;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = Objects.requireNonNull(destinationAddress);
            return this;
        }
        public Builder destinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetRouteResult build() {
            return new GetRouteResult(createTime, destinationAddress, destinationPort, displayName, labels, name, updateTime);
        }
    }
}
