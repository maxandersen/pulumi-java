// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the private GKE cluster in a Cloud Composer environment.
 * 
 */
public final class PrivateClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateClusterConfigArgs Empty = new PrivateClusterConfigArgs();

    /**
     * Optional. If `true`, access to the public endpoint of the GKE cluster is denied.
     * 
     */
    @Import(name="enablePrivateEndpoint")
      private final @Nullable Output<Boolean> enablePrivateEndpoint;

    public Output<Boolean> enablePrivateEndpoint() {
        return this.enablePrivateEndpoint == null ? Codegen.empty() : this.enablePrivateEndpoint;
    }

    /**
     * Optional. The CIDR block from which IPv4 range for GKE master will be reserved. If left blank, the default value of '172.16.0.0/23' is used.
     * 
     */
    @Import(name="masterIpv4CidrBlock")
      private final @Nullable Output<String> masterIpv4CidrBlock;

    public Output<String> masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock == null ? Codegen.empty() : this.masterIpv4CidrBlock;
    }

    public PrivateClusterConfigArgs(
        @Nullable Output<Boolean> enablePrivateEndpoint,
        @Nullable Output<String> masterIpv4CidrBlock) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
    }

    private PrivateClusterConfigArgs() {
        this.enablePrivateEndpoint = Codegen.empty();
        this.masterIpv4CidrBlock = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enablePrivateEndpoint;
        private @Nullable Output<String> masterIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
        }

        public Builder enablePrivateEndpoint(@Nullable Output<Boolean> enablePrivateEndpoint) {
            this.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }
        public Builder enablePrivateEndpoint(@Nullable Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Codegen.ofNullable(enablePrivateEndpoint);
            return this;
        }
        public Builder masterIpv4CidrBlock(@Nullable Output<String> masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }
        public Builder masterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Codegen.ofNullable(masterIpv4CidrBlock);
            return this;
        }        public PrivateClusterConfigArgs build() {
            return new PrivateClusterConfigArgs(enablePrivateEndpoint, masterIpv4CidrBlock);
        }
    }
}
