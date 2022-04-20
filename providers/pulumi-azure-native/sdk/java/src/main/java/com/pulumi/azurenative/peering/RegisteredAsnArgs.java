// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegisteredAsnArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegisteredAsnArgs Empty = new RegisteredAsnArgs();

    /**
     * The customer&#39;s ASN from which traffic originates.
     * 
     */
    @Import(name="asn")
      private final @Nullable Output<Integer> asn;

    public Output<Integer> asn() {
        return this.asn == null ? Codegen.empty() : this.asn;
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
      private final Output<String> peeringName;

    public Output<String> peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the ASN.
     * 
     */
    @Import(name="registeredAsnName")
      private final @Nullable Output<String> registeredAsnName;

    public Output<String> registeredAsnName() {
        return this.registeredAsnName == null ? Codegen.empty() : this.registeredAsnName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public RegisteredAsnArgs(
        @Nullable Output<Integer> asn,
        Output<String> peeringName,
        @Nullable Output<String> registeredAsnName,
        Output<String> resourceGroupName) {
        this.asn = asn;
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.registeredAsnName = registeredAsnName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private RegisteredAsnArgs() {
        this.asn = Codegen.empty();
        this.peeringName = Codegen.empty();
        this.registeredAsnName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegisteredAsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> asn;
        private Output<String> peeringName;
        private @Nullable Output<String> registeredAsnName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegisteredAsnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.peeringName = defaults.peeringName;
    	      this.registeredAsnName = defaults.registeredAsnName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder asn(@Nullable Output<Integer> asn) {
            this.asn = asn;
            return this;
        }
        public Builder asn(@Nullable Integer asn) {
            this.asn = Codegen.ofNullable(asn);
            return this;
        }
        public Builder peeringName(Output<String> peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }
        public Builder peeringName(String peeringName) {
            this.peeringName = Output.of(Objects.requireNonNull(peeringName));
            return this;
        }
        public Builder registeredAsnName(@Nullable Output<String> registeredAsnName) {
            this.registeredAsnName = registeredAsnName;
            return this;
        }
        public Builder registeredAsnName(@Nullable String registeredAsnName) {
            this.registeredAsnName = Codegen.ofNullable(registeredAsnName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public RegisteredAsnArgs build() {
            return new RegisteredAsnArgs(asn, peeringName, registeredAsnName, resourceGroupName);
        }
    }
}
