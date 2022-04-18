// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentOccurrenceResponse {
    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    private final String address;
    /**
     * Configuration used to create this deployment.
     * 
     */
    private final String config;
    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    private final String deployTime;
    /**
     * Platform hosting this deployment.
     * 
     */
    private final String platform;
    /**
     * Resource URI for the artifact being deployed taken from the deployable field with the same name.
     * 
     */
    private final List<String> resourceUri;
    /**
     * End of the lifetime of this deployment.
     * 
     */
    private final String undeployTime;
    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    private final String userEmail;

    @CustomType.Constructor
    private DeploymentOccurrenceResponse(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("config") String config,
        @CustomType.Parameter("deployTime") String deployTime,
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("resourceUri") List<String> resourceUri,
        @CustomType.Parameter("undeployTime") String undeployTime,
        @CustomType.Parameter("userEmail") String userEmail) {
        this.address = address;
        this.config = config;
        this.deployTime = deployTime;
        this.platform = platform;
        this.resourceUri = resourceUri;
        this.undeployTime = undeployTime;
        this.userEmail = userEmail;
    }

    /**
     * Address of the runtime element hosting this deployment.
     * 
    */
    public String address() {
        return this.address;
    }
    /**
     * Configuration used to create this deployment.
     * 
    */
    public String config() {
        return this.config;
    }
    /**
     * Beginning of the lifetime of this deployment.
     * 
    */
    public String deployTime() {
        return this.deployTime;
    }
    /**
     * Platform hosting this deployment.
     * 
    */
    public String platform() {
        return this.platform;
    }
    /**
     * Resource URI for the artifact being deployed taken from the deployable field with the same name.
     * 
    */
    public List<String> resourceUri() {
        return this.resourceUri;
    }
    /**
     * End of the lifetime of this deployment.
     * 
    */
    public String undeployTime() {
        return this.undeployTime;
    }
    /**
     * Identity of the user that triggered this deployment.
     * 
    */
    public String userEmail() {
        return this.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String config;
        private String deployTime;
        private String platform;
        private List<String> resourceUri;
        private String undeployTime;
        private String userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.config = defaults.config;
    	      this.deployTime = defaults.deployTime;
    	      this.platform = defaults.platform;
    	      this.resourceUri = defaults.resourceUri;
    	      this.undeployTime = defaults.undeployTime;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder config(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder deployTime(String deployTime) {
            this.deployTime = Objects.requireNonNull(deployTime);
            return this;
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder resourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder resourceUri(String... resourceUri) {
            return resourceUri(List.of(resourceUri));
        }
        public Builder undeployTime(String undeployTime) {
            this.undeployTime = Objects.requireNonNull(undeployTime);
            return this;
        }
        public Builder userEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }        public DeploymentOccurrenceResponse build() {
            return new DeploymentOccurrenceResponse(address, config, deployTime, platform, resourceUri, undeployTime, userEmail);
        }
    }
}
