// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.DeploymentPlatform;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The period during which some deployable was active in a runtime.
 * 
 */
public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> address() {
        return this.address == null ? Codegen.empty() : this.address;
    }

    /**
     * Configuration used to create this deployment.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<String> config;

    public Output<String> config() {
        return this.config == null ? Codegen.empty() : this.config;
    }

    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    @Import(name="deployTime", required=true)
      private final Output<String> deployTime;

    public Output<String> deployTime() {
        return this.deployTime;
    }

    /**
     * Platform hosting this deployment.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<DeploymentPlatform> platform;

    public Output<DeploymentPlatform> platform() {
        return this.platform == null ? Codegen.empty() : this.platform;
    }

    /**
     * End of the lifetime of this deployment.
     * 
     */
    @Import(name="undeployTime")
      private final @Nullable Output<String> undeployTime;

    public Output<String> undeployTime() {
        return this.undeployTime == null ? Codegen.empty() : this.undeployTime;
    }

    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    @Import(name="userEmail")
      private final @Nullable Output<String> userEmail;

    public Output<String> userEmail() {
        return this.userEmail == null ? Codegen.empty() : this.userEmail;
    }

    public DeploymentArgs(
        @Nullable Output<String> address,
        @Nullable Output<String> config,
        Output<String> deployTime,
        @Nullable Output<DeploymentPlatform> platform,
        @Nullable Output<String> undeployTime,
        @Nullable Output<String> userEmail) {
        this.address = address;
        this.config = config;
        this.deployTime = Objects.requireNonNull(deployTime, "expected parameter 'deployTime' to be non-null");
        this.platform = platform;
        this.undeployTime = undeployTime;
        this.userEmail = userEmail;
    }

    private DeploymentArgs() {
        this.address = Codegen.empty();
        this.config = Codegen.empty();
        this.deployTime = Codegen.empty();
        this.platform = Codegen.empty();
        this.undeployTime = Codegen.empty();
        this.userEmail = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<String> config;
        private Output<String> deployTime;
        private @Nullable Output<DeploymentPlatform> platform;
        private @Nullable Output<String> undeployTime;
        private @Nullable Output<String> userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.config = defaults.config;
    	      this.deployTime = defaults.deployTime;
    	      this.platform = defaults.platform;
    	      this.undeployTime = defaults.undeployTime;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Codegen.ofNullable(address);
            return this;
        }
        public Builder config(@Nullable Output<String> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable String config) {
            this.config = Codegen.ofNullable(config);
            return this;
        }
        public Builder deployTime(Output<String> deployTime) {
            this.deployTime = Objects.requireNonNull(deployTime);
            return this;
        }
        public Builder deployTime(String deployTime) {
            this.deployTime = Output.of(Objects.requireNonNull(deployTime));
            return this;
        }
        public Builder platform(@Nullable Output<DeploymentPlatform> platform) {
            this.platform = platform;
            return this;
        }
        public Builder platform(@Nullable DeploymentPlatform platform) {
            this.platform = Codegen.ofNullable(platform);
            return this;
        }
        public Builder undeployTime(@Nullable Output<String> undeployTime) {
            this.undeployTime = undeployTime;
            return this;
        }
        public Builder undeployTime(@Nullable String undeployTime) {
            this.undeployTime = Codegen.ofNullable(undeployTime);
            return this;
        }
        public Builder userEmail(@Nullable Output<String> userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public Builder userEmail(@Nullable String userEmail) {
            this.userEmail = Codegen.ofNullable(userEmail);
            return this;
        }        public DeploymentArgs build() {
            return new DeploymentArgs(address, config, deployTime, platform, undeployTime, userEmail);
        }
    }
}
