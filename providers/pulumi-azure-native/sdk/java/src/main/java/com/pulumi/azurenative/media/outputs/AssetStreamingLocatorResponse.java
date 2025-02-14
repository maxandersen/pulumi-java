// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssetStreamingLocatorResponse {
    /**
     * @return Asset Name.
     * 
     */
    private final String assetName;
    /**
     * @return The creation time of the Streaming Locator.
     * 
     */
    private final String created;
    /**
     * @return Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    private final String defaultContentKeyPolicyName;
    /**
     * @return The end time of the Streaming Locator.
     * 
     */
    private final String endTime;
    /**
     * @return Streaming Locator name.
     * 
     */
    private final String name;
    /**
     * @return The start time of the Streaming Locator.
     * 
     */
    private final String startTime;
    /**
     * @return StreamingLocatorId of the Streaming Locator.
     * 
     */
    private final String streamingLocatorId;
    /**
     * @return Name of the Streaming Policy used by this Streaming Locator.
     * 
     */
    private final String streamingPolicyName;

    @CustomType.Constructor
    private AssetStreamingLocatorResponse(
        @CustomType.Parameter("assetName") String assetName,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("defaultContentKeyPolicyName") String defaultContentKeyPolicyName,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("streamingLocatorId") String streamingLocatorId,
        @CustomType.Parameter("streamingPolicyName") String streamingPolicyName) {
        this.assetName = assetName;
        this.created = created;
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        this.endTime = endTime;
        this.name = name;
        this.startTime = startTime;
        this.streamingLocatorId = streamingLocatorId;
        this.streamingPolicyName = streamingPolicyName;
    }

    /**
     * @return Asset Name.
     * 
     */
    public String assetName() {
        return this.assetName;
    }
    /**
     * @return The creation time of the Streaming Locator.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }
    /**
     * @return The end time of the Streaming Locator.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Streaming Locator name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The start time of the Streaming Locator.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return StreamingLocatorId of the Streaming Locator.
     * 
     */
    public String streamingLocatorId() {
        return this.streamingLocatorId;
    }
    /**
     * @return Name of the Streaming Policy used by this Streaming Locator.
     * 
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetStreamingLocatorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String created;
        private String defaultContentKeyPolicyName;
        private String endTime;
        private String name;
        private String startTime;
        private String streamingLocatorId;
        private String streamingPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetStreamingLocatorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.created = defaults.created;
    	      this.defaultContentKeyPolicyName = defaults.defaultContentKeyPolicyName;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.streamingLocatorId = defaults.streamingLocatorId;
    	      this.streamingPolicyName = defaults.streamingPolicyName;
        }

        public Builder assetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder defaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
            this.defaultContentKeyPolicyName = Objects.requireNonNull(defaultContentKeyPolicyName);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder streamingLocatorId(String streamingLocatorId) {
            this.streamingLocatorId = Objects.requireNonNull(streamingLocatorId);
            return this;
        }
        public Builder streamingPolicyName(String streamingPolicyName) {
            this.streamingPolicyName = Objects.requireNonNull(streamingPolicyName);
            return this;
        }        public AssetStreamingLocatorResponse build() {
            return new AssetStreamingLocatorResponse(assetName, created, defaultContentKeyPolicyName, endTime, name, startTime, streamingLocatorId, streamingPolicyName);
        }
    }
}
