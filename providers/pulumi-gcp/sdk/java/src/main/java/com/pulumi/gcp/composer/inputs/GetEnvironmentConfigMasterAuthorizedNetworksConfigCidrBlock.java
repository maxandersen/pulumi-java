// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock Empty = new GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock();

    @Import(name="cidrBlock", required=true)
      private final String cidrBlock;

    public String cidrBlock() {
        return this.cidrBlock;
    }

    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    public GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock(
        String cidrBlock,
        String displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock() {
        this.cidrBlock = null;
        this.displayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }        public GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock build() {
            return new GetEnvironmentConfigMasterAuthorizedNetworksConfigCidrBlock(cidrBlock, displayName);
        }
    }
}
